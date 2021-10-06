package com.example.tuan5;

import java.io.Serializable;

public class Songs implements Serializable {
    private int hinh;
    private String ten, tacgia, thoigian;

    public Songs(int hinh, String ten, String tacgia, String thoigian) {
        this.hinh = hinh;
        this.ten = ten;
        this.tacgia = tacgia;
        this.thoigian = thoigian;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }
}
