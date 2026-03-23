/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author My Laptop
 */
public class PHUONG_THUC_THANH_TOAN {
    private int maPT;
    private String tenPT;

    public PHUONG_THUC_THANH_TOAN() {}

    public PHUONG_THUC_THANH_TOAN(int maPT, String tenPT) {
        this.maPT = maPT;
        this.tenPT = tenPT;
    }

    public int getMaPT() {
        return maPT;
    }

    public void setMaPT(int maPT) {
        this.maPT = maPT;
    }

    public String getTenPT() {
        return tenPT;
    }

    public void setTenPT(String tenPT) {
        this.tenPT = tenPT;
    }

    
}
