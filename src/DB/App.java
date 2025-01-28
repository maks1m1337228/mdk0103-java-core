package DB;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       DB db = new DB();
       db.isConnection();

       //db.CreateTable4("rent", "rent_id int PRIMARY KEY", "book_name VARCHAR(50)", "rent_start VARCHAR(200)", "rent_end VARCHAR(200)");
       //db.CreateTable5("reader", "reader_id int PRIMARY KEY", "name VARCHAR(50)", "email VARCHAR(100)", "rent_id int REFERENCES rent (rent_id)", "quantity int CHECK (quantity <= 3)");
       //db.CreateTable3("publisher", "publisher_id int PRIMARY KEY", "publisher_name VARCHAR(50)", "contacts VARCHAR(300)");
       //db.CreateTable5("books", "book_id int PRIMARY KEY", "title VARCHAR(50)", "author VARCHAR(100)", "reader_id int REFERENCES reader (reader_id)", "publisher_id int REFERENCES publisher (publisher_id)");
       //db.CreateTable3("library", "lib_id int PRIMARY KEY", "lib_name VARCHAR(50)", "book_id int REFERENCES books (book_id)");

       //db.InsertTable4("rent", "1", "War and peace", "2004-10-19 10:23:54", "2004-10-22 13:03:27");
       //db.InsertTable5("reader", "1", "Vova", "vova2000@gmail.com", "1", "1");
        // db.InsertTable3("publisher", "1", "Tolstoi", "+7 777 777 7777");
        //db.InsertTable5("books", "1", "War and Peace", "Tolstoi", "1", "1");
        //db.InsertTable3("library", "1", "Alexandiyskaya", "1");


        db.SelectFromTable("publisher");



    }
}
