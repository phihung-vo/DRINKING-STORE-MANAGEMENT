/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlqcafe;

/**
 *
 * @author Nhom 40
 */
public class NguoiDung {
    private String manv;
    private String hoten;
    private String tendn;    
    private int macv;

    public NguoiDung() {
    }    
    
    public NguoiDung(NguoiDung nguoiDung){
        this.manv = nguoiDung.manv;
        this.tendn = nguoiDung.tendn;
        this.hoten = nguoiDung.hoten;
    }
    
    public NguoiDung(String manv, String tendn, String hoten) {
        this.manv = manv;
        this.tendn = tendn;
        this.hoten = hoten;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    
    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public int getMacv() {
        return macv;
    }

    public void setMacv(int macv) {
        this.macv = macv;
    }
    
}
