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
public class XuLyChung {
    public boolean checkIsNum(String numStr){
        boolean check = false;
        for(int i=0; i<numStr.length(); i++){
            if(String.valueOf(numStr.charAt(i)).matches("[0123456789]")){
                check = true;
            }else{
                return false;
            }
        }
        return check;
    }
    
    public void luuDN(String maNV, String inOrOut){
        if(inOrOut.equals("checkin")){
            String date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date());  
            try {
                Connection cn = ConnectDB.SQLConnect();
                PreparedStatement ps = cn.prepareStatement("insert into PHIENLAMVIEC(MANV,CHECKIN) values(?,?)");
                ps.setString(1, maNV);
                ps.setString(2, date);
                ps.executeUpdate();       
                ps.close();
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Error 'luuDN' checkin: " + ex.getMessage());
            }
        }
        if(inOrOut.equals("checkout")){
            String sql = "SELECT CHECKIN FROM PHIENLAMVIEC WHERE MANV = N'" + maNV + "' AND CHECKOUT IS NULL";
            String checkIn = null;
            try{
                Connection cn = ConnectDB.SQLConnect();
                PreparedStatement ps = cn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    checkIn = rs.getString("CHECKIN");
                    checkIn += "00";
                }                   
                rs.close();
                ps.close();
                cn.close();
            }catch(SQLException ex){
                System.out.println("Error 'luuDN' checkout Get_CheckIn: " + ex.getMessage());
            }            
            
            if(checkIn != null){
                String checkOut = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date());
                sql = "UPDATE PHIENLAMVIEC SET CHECKOUT = '" +checkOut+ "' WHERE MANV = '" +maNV+ "' AND CHECKIN = '" +checkIn+ "'";
                Connection cn = ConnectDB.SQLConnect();
                ConnectDB.queryUpdate(sql);
            }
        }                        
    }
    
    public void setSLBanTrongHienTaiTang(String slBan){
        String sql = "UPDATE BAN SET TRANGTHAIRONG = 1 WHERE MABAN IN " +
                    "(SELECT TOP(ISNULL(" + slBan + ",0)) MABAN FROM BAN " +
                    "WHERE TRANGTHAIRONG = 0 ORDER BY NEWID())";
        ConnectDB.queryUpdate(sql);
    }
    
    public void setSLBanTrongHienTaiGiam(String slBan){
        String sql = "UPDATE BAN SET TRANGTHAIRONG = 0 WHERE MABAN IN " +
                    "(SELECT TOP (ISNULL(" + slBan + ",0)) MABAN FROM BAN " +
                    "WHERE TRANGTHAIRONG = 1 ORDER BY NEWID())";
        ConnectDB.queryUpdate(sql);
    }
    
    public void resetLaiTatCaBanTrong(){       
        //cộng lại các số lượng bàn đã đặt
//        String sql = "UPDATE BAN SET TRANGTHAIRONG = " + 1 + " WHERE MABAN IN "
//                    +"(	SELECT DISTINCT MABAN FROM BAN WHERE TRANGTHAIRONG = "+0+")";
        String sql = "UPDATE BAN SET TRANGTHAIRONG = 1 WHERE TRANGTHAIRONG = 0";
        ConnectDB.queryUpdate(sql);                     
    }
    
    public void capNhatNgayLamViecMoi(String ngayMoi){
        String sql = "UPDATE TACVU SET NGAYLAMVIEC = '" + ngayMoi + "' WHERE ID = 1";
        ConnectDB.queryUpdate(sql);
    }
    
    public void kiemTraLanDangNhapTiepTheo(){        
        try{        
            String value = "";
            value = ConnectDB.selectSQLReturnOneValue("NGAYLAMVIEC", "TACVU", "ID = 1", "kiemTraDangNhapLanDauTienCuaNgayHomSau", "XuLyChung");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;

            if(value.equals("")) date = new Date();
            else date = sdf.parse(value);
            
            Date currenDate = new Date();
            value = sdf.format(currenDate);
            currenDate = sdf.parse(value);
            
            if(date.getTime() < currenDate.getTime()){
                capNhatNgayLamViecMoi(value);
                resetLaiTatCaBanTrong();
            }
            if(date.getTime() == currenDate.getTime()) System.out.println("no reset");
            
        }catch(ParseException ex){
            System.out.println("Error parse date kiemTraDangNhapLanDauTienCuaNgayHomSau(): " + ex.getMessage());
        }
    }
    
    public String formatCurrency(String unfmtStr){
        int mod = unfmtStr.trim().length()%3;
        
        String output = "";        
        output += unfmtStr.substring(0,mod);        
        unfmtStr = unfmtStr.substring(mod);
        int count = 0;
        while(count < unfmtStr.length()-3){
            output += "." + unfmtStr.substring(count, count+3);   
            count += 3;
        }
        output += "." + unfmtStr.substring(count, unfmtStr.length());
        
        //xoa cac '.' du thua
        if(output.charAt(0) == '.') output = output.substring(1);
        if(output.charAt(0) == '-' && output.charAt(1) == '.') output = output.substring(0,1) + output.substring(2,output.length());
        if(output.charAt(output.length()-1) == '.') output = output.substring(0,output.length()-1);
        return output;
    }
    
    public String unformatCurrency(String fmtStr){
        String tmp = "";
        String parts[] = fmtStr.split("\\.");
        for (String part : parts) {
            tmp += part;
        }
        return tmp;
    } 
    
}
