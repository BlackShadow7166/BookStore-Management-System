/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author usama
 */
public class ConClass {
 private static Connection connection = null; 
  
  public static Connection connectDB(){
    try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        connection = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStore_DB","admin1" ,"admin1");
        return connection;
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.print(e);
        return null;
    }
}
}
