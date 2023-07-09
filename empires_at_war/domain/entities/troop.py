# -*- coding: utf-8 -*-
"""
empires_at_war.domain.entities.troops.troop
-------

This module provides the code for the troop entity.
"""

class Troop:
    """Troop
    """

    def __init__(self, name, attack, defense) -> None:
        self.__name = name
        self.__attack = attack
        self.__defense = defense

    @property
    def name(self):
        return self.__name

    @property
    def attack(self):
        return self.__attack
    
    @property
    def defense(self):
        return self.__defense

    def __repr__(self) -> str:
        txt = "<Troop(name={})>"
        return txt.format(self.__name) 
