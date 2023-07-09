# -*- coding: utf-8 -*-
"""
driver_profile_api.dataaccess.repositories.client_repository
-------

This module provides the client repository.
"""

# packages
from sqlalchemy.orm import Session
from sqlalchemy.exc import SQLAlchemyError
# entities
from ...domain.entities.world import World
# models
from ..models.world import World as WorldModel

class WorldRepository:
    """
    World Repository
    """

    def __init__(self, engine) -> None:
        """
        World repository constructor

        Args:
            engine (DB Engine): DB Engine

        """
        self.engine = engine

    def create(self, world) -> None:
        """Creates new world

        Args:
            world (entities.world.World): World
        """
        with Session(self.engine) as session:
            try:
                # TODO: Create empire when create world
                new_world = WorldModel(uuid=world.uuid, name=world.name)
                session.add(new_world)
                session.commit()
            except SQLAlchemyError as err:     
                session.rollback()

    def read(self, uuid) -> World:
        """_summary_

        Args:
            uuid (str): World uuid

        Returns:
            entities.world.World: World entity
        """
        world = None
        with Session(self.engine) as session:
            world_db = session.query(self.model) \
                .filter_by(uuid=uuid).first() 
            if world_db:
                world = World(
                    uuid=world_db.uuid, 
                    name=world_db.name, 
                    empires=world_db.empires
                )
        return world
