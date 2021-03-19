/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlqcafe;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class LayDateOh {
    private String layDate0hToday;
    private String layDate0hTomorrow;
    private Date today;
    private Date tomorrow;
    
    public String getLayDate0hToday() {
        return layDate0hToday;
    }

    public void setLayDate0hToday(String layDate0hToday) {
        this.layDate0hToday = layDate0hToday;
    }

    public String getLayDate0hTomorrow() {
        return layDate0hTomorrow;
    }

    public void setLayDate0hTomorrow(String layDate0hTomorrow) {
        this.layDate0hTomorrow = layDate0hTomorrow;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public Date getTomorrow() {
        return tomorrow;
    }

    public void setTomorrow(Date tomorrow) {
        this.tomorrow = tomorrow;
    }
    
    public LayDateOh() {
        //--------------------------------------------------------------------------//
        // get a calendar instance, which defaults to "now"
        Calendar calendar = Calendar.getInstance();

        // get a date to represent "today"
        this.today = calendar.getTime();

        // add one day to the date/calendar
        calendar.add(Calendar.DAY_OF_YEAR, 1);

        // now get "tomorrow"
        this.tomorrow = calendar.getTime();

        //get datetime today
        this.layDate0hToday = String.valueOf(new SimpleDateFormat("yyyy-MM-dd 00:00:00").format(this.today));
        
        //get datetime tomorrow
        this.layDate0hTomorrow = String.valueOf(new SimpleDateFormat("yyyy-MM-dd 00:00:00").format(this.tomorrow));
        
        //--------------------------------------------------------------------------//
    }
}
