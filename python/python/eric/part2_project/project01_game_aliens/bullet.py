# coding=utf-8
# @File  : bullet
# @Author: aojie654
# @Date  : 18-6-10 下午4:15
# @Desc  : Bullet
import pygame as pg
from pygame.sprite import Sprite


class Bullet(Sprite):
    """A class to manage bullet"""

    def __init__(self, ai_settings, screen, ship):
        """Create a bullet object at position where the ship is"""
        super(Bullet, self).__init__()
        self.screen = screen
        # Set a rectangle at position (0,0), then set the correct
        self.rect = pg.Rect(0, 0, ai_settings.bullet_width, ai_settings.bullet_height)
        self.rect.centerx = ship.rect.centerx
        self.rect.top = ship.rect.top
        # Store bullet position with decimal
        self.y = float(self.rect.y)
        # Set color and speed
        self.color = ai_settings.bullet_color
        self.speed_factor = ai_settings.bullet_speed_factor

    def update(self):
        """Move up"""
        # update position value
        self.y -= self.speed_factor
        # update rect position
        self.rect.y = self.y

    def draw_bullet(self):
        """Draw bullet"""
        pg.draw.rect(self.screen, self.color, self.rect)
