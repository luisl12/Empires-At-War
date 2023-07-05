# -*- coding: utf-8 -*-
"""
empires_at_war.domain.entities.iron_mine
-------

This module provides the code for the iron mine entity.
"""

# building
from .building import Building

class IronMine(Building):
    """Iron Mine building

    Args:
        Building (Building): Building object
    """

    def __init__(self) -> None:
        super().__init__("Iron Mine")
        self.__production_rate = self.level * 50

    @property
    def production_rate(self):
        return self.__production_rate
    
    @Building.level.setter
    def level(self, value):
        Building.level.fset(self, value)
        self.__production_rate = self.level * 50

    def __repr__(self) -> str:
        return super().__repr__()
