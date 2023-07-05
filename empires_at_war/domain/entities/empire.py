# -*- coding: utf-8 -*-
"""
empires_at_war.domain.entities.empire
-------

This module provides the code for the entity empire.
"""

class Empire:

    def __init__(self, name) -> None:
        self.__name = name
        self.__buildings = []

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, value):
        self._name = value

    def __repr__(self) -> str:
        txt = "<Empire(name={})>"
        return txt.format(self.__name) 
