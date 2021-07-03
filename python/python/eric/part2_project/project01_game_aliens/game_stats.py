# coding=utf-8
# @File  : game_stats
# @Author: aojie654
# @Date  : 18-6-10 下午9:10
# @Desc  : Game Stats


class GameStats():
    """Track game info"""

    def __init__(self, ai_settings):
        """init count info"""
        self.ai_settings = ai_settings
        self.reset_stats()

        # Game is deactivate when start up
        self.game_active = False

        # High score can't be reset
        self.high_score = 0

    def reset_stats(self):
        """Init game info that may change when the game running"""
        self.ship_left = self.ai_settings.ship_limit
        self.score = 0
        self.level = 1
