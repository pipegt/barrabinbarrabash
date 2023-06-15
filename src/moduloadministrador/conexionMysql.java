package moduloadministrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class conexionMysql {
    private static final String DB_URL = "jdbc:mysql://localhost:3307/moduloadministrador";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private Connection connection;

    public conexionMysql() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/moduloadministrador", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String query, Object... params) {
        ResultSet resultSet = null;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            setStatementParameters(statement, params);
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public int executeUpdate(String query, Object... params) {
        int rowsAffected = 0;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            setStatementParameters(statement, params);
            rowsAffected = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

    private void setStatementParameters(PreparedStatement statement, Object... params) throws SQLException {
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }
        }
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
