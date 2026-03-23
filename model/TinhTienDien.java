/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author My Laptop
 */
public class TinhTienDien {
    public static int tinhTienDien(int soDien){

        int tien = 0;

        if(soDien <= 50){
            tien = soDien * 1984;
        }
        else if(soDien <= 100){
            tien = 50 * 1984 +
                   (soDien - 50) * 2050;
        }
        else if(soDien <= 200){
            tien = 50 * 1984 +
                   50 * 2050 +
                   (soDien - 100) * 2380;
        }
        else if(soDien <= 300){
            tien = 50 * 1984 +
                   50 * 2050 +
                   100 * 2380 +
                   (soDien - 200) * 2998;
        }
        else if(soDien <= 400){
            tien = 50 * 1984 +
                   50 * 2050 +
                   100 * 2380 +
                   100 * 2998 +
                   (soDien - 300) * 3350;
        }
        else{
            tien = 50 * 1984 +
                   50 * 2050 +
                   100 * 2380 +
                   100 * 2998 +
                   100 * 3350 +
                   (soDien - 400) * 3460;
        }

        return tien;
    }
}
