# -*- coding: utf-8 -*-
"""
Empires-At-War.run
-------

This module runs the game (Entry point for the game).
"""

# packages
# empire
from domain.entities import World
from data_access.repositories import WordRepository

if __name__ == "__main__":

    # test db
    world = World('bb4b6c98-1812-42a4-9920-72ed23df42ae', "World 1")
    rep = WordRepository()
    # rep.create_world(world)
    # w = rep.get_world('bb4b6c98-1812-42a4-9920-72ed23df42ae')
    # print(w)
    # rep.update_world(world)
    # rep.delete_world('bb4b6c98-1812-42a4-9920-72ed23df42a')