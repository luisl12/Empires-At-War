package dataaccess.db.connectors;

import java.sql.*;

public class MariaDBConnector {

    private Connection connection;
    private PreparedStatement statement;
    private ResultSet resultSet;

    // TODO: Save DB credencials somewhere safe
    private final String URL = "jdbc:mariadb://localhost:3306/empires_at_war";
    private final String USERNAME = "root";
    private final String PASSWORD = "mariadb";

    public MariaDBConnector() {
        try {
            this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String query, Object... params) throws SQLException {
        this.statement = this.connection.prepareStatement(query);
        for(int i = 0; i < params.length; i++){
            this.statement.setObject(i+1, params[i]);
        }
        System.out.println(statement);
        this.resultSet = this.statement.executeQuery();
        return this.resultSet;
    }

    public int executeUpdate(String query, Object... params) throws SQLException {
        this.statement = this.connection.prepareStatement(query);
        for(int i = 0; i < params.length; i++){
            this.statement.setObject(i+1, params[i]);
        }
        return this.statement.executeUpdate();
    }

    public void closeResultSet(){
        try {
            if (this.resultSet != null && !this.resultSet.isClosed()) {
                this.resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeStatement(){
        try {
            if (this.statement != null && !this.statement.isClosed()) {
                this.statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MariaDBConnector connector = new MariaDBConnector();
        // entidade = null
        try {
            String query = "SELECT * FROM world WHERE id=?";
            try (ResultSet resultSet = connector.executeQuery(query, 4)) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    // criar entidade
                    System.out.println(name);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connector.closeResultSet();
            connector.closeStatement();
            connector.closeConnection();
        }
    }
}

