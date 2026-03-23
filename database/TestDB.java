/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
/**
 *
 * @author My Laptop
 */
public class TestDB {
    public static void main(String[] args) {

        Connection conn = ConnectDB.getConnection();

        if (conn != null) {
            System.out.println("Database OK");
        } else {
            System.out.println("Loi ket noi");
        }

    }
}
