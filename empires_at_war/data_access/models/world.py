# -*- coding: utf-8 -*-
"""
empires_at_war.data_access.models.world
-------

This module provides the code for the world model.
"""

# packages
from sqlalchemy_utils import UUIDType
from sqlalchemy import Column, String
from sqlalchemy.orm import relationship
import uuid
# base
from base import Base


class World(Base):
    """
    World ORM Model

    Attributes
    ----------
    uuid: UUID <CHAR>
        Web ID of the world (primary key).
    name: String
        World name.

    Relationships
    ----------
    empires: Empire
        List of associated empires.
    """

    __tablename__ = 'world'

    # attributes
    uuid = Column(
        UUIDType(binary=False),
        unique=True,
        nullable=False,
        default=uuid.uuid4,
        primary_key=True
    )
    name = Column(String(10), unique=True, nullable=False)

    # relationships
    empires = relationship('Empire', backref='world')

    def __repr__(self):
        txt = "<World(uuid={}, name={})>"
        return txt.format(self.uuid, self.name)