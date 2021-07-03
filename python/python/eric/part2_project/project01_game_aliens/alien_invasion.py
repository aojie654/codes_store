# coding=utf-8
# @File  : alien_invasion
# @Author: aojie654
# @Date  : 18-6-10 下午2:34
# @Desc  : Alie Invasion

import pygame as pg
from pygame.sprite import Group
from game_stats import GameStats
import game_functions as gf
from settings import Settings
from ship import Ship
from button import Button
from scoreboard import Scoreboard


def run_game():
    """init game and create a object named screen"""
    pg.init()
    ai_settings = Settings()
    screen = pg.display.set_mode((ai_settings.screen_width, ai_settings.screen_height))
    pg.display.set_caption("Alien Invasion")

    # Create Play Button
    play_button = Button(ai_settings, screen, "Play")

    # Create a object to count game info and scoreboard
    stats = GameStats(ai_settings)
    sb = Scoreboard(ai_settings, screen, stats)

    # Create a ship
    ship = Ship(ai_settings, screen)

    # Create a group to manage alien
    aliens = Group()

    # Create a group to manage bullet
    bullets = Group()

    # Create alien group
    gf.create_fleet(ai_settings, screen, ship, aliens)

    """start game with a infinity loop"""
    while True:
        gf.check_events(ai_settings, screen, stats, sb, play_button, ship, aliens, bullets)
        if stats.game_active:
            ship.update()
            gf.update_bullets(ai_settings, screen, stats, sb, ship, aliens, bullets)
            gf.update_aliens(ai_settings, screen, stats, sb, ship, aliens, bullets)
        gf.update_screen(ai_settings, screen, stats, sb, ship, aliens, bullets, play_button)


run_game()
