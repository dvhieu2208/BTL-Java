/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import database.ConnectDB;
import model.TAI_KHOAN;
import java.sql.*;
        
/**
 *
 * @author My Laptop
 */
public class TAI_KHOANDAO {
    public TAI_KHOAN dangNhap(String user, String pass){

    try{

        Connection conn = ConnectDB.getConnection();

        String sql = "SELECT * FROM TAI_KHOAN WHERE TenDangNhap=? AND MatKhau=?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1,user);
        ps.setString(2,pass);

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            return new TAI_KHOAN(
                    rs.getInt("MaTK"),
                    rs.getString("TenDangNhap"),
                    rs.getString("MatKhau"),
                    rs.getInt("VaiTro"),
                    rs.getInt("MaKH")
            );
        }

    }catch(Exception e){
        e.printStackTrace();
    }

    return null;
}
       public boolean them(TAI_KHOAN tk){
        String sql = "INSERT INTO TAI_KHOAN(TenDangNhap,MatKhau,VaiTro,MaKH) VALUES(?,?,?,?)";
        try(Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, tk.getTenDangNhap());
            ps.setString(2, tk.getMatKhau());
            ps.setInt(3, tk.getVaiTro());
            ps.setInt(4, tk.getMaKH());

            return ps.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean sua(TAI_KHOAN tk){
        String sql = "UPDATE TAI_KHOAN SET MatKhau=?,VaiTro=? WHERE TenDangNhap=?";
        try(Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, tk.getMatKhau());
            ps.setInt(2, tk.getVaiTro());
            ps.setString(3, tk.getTenDangNhap());

            return ps.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean xoa(String tenDangNhap){
        String sql = "DELETE FROM TAI_KHOAN WHERE TenDangNhap=?";
        try(Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, tenDangNhap);

            return ps.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
