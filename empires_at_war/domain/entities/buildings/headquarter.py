# -*- coding: utf-8 -*-
"""
empires_at_war.domain.entities.buildings.headquarter
-------

This module provides the code for the headquarter entity.
"""

# building
from .building import Building

class Headquarter(Building):
    """Headquarter building

    Args:
        Building (Building): Building object
    """

    def __init__(self) -> None:
        super().__init__("Headquarter")

    def __repr__(self) -> str:
        return super().__repr__()
