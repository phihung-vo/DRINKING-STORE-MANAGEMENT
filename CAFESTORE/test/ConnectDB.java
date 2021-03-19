/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
/**
 *
 * @author Nhom 40
 */
public class ConnectDB {
    public static Connection SQLConnect(){
        Connection cn = null;
        String user = "sa";
        String pass = "123";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=DangNhap";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(url, user, pass);
            if(cn!=null){
                System.out.println("Connect DB Successfully");
            }
        } catch (ClassNotFoundException|SQLException ex) {
            System.out.println("Error while connecting DB: " + ex.getMessage());
        }
        return cn;
    } 
}
