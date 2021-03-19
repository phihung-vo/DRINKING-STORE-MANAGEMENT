/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class test2 {
    public static void main(String[] args) throws ParseException
    {
        // get a calendar instance, which defaults to "now"
        Calendar calendar = Calendar.getInstance();

        // get a date to represent "today"
        Date today = calendar.getTime();
        System.out.println("today:    " + today);

        // add one day to the date/calendar
        calendar.add(Calendar.DAY_OF_YEAR, 1);

        // now get "tomorrow"
        Date tomorrow = calendar.getTime();
        String strDate = String.valueOf(new SimpleDateFormat("dd-MM-yyyy").format(tomorrow));
        String strTime = String.valueOf(new SimpleDateFormat("HH:mm").format(tomorrow));
        // print out tomorrow's date
        System.out.println("tomorrow: " + strDate+" "+strTime);
        String thoiGian0h = "00:00";
        
        String layThoiGian = strDate+" "+strTime;
        System.out.println(layThoiGian);
        //SO SANH
        if(strTime.equals(thoiGian0h)){
            System.out.println("true");
        }else System.out.println("false");
        // lấy khoảng thời gian 24h
        
        System.out.println(tomorrow.getTime() - today.getTime());
        
        //
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + (calendar.get(Calendar.MONTH)+1));
        System.out.println("DAY: " + calendar.get(Calendar.DATE));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
    }
}
