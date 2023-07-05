# -*- coding: utf-8 -*-
"""
empires_at_war.domain.entities.empire
-------

This module provides the code for the empire entity.
"""

# buildings
from .headquarter import Headquarter
from .forest import Forest
from .clay_pit import ClayPit
from .iron_mine import IronMine

class Empire:

    def __init__(self, name) -> None:
        self.__name = name
        self.__buildings = [Headquarter(), Forest(), ClayPit(), IronMine()]
        self.__troops = {}

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, value):
        self.__name = value

    @property
    def buildings(self):
        return self.__buildings
    
    @property
    def troops(self):
        return self.__troops

    def __repr__(self) -> str:
        txt = "<Empire(name={})>"
        return txt.format(self.__name) 
