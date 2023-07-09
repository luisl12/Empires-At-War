# -*- coding: utf-8 -*-
"""
empires_at_war.domain.entities.world
-------

This module provides the code for the world entity.
"""

class World:

    def __init__(self, uuid, name, empires) -> None:
        self.__uuid = uuid
        self.__name = name
        self.__empires = empires

    @property
    def uuid(self):
        return self.__uuid

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, value):
        self.__name = value

    @property
    def empires(self):
        return self.__empires

    def __repr__(self) -> str:
        txt = "<World(name={})>"
        return txt.format(self.__name) 
