package com.example.trungthu.device;

/**
 * Created by Trung Thu on 8/29/2017.
 */

public class Device {
    private String Ten;
    private String Nhasanxuat;
    private Integer Hinh;
//khai báo contructer ,getter, setter
    public Device(String ten, String nhasanxuat, Integer hinh) {
        Ten = ten;
        Nhasanxuat = nhasanxuat;
        Hinh = hinh;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public void setNhasanxuat(String nhasanxuat) {
        Nhasanxuat = nhasanxuat;
    }

    public void setHinh(Integer hinh) {
        Hinh = hinh;
    }

    public String getTen() {

        return Ten;
    }

    public String getNhasanxuat() {
        return Nhasanxuat;
    }

    public Integer getHinh() {
        return Hinh;
    }
}
