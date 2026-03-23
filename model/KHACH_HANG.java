/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author My Laptop
 */
public class KHACH_HANG {
    private int MaKH;
    private String Hoten;
    private String SDT;
    private String CCCD;
    private String Email;
    private String Diachi;

    public KHACH_HANG(int MaKH, String Hoten, String SDT, String CCCD, String Email, String Diachi) {
        this.MaKH = MaKH;
        this.Hoten = Hoten;
        this.SDT = SDT;
        this.CCCD = CCCD;
        this.Email = Email;
        this.Diachi = Diachi;
    }

    public KHACH_HANG() {
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    @Override
    public String toString() {
        return "Khach_Hang{" + "MaKH=" + MaKH + ", Hoten=" + Hoten + ", SDT=" + SDT + ", CCCD=" + CCCD + ", Email=" + Email + ", Diachi=" + Diachi + '}';
    }

    
}
