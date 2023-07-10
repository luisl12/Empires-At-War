# -*- coding: utf-8 -*-
"""
empires_at_war.data_access.db.connectors.mariadb_connector
-------

This module defines MariaDB database connection class.
"""

# packages
import mysql.connector

class MariaDBConnector:
    def __init__(self, host, port, user, password, database):
        self.__host = host
        self.__port = port
        self.__user = user
        self.__password = password
        self.__database = database
        self.__connection = None

    def __connect(self):
        try:
            self.__connection = mysql.connector.connect(
                host=self.__host,
                port=self.__port,
                user=self.__user,
                password=self.__password,
                database=self.__database
            )
            print("Connected to MariaDB")
        except mysql.connector.Error as e:
            print(f"Error connecting to MariaDB: {str(e)}")
            raise

    def execute_query(self, query, read=True, values=None):
        if not self.__connection:
            self.__connect()
        try:
            cursor = self.__connection.cursor()
            if values:
                cursor.execute(query, values)
            else:
                cursor.execute(query)
            if not read:
                self.__connection.commit()
            result = cursor.fetchall()
            cursor.close()
            return result
        except mysql.connector.Error as e:
            print(f"Error executing query: {str(e)}")
            self.__connection.rollback()
            raise

    def close(self):
        if self.__connection:
            try:
                self.__connection.close()
                print("Closed MariaDB connection")
            except mysql.connector.Error as e:
                print(f"Error closing MariaDB connection: {str(e)}")
                raise

    def __del__(self):
        self.close()

