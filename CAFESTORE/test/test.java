
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hungh
 */
public class test {
    public static void printDate(){
        String checkIn = null, checkOut = null;
        try{
            checkIn = "2020-12-23 16:58:44.000";
            checkIn = checkIn.substring(0, checkIn.length() - 2);
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            Date date = sdf.parse(checkIn); System.out.println(checkIn);
//            checkIn = date.toString();  
            checkIn = sdf.format(date);
            System.out.println("checkin: "+checkIn);
            checkOut = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()); 
            System.out.println("checkout: "+checkOut);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void resetBanAfter30p_1(){
        String sql = "SELECT THOIGIANDEN FROM DATBAN WHERE THOIGIANDEN >=  DATEADD(MINUTE, -30, FORMAT(GETDATE(), 'yyyy-MM-dd HH:mm'))";
        try{
            Connection cn = qlqcafe.ConnectDB.SQLConnect();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("THOIGIANDEN"));
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void queryUpdate(String sql){
        try{
            Connection cn = qlqcafe.ConnectDB.SQLConnect();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }        
    }
    
    public static void resetBanAfter30p_2(){        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        
        Date sysDate = new Date(); System.out.println(sysDate + "\t");
        Date dbDate;
        
        String dbDateStr, id;        
        String sql = "SELECT IDDATBAN, THOIGIANDEN FROM DATBAN WHERE CONVERT(VARCHAR, THOIGIANDEN, 23) = CONVERT(VARCHAR, GETDATE(), 23) AND TRANGTHAIDEN = 0";
        try{
            Connection cn = qlqcafe.ConnectDB.SQLConnect();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){                
                dbDateStr = rs.getString("THOIGIANDEN");
                dbDate = sdf.parse(dbDateStr);
                if(dbDate.getTime() + 1800000 < sysDate.getTime()){                    
                    id = rs.getString("IDDATBAN");
                    System.out.println(dbDateStr + "\t" + id);
                    queryUpdate("UPDATE DATBAN SET HOPLE = 0 WHERE IDDATBAN = '" +id+ "'");
                }
            }
        }catch(SQLException | ParseException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void selectDatBanNow(){        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        
        Date sysDate = new Date(); System.out.println(sysDate + "\t");
        Date dbDate;
        
        String dbDateStr, id;        
        String sql = "SELECT IDDATBAN, THOIGIANDEN, SOLUONGBAN FROM DATBAN WHERE CONVERT(VARCHAR, THOIGIANDEN, 23) = CONVERT(VARCHAR, GETDATE(), 23) AND TRANGTHAIDEN = 0";
        try{
            Connection cn = qlqcafe.ConnectDB.SQLConnect();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){                
                dbDateStr = rs.getString("THOIGIANDEN");
                dbDate = sdf.parse(dbDateStr);
                if(dbDate.getTime() + 1800000 > sysDate.getTime()){                    
                    id = rs.getString("IDDATBAN");
                    System.out.println(dbDateStr + "\t" + id + rs.getString("SOLUONGBAN"));
//                    queryUpdate("UPDATE DATBAN SET HOPLE = 0 WHERE IDDATBAN = '" +id+ "'");
                }
            }
        }catch(SQLException | ParseException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static String formatCurrency(String numStr){
        int mod = numStr.trim().length()%3;
        
        String output = "";        
        output += numStr.substring(0,mod);        
        numStr = numStr.substring(mod);
        int count = 0;
        while(count < numStr.length()-3){
            System.out.println("Output = " + output + ", strlast = " + numStr.substring(count, count+3));
            output += "." + numStr.substring(count, count+3);   
            count += 3;
        }
        output += "." + numStr.substring(count, numStr.length());
        
        String tmp = "";
        String parts[] = output.split("\\.");
        for (String part : parts) {
            tmp += part;
        }
        System.out.println(tmp);
            
        return output;
    }
    
    public static void main(String[] args) throws ParseException {
//        printDate();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(sdf.parse("2021-01-05 02:52:44")));
//        selectDatBanNow();
//        formatCurrency("7254000000300");
//        System.out.println("7254000".substring(4, 7));
//        String output = "-.200.000";
////        if(tongTien.charAt(0) == '.') tongTien = tongTien.substring(1);
////        if(tongTien.charAt(tongTien.length()-1) == '.') tongTien = tongTien.substring(0,tongTien.length()-1);
//        System.out.println(output.substring(0,1));
//        System.out.println(output.substring(2,output.length()));
//        if(output.charAt(0) == '-' && output.charAt(1) == '.') output = output.substring(0,1) + output.substring(2,output.length());
//        System.out.println(output);

//        String value = "2021-01-08";
////        value = qlqcafe.ConnectDB.selectSQLReturnOneValue("NGAYLAMVIEC", "TACVU", "ID = 1", "kiemTraDangNhapLanDauTienCuaNgayHomSau", "XuLyChung");
//        
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        
//        Date date = sdf.parse(value);  
        
        
         try{        
            String value = "";
            value = qlqcafe.ConnectDB.selectSQLReturnOneValue("NGAYLAMVIEC", "TACVU", "ID = 1", "kiemTraDangNhapLanDauTienCuaNgayHomSau", "XuLyChung");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;

            if(value.equals("")) date = new Date();
            else date = sdf.parse(value);
            
            Date currenDate = new Date();
            value = sdf.format(currenDate);
            currenDate = sdf.parse(value);
            
            System.out.println(date);
            System.out.println(currenDate);
            
            if(date.getTime() < currenDate.getTime()) System.out.println("reset");
            if(date.getTime() == currenDate.getTime()) System.out.println("no reset");
            
        }catch(ParseException ex){
            System.out.println("Error parse date kiemTraDangNhapLanDauTienCuaNgayHomSau(): " + ex.getMessage());
        }                  
    }
}
