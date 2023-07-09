# -*- coding: utf-8 -*-
"""
empires_at_war.data_access.models.empire
-------

This module provides the code for the empire model.
"""

# packages
from sqlalchemy_utils import UUIDType
from sqlalchemy import (
    Column, ForeignKey, String
)
import uuid
# base
from base import Base


class Empire(Base):
    """
    Empire ORM Model

    Attributes
    ----------
    uuid: UUID <CHAR>
        Web ID of the empire (primary key).
    name: String
        Empire name.
    world_uuid: UUID <CHAR>
        Web ID of the respective world (foreign key).
    """

    __tablename__ = 'empire'

    # attributes
    uuid = Column(
        UUIDType(binary=False),
        unique=True,
        nullable=False,
        default=uuid.uuid4,
        primary_key=True
    )
    name = Column(String(40), unique=True, nullable=False)
    world_uuid = Column(UUIDType(binary=False), ForeignKey('world.uuid'))

    def __repr__(self):
        txt = "<World(uuid={}, name={})>"
        return txt.format(self.uuid, self.name)