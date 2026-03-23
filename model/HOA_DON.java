/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Date;
/**
 *
 * @author My Laptop
 */
public class HOA_DON {
    private int maHoaDon;
    private int maKH;
    private int maPT;
    private Date NgayThanhToan;
    private int ChiSoCu;
    private int ChiSoMoi;
    private int trangThai;

    public HOA_DON() {
    }

    public HOA_DON(int maHoaDon, int maKH, int maPT, Date NgayThanhToan, int ChiSoCu, int ChiSoMoi, int trangThai) {
        this.maHoaDon = maHoaDon;
        this.maKH = maKH;
        this.maPT = maPT;
        this.NgayThanhToan = NgayThanhToan;
        this.ChiSoCu = ChiSoCu;
        this.ChiSoMoi = ChiSoMoi;
        this.trangThai = trangThai;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getMaPT() {
        return maPT;
    }

    public void setMaPT(int maPT) {
        this.maPT = maPT;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public int getChiSoCu() {
        return ChiSoCu;
    }

    public void setChiSoCu(int ChiSoCu) {
        this.ChiSoCu = ChiSoCu;
    }

    public int getChiSoMoi() {
        return ChiSoMoi;
    }

    public void setChiSoMoi(int ChiSoMoi) {
        this.ChiSoMoi = ChiSoMoi;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

   

    
}
