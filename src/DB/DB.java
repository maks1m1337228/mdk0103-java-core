package DB;

import java.sql.*;


public class DB {
    private final String host = "localhost";
    private final String port = "5432";
    private final String db_name = "zxc";
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

    public void CreateTable(String tableName, String firstColumn, String secondColumn, String thirdColumn) throws SQLException, ClassNotFoundException {
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " " + "(" + firstColumn + ", " + secondColumn + ", " + thirdColumn + ")";
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public void CreateTable(String tableName, String firstColumn, String secondColumn, String thirdColumn, String fourthColumn) throws SQLException, ClassNotFoundException {
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " " + "(" + firstColumn + ", " + secondColumn + ", " + thirdColumn + ", " + fourthColumn + ")";
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public void CreateTable(String tableName, String firstColumn, String secondColumn, String thirdColumn, String fourthColumn, String fifthColumn) throws SQLException, ClassNotFoundException {
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " " + "(" + firstColumn + ", " + secondColumn + ", " + thirdColumn + ", " + fourthColumn + ", " + fifthColumn + ")";
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public void InsertTable(String tableName, String firstInsert, String secondInsert, String thirdInsert) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO " + tableName + " VALUES " + "(" + "'" + firstInsert + "'" + ", " + "'" + secondInsert + "'" + ", " + "'" + thirdInsert + "'" + ")";
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public void InsertTable(String tableName, String firstInsert, String secondInsert, String thirdInsert, String fourthInsert) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO " + tableName + " VALUES " + "(" + "'" + firstInsert + "'" + ", " + "'" + secondInsert + "'" + ", " + "'" + thirdInsert + "'" + ", " + "'" + fourthInsert + "'" + ")";
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public void InsertTable5(String tableName, String firstInsert, String secondInsert, String thirdInsert, String fourthInsert, String fifthInsert) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO " + tableName + " VALUES " + "(" + "'" + firstInsert + "'" + ", " + "'" + secondInsert + "'" + ", " + "'" + thirdInsert + "'" + ", " + "'" + fourthInsert + "'" + ", " + "'" + fifthInsert + "'" + ")";
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public void SelectFromTable(String tableName) throws SQLException, ClassNotFoundException {
        Statement statement = getDBConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);
        while (resultSet.next()) {
            int id1 = resultSet.getInt(1);
            String text1 = resultSet.getString(2);
            String text2 = resultSet.getString(3);
            System.out.printf("%d. %s. %s. \n", id1, text1, text2);

        }
    }
    

    public void DeleteFromTable(String tableName) throws SQLException, ClassNotFoundException {
        String sql = "DROP TABLE " + tableName;
        Statement statement = getDBConnection().createStatement();
        statement.executeUpdate(sql);
    }







}
