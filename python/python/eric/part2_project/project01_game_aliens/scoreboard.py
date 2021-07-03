# coding=utf-8
# @File  : scoreboard
# @Author: aojie654
# @Date  : 18-6-11 下午12:24
# @Desc  : Scoreboard

import pygame.font
from pygame.sprite import Group
from ship import Ship


class Scoreboard():
    """Display score info"""

    def __init__(self, ai_settings, screen, stats):
        """Init attributes of score related"""
        self.screen = screen
        self.screen_rect = screen.get_rect()
        self.ai_settings = ai_settings
        self.stats = stats

        # Display score info font
        self.text_color = (0, 0, 0)
        self.font = pygame.font.SysFont(None, 48)

        # Ready to init score and high score image
        self.prep_score()
        self.prep_high_score()
        self.prep_level()
        self.prep_ships()

    def prep_score(self):
        """Make score transformed to image"""
        rounded_score = int(round(self.stats.score, -1))
        score_str = '{:,}'.format(rounded_score)
        self.score_image = self.font.render("Score " + score_str, True, self.text_color, self.ai_settings.bg_color)

        # Put score on screen right top corner
        self.score_rect = self.score_image.get_rect()
        self.score_rect.right = self.screen_rect.right - 20
        self.score_rect.top = 20

    def show_score(self):
        """Show ship and score on screen"""
        self.screen.blit(self.score_image, self.score_rect)
        self.screen.blit(self.high_score_image, self.high_score_rect)
        self.screen.blit(self.level_image, self.level_rect)

        # Draw ships
        self.ships.draw(self.screen)

    def prep_high_score(self):
        """Make high score transformed to image"""
        high_score = int(round(self.stats.high_score, -1))
        high_score_str = "{:,}".format(high_score)
        self.high_score_image = self.font.render("High " + high_score_str, True, self.text_color,
                                                 self.ai_settings.bg_color)

        # Put high score at center top of screen
        self.high_score_rect = self.high_score_image.get_rect()
        self.high_score_rect.centerx = self.screen_rect.centerx
        self.high_score_rect.top = self.score_rect.top

    def prep_level(self):
        """Transform level to image"""
        self.level_image = self.font.render("LV " + str(self.stats.level), True, self.text_color,
                                            self.ai_settings.bg_color)

        # Put level under score
        self.level_rect = self.level_image.get_rect()
        self.level_rect.right = self.score_rect.right
        self.level_rect.top = self.score_rect.bottom + 10

    def prep_ships(self):
        """Display how many ships left"""
        self.ships = Group()
        for ship_number in range(self.stats.ship_left):
            ship = Ship(self.ai_settings, self.screen)
            ship.rect.x = 10 + ship_number * ship.rect.width
            ship.rect.y = 10
            self.ships.add(ship)
