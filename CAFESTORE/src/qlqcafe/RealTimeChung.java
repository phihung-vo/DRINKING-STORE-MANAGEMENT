/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlqcafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hungh
 */
public class RealTimeChung {
    
    public static String realtimeLoadSlBanTrong(){
        String slBan = "0";
        Connection cn = ConnectDB.SQLConnect();
        String sql = "SELECT COUNT(MABAN) AS SLBAN FROM BAN WHERE TRANGTHAIRONG = '" + 1 + "'";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);               
            ResultSet rs = ps.executeQuery();             
            while(rs.next()){
                slBan = String.valueOf(rs.getInt("SLBAN"));                
            }
            ps.close();
            rs.close();
            cn.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return slBan;
    }
    
    public static void realtimeResetDatBanCheckInSau30p(){        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        
        Date sysDate = new Date();
        Date dbDate;
        
        String dbDateStr, id;
        int slBan;
        String sql = "SELECT IDDATBAN, THOIGIANDEN, SOLUONGBAN FROM DATBAN WHERE CONVERT(VARCHAR, THOIGIANDEN, 23) = CONVERT(VARCHAR, GETDATE(), 23) AND TRANGTHAIDEN = 0";
        try{
            Connection cn = qlqcafe.ConnectDB.SQLConnect();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){                
                dbDateStr = rs.getString("THOIGIANDEN");
                dbDate = sdf.parse(dbDateStr);
                if(dbDate.getTime() + 1800000 <= sysDate.getTime()){                    
                    id = rs.getString("IDDATBAN");
                    slBan = rs.getInt("SOLUONGBAN");
                    ConnectDB.queryUpdate("UPDATE DATBAN SET HOPLE = 0 WHERE IDDATBAN = '" +id+ "'");
                    ConnectDB.queryUpdate("UPDATE BAN SET TRANGTHAIRONG = 1 WHERE MABAN IN "
                                        + "(SELECT TOP (ISNULL("+slBan+",0)) MABAN FROM BAN WHERE TRANGTHAIRONG = 0 ORDER BY NEWID())");
                }
            }
        }catch(SQLException | ParseException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
