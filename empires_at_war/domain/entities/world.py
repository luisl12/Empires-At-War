# -*- coding: utf-8 -*-
"""
empires_at_war.domain.entities.world
-------

This module provides the code for the world entity.
"""

class World:
    def __init__(self, uuid, name):
        self.__id = None
        self.__uuid = uuid
        self.__name = name

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
    def id(self):
        return self.__id

    @id.setter
    def id(self, value):
        self.__id = value

    def __repr__(self):
        txt = "<World(uuid={}, name={})>"
        return txt.format(self.__uuid, self.__name) 
