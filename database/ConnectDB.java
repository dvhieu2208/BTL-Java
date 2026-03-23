/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author My Laptop
 */
public class ConnectDB {
    public static Connection getConnection() {
        Connection conn = null;

        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyTienDien;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String password = "123456";

            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Ket noi thanh cong!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
