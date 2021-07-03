# coding=utf-8
# @File  : game_functions
# @Author: aojie654
# @Date  : 18-6-10 下午3:24
# @Desc  : Game Functions

import sys
import pygame as pg
from bullet import Bullet
from alien import Alien
from time import sleep


def check_keydown_events(event, ai_settings, screen, ship, bullets):
    """Press down"""
    if event.key == pg.K_RIGHT:
        # Make ship move right
        ship.moving_right = True
    elif event.key == pg.K_LEFT:
        # Make ship move left
        ship.moving_left = True
    elif event.key == pg.K_SPACE:
        fire_bullet(ai_settings, screen, ship, bullets)
    elif event.key == pg.K_q:
        sys.exit()


def check_keyup_events(event, ship):
    """Key up"""
    if event.key == pg.K_RIGHT:
        ship.moving_right = False
    elif event.key == pg.K_LEFT:
        ship.moving_left = False


def check_play_button(ai_settings, screen, stats, sb, play_button, ship, aliens, bullets, mouse_x, mouse_y):
    """Start game after player pressed button"""
    button_clicked = play_button.rect.collidepoint(mouse_x, mouse_y)
    if button_clicked and not stats.game_active:
        # Reset game settings
        ai_settings.initialize_dynamic_settings()
        # Hide mouse
        pg.mouse.set_visible(False)

        # Reset Game count info
        stats.reset_stats()
        stats.game_active = True

        # Reset score image
        sb.prep_score()
        sb.prep_high_score()
        sb.prep_level()
        sb.prep_ships()

        # Clean group aliens and group bullets
        aliens.empty()
        bullets.empty()

        # Create a new group aliens and center ship
        create_fleet(ai_settings, screen, ship, aliens)
        ship.center_ship()


def check_events(ai_settings, screen, stats, sb, play_button, ship, aliens, bullets):
    # Oversee the keyboard and mouse event
    for event in pg.event.get():
        if event.type == pg.QUIT:
            sys.exit()
        elif event.type == pg.KEYDOWN:
            check_keydown_events(event, ai_settings, screen, ship, bullets)
        elif event.type == pg.KEYUP:
            check_keyup_events(event, ship)
        elif event.type == pg.MOUSEBUTTONDOWN:
            mouse_x, mouse_y = pg.mouse.get_pos()
            check_play_button(ai_settings, screen, stats, sb, play_button, ship, aliens, bullets, mouse_x, mouse_y)


def update_screen(ai_settings, screen, stats, sb, ship, aliens, bullets, play_button):
    """Update Screen"""
    # Every loop make screen draw again
    screen.fill(ai_settings.bg_color)

    # Redraw all bullet after ship and alien
    for bullet in bullets.sprites():
        bullet.draw_bullet()
    ship.blitme()
    aliens.draw(screen)

    # Display score
    sb.show_score()

    # If stats of game is deactivate then draw button
    if not stats.game_active:
        play_button.draw_button()

    # Make the recent screen visible
    pg.display.flip()


def update_bullets(ai_settings, screen, stats, sb, ship, aliens, bullets):
    """Update bullets position and remove non-visible bullet"""
    # update bullet position
    bullets.update()
    # delete the non-visible bullet
    for bullet in bullets.copy():
        if bullet.rect.bottom <= 0:
            bullets.remove(bullet)
    # to check the bullet delete or not
    # print(len(bullets))
    check_bullet_alien_collisions(ai_settings, screen, stats, sb, ship, aliens, bullets)


def check_bullet_alien_collisions(ai_settings, screen, stats, sb, ship, aliens, bullets):
    """ Check that if the bullet hit the alien or not"""
    # If true, remove bullet and alienc
    # collisions = pg.sprite.groupcollide(bullets, aliens, False, True)
    collisions = pg.sprite.groupcollide(bullets, aliens, True, True)
    if collisions:
        for aliens in collisions.values():
            stats.score += ai_settings.alien_points * len(aliens)
            sb.prep_score()
        check_high_score(stats, sb)

    if len(aliens) == 0:
        # remove current bullet and new an alien group then level up
        bullets.empty()
        ai_settings.increase_speed()
        stats.level += 1
        sb.prep_level()
        create_fleet(ai_settings, screen, ship, aliens)


def check_fleet_edges(ai_settings, aliens):
    """If the alien at edge do the action"""
    for alien in aliens.sprites():
        if alien.check_edges():
            change_fleet_direction(ai_settings, aliens)
            break


def change_fleet_direction(ai_settings, aliens):
    """Move alien group down and change the direction"""
    for alien in aliens.sprites():
        alien.rect.y += ai_settings.fleet_drop_speed
    ai_settings.fleet_direction *= -1


def ship_hit(ai_settings, screen, stats, sb, ship, aliens, bullets):
    """Ship response to the hit from alien"""

    if stats.ship_left > 0:
        # make ship_left -=1
        stats.ship_left -= 1

        # update ships
        sb.prep_ships()

        # clean aliens group and bullets
        aliens.empty()
        bullets.empty()

        # create new aliens group and put ship at center bottom
        create_fleet(ai_settings, screen, ship, aliens)
        ship.center_ship()

        # pause
        sleep(0.5)
    else:
        stats.game_active = False
        pg.mouse.set_visible(True)


def check_aliens_bottom(ai_settings, screen, stats, sb, ship, aliens, bullets):
    """Check the alien arrive to bottom or not"""
    screen_rect = screen.get_rect()
    for alien in aliens.sprites():
        if alien.rect.bottom >= screen_rect.bottom - ship.rect.height:
            # Do action like ship hit by alien
            ship_hit(ai_settings, screen, stats, sb, ship, aliens, bullets)
            break


def update_aliens(ai_settings, screen, stats, sb, ship, aliens, bullets):
    """Check that is there has alien position at edges and update position of alien group"""
    check_fleet_edges(ai_settings, aliens)
    aliens.update()
    # check hit between ship and alien
    if pg.sprite.spritecollideany(ship, aliens):
        ship_hit(ai_settings, screen, stats, sb, ship, aliens, bullets)
    # Check the alien arrive to bottom or not
    check_aliens_bottom(ai_settings, screen, stats, sb, ship, aliens, bullets)


def fire_bullet(ai_settings, screen, ship, bullets):
    """If the bullets doesn't equals limit, fire one more"""
    # Create a bullet and add to group bullets
    if len(bullets) < ai_settings.bullets_allowed:
        new_bullet = Bullet(ai_settings, screen, ship)
        bullets.add(new_bullet)


def get_number_aliens_x(ai_settings, alien_width):
    available_space_x = ai_settings.screen_width - 2 * alien_width
    number_aliens_x = int(available_space_x / (2 * alien_width))
    return number_aliens_x


def get_number_rows(ai_settings, ship_height, alien_height):
    """Calculate how many alien does screen could contain"""
    available_space_y = (ai_settings.screen_height - (3 * alien_height) - ship_height)
    number_rows = int(available_space_y / (2 * alien_height))
    return number_rows


def create_alien(ai_settings, screen, aliens, alien_number, row_number):
    # Create one aline and add it to current line
    alien = Alien(ai_settings, screen)
    alien_width = alien.rect.width
    alien.x = alien_width + 2 * alien_width * alien_number
    alien.rect.x = alien.x
    alien.rect.y = alien.rect.height * (2 * row_number + 1)
    aliens.add(alien)


def create_fleet(ai_settings, screen, ship, aliens):
    """Create Alien Group"""
    # Create an alien and calculate how many aliens can the line contains.
    # Space of aliens is width of alien.
    alien = Alien(ai_settings, screen)
    number_aliens_x = get_number_aliens_x(ai_settings, alien.rect.width)
    number_rows = get_number_rows(ai_settings, ship.rect.height, alien.rect.height)
    # Create aliens group
    for row_number in range(number_rows):
        for alien_number in range(number_aliens_x):
            create_alien(ai_settings, screen, aliens, alien_number, row_number)


def check_high_score(stats, sb):
    """Check the high score newed or not"""
    if stats.score > stats.high_score:
        stats.high_score = stats.score
        sb.prep_high_score()
