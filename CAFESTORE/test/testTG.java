
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import qlqcafe.ConnectDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class testTG {
    public static void main(String[] args) {
        Connection cn = ConnectDB.SQLConnect();
        String queryString="EXEC SP_SEL_DATBAN";
        try{
            PreparedStatement ps = cn.prepareStatement(queryString);
            ResultSet rsCheck = ps.executeQuery();
            while(rsCheck.next()){
                //tach ngay va thoi gio
                String ngayGioDen = rsCheck.getString("NGAYDEN");
                String[] tachNgayGio = ngayGioDen.split(" ");
                String ngayDen = tachNgayGio[0];
                String gioDen = tachNgayGio[1];
                System.out.println(ngayDen);
                System.out.println(gioDen);
            }
        }catch(Exception e){
            e.getMessage();
        }
    }

}
