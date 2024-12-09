package database;
//Use Mysql connector jar : https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.3.0

import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

  public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, SQLException {


      //1) Create a connection //username:root ,password : root
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");

      //2) Create statement/Query
      Statement stmt = con.createStatement();

      String s = "select employee_id, first_name, lastname from employees";

      //3,4) Execute statement/Query & Store data in resultset
      ResultSet rs = stmt.executeQuery(s);

      while (rs.next()) {
          int eid = rs.getInt("EMPLOYEE_ID");
          String fname = rs.getString("FIRST_NAME");
          String lname = rs.getString("LAST_NAME");

          System.out.println(eid + " " + fname + " " + lname);

      }



  }




}