package Company;

import java.sql.*;

public class DB {
    private final String host = "localhost";
    private final String port = "5432";
    private final String db_name = "company";
    private final String login = "postgres";
    private final String password = "";

    private Connection dbConn;

    private Connection getDBConnection() throws ClassNotFoundException, SQLException {
        String str = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        Class.forName("org.postgresql.Driver");
        dbConn = DriverManager.getConnection(str, login, password);
        return dbConn;
    }

    public void isConnection() throws SQLException, ClassNotFoundException {
        dbConn = getDBConnection();
        System.out.println(dbConn.isValid(1000));
    }

    public void selectPartners() throws SQLException, ClassNotFoundException {
        Statement statement = getDBConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM partners");
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String contact = resultSet.getString(3);
            System.out.printf("%d %s %s \n", id, name, contact);

        }
    }

    public void insertPartners(String firstInsert, String secondInsert, String thirdInsert) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO partners VALUES " + "(" + "'" + firstInsert + "'" + ", " + "'" + secondInsert + "'" + ", " + "'" + thirdInsert + "'" + ")";
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public void UpdatePartners(String id, String newName, String newContact) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE partners SET partner_name = " + "'" + newName + "'" + ", contact = " + "'" + newContact + "'" +" WHERE partner_id = " + id;
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);

    }

    public void selectJoin() throws SQLException, ClassNotFoundException {
        Statement statement = getDBConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT deliveries.delivery_id, deliveries.delivery_date, deliveries.delivery_status, partners.partner_name FROM deliveries JOIN partners on deliveries.partner_id = partners.partner_id;\n");
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String date = String.valueOf(resultSet.getDate(2));
            String status = String.valueOf(resultSet.getBoolean(3));
            String name = resultSet.getString(4);
            System.out.printf("%d %s %s %s\n", id, date, status, name);

        }
    }
}
