# -*- coding: utf-8 -*-
"""
empires_at_war.domain.entities.building
-------

This module provides the code for the building entity.
"""

class Building:

    def __init__(self, name) -> None:
        self.__name = name
        self.__level = 0

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, value):
        self.__name = value

    @property
    def level(self):
        return self.__level
    
    @level.setter
    def level(self, value):
        self.__level = value

    def __repr__(self) -> str:
        txt = "<Building(name={}, level={})>"
        return txt.format(self.__name, self.__level) 
