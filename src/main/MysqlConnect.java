/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Joni Karvonen
 */
public class MysqlConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/for_java?autoReconnect=true&useSSL=false", "john_doe", "example");
            return conn;
        }
    catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
    }
}
