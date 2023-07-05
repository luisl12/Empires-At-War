# -*- coding: utf-8 -*-
"""
Empires-At-War.run
-------

This module runs the game.
"""

# packages
# empire
from empires_at_war.domain.entities import Empire

if __name__ == "__main__":

    empire = Empire("Rome")
    print(empire)
    print(empire.name)
    print(empire.buildings)
    print(empire.buildings[1].name)
    print(empire.buildings[1].level)
    print(empire.buildings[1].production_rate)
    empire.buildings[1].level = 1
    print(empire.buildings[1].level)
    print(empire.buildings[1].production_rate)