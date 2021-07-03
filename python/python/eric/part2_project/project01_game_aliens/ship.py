# coding=utf-8
# @File  : ship
# @Author: aojie654
# @Date  : 18-6-10 下午3:10
# @Desc  : Ship

import pygame as pg
from pygame.sprite import Sprite


class Ship(Sprite):
    def __init__(self, ai_settings, screen):
        """init ship and set the original position"""
        super().__init__()
        self.ai_settings = ai_settings
        self.screen = screen
        # load ship and get the rectangle around it
        self.image = pg.image.load("./images/ship.bmp")
        self.rect = self.image.get_rect()
        self.screen_rect = screen.get_rect()
        # Set every ship at bottom center of screen
        self.rect.centerx = self.screen_rect.centerx
        self.rect.bottom = self.screen_rect.bottom
        # In center stores number
        self.center = float(self.rect.centerx)
        # Moving Flag
        self.moving_right = False
        self.moving_left = False

    def update(self):
        """Set position by moving_flag"""
        # update value of center but not rect
        if self.moving_right and self.rect.right < self.screen_rect.right:
            self.center += self.ai_settings.ship_speed_factor
        if self.moving_left and self.rect.left > 0:
            self.center -= self.ai_settings.ship_speed_factor
        # Update rect by self.centerx
        self.rect.centerx = self.center

    def blitme(self):
        """Draw the ship"""
        self.screen.blit(self.image, self.rect)

    def center_ship(self):
        """Make ship at center bottom"""
        self.center = self.screen_rect.centerx
