/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import database.ConnectDB;
import model.HOA_DON;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author My Laptop
 */
public class Hoa_DonDAO {
    public ArrayList<HOA_DON> getAllHoaDon() {

    ArrayList<HOA_DON> list = new ArrayList<>();

    try {

        Connection conn = ConnectDB.getConnection();

        String sql = "SELECT * FROM HOA_DON";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            HOA_DON hd = new HOA_DON(
                    rs.getInt("MaHoaDon"),
                    rs.getInt("MaKH"),
                    rs.getInt("MaPT"),
                    rs.getDate("NgayThanhToan"),
                    rs.getInt("ChiSoCu"),
                    rs.getInt("ChiSoMoi"),
                    rs.getInt("TrangThai")
            );

            list.add(hd);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return list;
}
     public boolean them(HOA_DON hd){
        String sql = "INSERT INTO HOA_DON(MaKH,ChiSoCu,ChiSoMoi,TrangThai) VALUES(?,?,?,0)";
        try(Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setInt(1, hd.getMaKH());
            ps.setInt(2, hd.getChiSoCu());
            ps.setInt(3, hd.getChiSoMoi());

            return ps.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean sua(HOA_DON hd){
        String sql = "UPDATE HOA_DON SET ChiSoCu=?,ChiSoMoi=? WHERE MaHoaDon=?";
        try(Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setInt(1, hd.getChiSoCu());
            ps.setInt(2, hd.getChiSoMoi());
            ps.setInt(3, hd.getMaHoaDon());

            return ps.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean thanhToan(int maHD, int maPT){
        String sql = "UPDATE HOA_DON SET TrangThai=1, MaPT=?, NgayThanhToan=GETDATE() WHERE MaHoaDon=?";
        try(Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setInt(1, maPT);
            ps.setInt(2, maHD);

            return ps.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
