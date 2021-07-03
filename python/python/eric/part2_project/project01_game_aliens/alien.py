# coding=utf-8
# @File  : alien
# @Author: aojie654
# @Date  : 18-6-10 下午6:12
# @Desc  : Alien

import pygame as pg
from pygame.sprite import Sprite


class Alien(Sprite):
    """Class to express alien"""

    def __init__(self, ai_settings, screen):
        super(Alien, self).__init__()
        self.screen = screen
        self.ai_settings = ai_settings
        # Load alien image and set rect
        self.image = pg.image.load("./images/alien.bmp")
        self.rect = self.image.get_rect()
        # Every alien appears from left top corner
        self.rect.x = self.rect.width
        self.rect.y = self.rect.height
        # Store alien correct position
        self.x = float(self.rect.x)

    def blitme(self):
        """Draw alien at the position"""
        self.screen.blit(self.image, self.rect)

    def check_edges(self):
        """If aliens position at edges return True"""
        screen_rect = self.screen.get_rect()
        if self.rect.right >= screen_rect.right:
            return True
        elif self.rect.left <= 0:
            return True

    def update(self):
        """Move alien to right or left"""
        self.x += (self.ai_settings.alien_speed_factor * self.ai_settings.fleet_direction)
        self.rect.x = self.x
