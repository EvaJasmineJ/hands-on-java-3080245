package bank;

import java.sql.Connection;
import java.sql.DriverManager;

// create method to connect to database and read and write from it
  public class DataSource {
  //create static method called Connect, which will return the database connection
  public static Connection connect() { //declare the path to our database file
    String db_file = "jdbc:sqlite:resources/bank.db";
    Connection connection = DriverManager.getConnection(db_file); // declare the connection object
  }
}
