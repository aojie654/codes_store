# coding=utf-8
# @File  : button
# @Author: aojie654
# @Date  : 18-6-11 上午10:13
# @Desc  : Button

import pygame as pg


class Button():
    def __init__(self, ai_settings, screen, msg):
        """initialize attributes of button"""
        self.screen = screen
        self.screen_rect = screen.get_rect()

        # Set size and other attributes of button
        self.width, self.height = 200, 50
        self.button_color = (134, 134, 134)
        self.text_color = (255, 255, 255)
        self.font = pg.font.SysFont(None, 48)

        # Create object rect of button and make it center
        self.rect = pg.Rect(0, 0, self.width, self.height)
        self.rect.center = self.screen_rect.center

        # Tag of button only need create for once
        self.prep_msg(msg)

    def prep_msg(self, msg):
        """Redering msg to image and put center it in button"""
        self.msg_image = self.font.render(msg, True, self.text_color, self.button_color)
        self.msg_image_rect = self.msg_image.get_rect()
        self.msg_image_rect.center = self.rect.center

    def draw_button(self):
        # Draw a button filled with color and draw text
        self.screen.fill(self.button_color, self.rect)
        self.screen.blit(self.msg_image, self.msg_image_rect)
