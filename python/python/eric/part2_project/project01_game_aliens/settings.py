# coding=utf-8
# @File  : settings
# @Author: aojie654
# @Date  : 18-6-10 下午2:58
# @Desc  : Settings


class Settings:
    """Storing all settings for the game Alien Invasion"""

    def __init__(self):
        """init static settings"""

        # Screen Settings
        self.screen_width = 1200
        self.screen_height = 700
        self.bg_color = (230, 230, 230)

        # Ship Settings
        self.ship_limit = 3

        # Bullet Settings
        self.bullet_width = 3
        self.bullet_height = 15
        self.bullet_color = 60, 60, 60
        self.bullets_allowed = 5

        # Alien Settings
        self.fleet_drop_speed = 10

        # How to speed-up game
        self.speedup_scale = 1.1

        # How to add alien point
        self.score_scale = 1.5

        self.initialize_dynamic_settings()

    def initialize_dynamic_settings(self):
        """ Initialize settings when speed up"""
        self.ship_speed_factor = 1.5
        self.bullet_speed_factor = 2
        self.alien_speed_factor = 1

        # value=1 to move right , value = -1 to move left
        self.fleet_direction = 1

        # Count Score
        self.alien_points = 50

    def increase_speed(self):
        """Speedup settings"""
        self.ship_speed_factor *= self.speedup_scale
        self.bullet_speed_factor *= self.speedup_scale
        self.alien_speed_factor *= self.speedup_scale

        self.alien_points = int(self.alien_points * self.score_scale)
