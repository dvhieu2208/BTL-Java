/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.ConnectDB;
import model.KHACH_HANG;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author My Laptop
 */
public class Khach_HangDAO {
    public ArrayList<KHACH_HANG> getAllKhachHang() {

    ArrayList<KHACH_HANG> list = new ArrayList<>();

    String sql = "SELECT * FROM KHACH_HANG";

    try (Connection conn = ConnectDB.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {

            KHACH_HANG kh = new KHACH_HANG(
                    rs.getInt("MaKH"),
                    rs.getString("HoTen"),
                    rs.getString("SDT"),
                    rs.getString("CCCD"),
                    rs.getString("Email"),
                    rs.getString("DiaChi")
            );

            list.add(kh);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return list;
}
    public ArrayList<KHACH_HANG> getKhachHangDaXoa() {

    ArrayList<KHACH_HANG> list = new ArrayList<>();

    try {

        Connection conn = ConnectDB.getConnection();

        String sql = "SELECT * FROM KHACH_HANG WHERE TrangThai = 0";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            KHACH_HANG kh = new KHACH_HANG(
                    rs.getInt("MaKH"),
                    rs.getString("HoTen"),
                    rs.getString("SDT"),
                    rs.getString("CCCD"),
                    rs.getString("Email"),
                    rs.getString("DiaChi")
            );

            list.add(kh);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return list;
}

public boolean them(KHACH_HANG kh){
        String sql = "INSERT INTO KHACH_HANG(HoTen,SDT,CCCD,Email,DiaChi,TrangThai) VALUES(?,?,?,?,?,1)";
        try(Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, kh.getHoten());
            ps.setString(2, kh.getSDT());
            ps.setString(3, kh.getCCCD());
            ps.setString(4, kh.getEmail());
            ps.setString(5, kh.getDiachi());

            return ps.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean sua(KHACH_HANG kh){
        String sql = "UPDATE KHACH_HANG SET HoTen=?,SDT=?,CCCD=?,Email=?,DiaChi=? WHERE MaKH=?";
        try(Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, kh.getHoten());
            ps.setString(2, kh.getSDT());
            ps.setString(3, kh.getCCCD());
            ps.setString(4, kh.getEmail());
            ps.setString(5, kh.getDiachi());
            ps.setInt(6, kh.getMaKH());

            return ps.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean xoa(int maKH){
         String sql = "UPDATE KHACH_HANG SET TrangThai = 0 WHERE MaKH=?";

    try(Connection conn = ConnectDB.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){

        ps.setInt(1, maKH);

        return ps.executeUpdate() > 0;

    }catch(Exception e){
        e.printStackTrace();
    }

    return false;
    }

    public boolean khoiPhuc(int maKH){
        String sql = "UPDATE KHACH_HANG SET TrangThai=1 WHERE MaKH=?";
        try(Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setInt(1, maKH);

            return ps.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}

