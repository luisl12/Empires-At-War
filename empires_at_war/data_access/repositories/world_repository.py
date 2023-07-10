# -*- coding: utf-8 -*-
"""
driver_profile_api.dataaccess.repositories.client_repository
-------

This module provides the client repository.
"""

# entities
from domain.entities.world import World
# connectors
from ..db.connectors.mariadb_connector import MariaDBConnector

class WordRepository:
    def __init__(self):
        self.__db = MariaDBConnector(
            host='localhost', 
            port=3306, 
            user='root', 
            password='mariadb', 
            database='empires_at_war'
        )

    def create_world(self, world):
        query = "INSERT INTO world (uuid, name) VALUES (%s, %s)"
        values = (world.uuid, world.name)
        self.__db.execute_query(query, False, values)

    def get_world(self, world_uuid):
        query = "SELECT * FROM world WHERE uuid = %s"
        result = self.__db.execute_query(query, True, (world_uuid,))
        print(result)
        world = None
        if result:
            world = World(result[0][1], result[0][2])
            world.id = result[0][0]
        return world

    def update_world(self, world):
        query = "UPDATE world SET name = %s WHERE uuid = %s"
        values = (world.name, world.uuid)
        self.__db.execute_query(query, False, values)

    def delete_world(self, world_uuid):
        query = "DELETE FROM world WHERE uuid = %s"
        self.__db.execute_query(query, False, (world_uuid,))

    def __del__(self):
        self.__db.close()