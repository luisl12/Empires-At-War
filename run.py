# -*- coding: utf-8 -*-
"""
Empires-At-War.run
-------

This module runs the game.
"""

# packages
# local
from empires_at_war.domain.entities import Empire

if __name__ == "__main__":

 empire = Empire("Rome")
 print(empire)
 print(empire.name)