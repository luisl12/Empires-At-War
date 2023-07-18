package dataaccess.repositories;

import dataaccess.db.connectors.MariaDBConnector;

public class WorldRepository {

    private MariaDBConnector connector;

    public WorldRepository(){
        this.connector = new MariaDBConnector();
    }


}
