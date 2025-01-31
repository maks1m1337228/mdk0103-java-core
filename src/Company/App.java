package Company;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DB db = new DB();
        db.isConnection();
        //db.insertPartners("1", "Apple", "911 apple@icloud.com");
        //db.UpdatePartners("1", "apple", "microsoft@outlook.com");
        //db.selectPartners();
        db.selectJoin();
    }
}
