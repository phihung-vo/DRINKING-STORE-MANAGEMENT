/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlqcafe;
import java.sql.*;
/**
 *
 * @author Nhom 40
 */
public class ConnectDB {
    public static Connection SQLConnect(){
        Connection cn = null;
        String user = "sa";
        String pass = "1123";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=CAFESTORE_TMP";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(url, user, pass);
            if(cn == null) System.out.println("Connect DB Unsuccessfully");
        } catch (ClassNotFoundException|SQLException ex) {
            System.out.println("Error while connecting DB: " + ex.getMessage());
            System.exit(0);
        }
        return cn;
    }
    
    public static void queryUpdate(String sql){
        try{
            Connection cn = qlqcafe.ConnectDB.SQLConnect();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            cn.close();
        }catch(SQLException ex){
//            Logger.getLogger(DatBan.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error queryUpdate() on ConnectDB: " + ex.getMessage());
        }        
    }
    
    public static String selectSQLReturnOneValue(String columnNames, String tableNames, String condition, String funcName, String className){          //for SHORT QUERIES
        String sql;
        if(condition == null) sql = "SELECT " + columnNames + " FROM " + tableNames;
        else sql = "SELECT " + columnNames + " FROM " + tableNames + " WHERE " + condition;
            
        String returnValue = null;
        try{
            Connection cn = qlqcafe.ConnectDB.SQLConnect();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) returnValue = rs.getString(columnNames);
            ps.close();
            cn.close();
        }catch(SQLException ex){
//            Logger.getLogger(DatBan.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error " + funcName + "() on class " + className + ": " + ex.getMessage());
        }
        return returnValue;
    }
    
    public static boolean selectSQLReturnTrueFalse(String sql){
        boolean tontai = false;
        try{
            Connection cn = qlqcafe.ConnectDB.SQLConnect();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) tontai = true;
            ps.close();
            cn.close();
        }catch(SQLException ex){
//            Logger.getLogger(DatBan.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error queryUpdate() on ConnectDB: " + ex.getMessage());
        }
        return tontai;
    }
}
