/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Date;

/**
 *
 * @author pc
 */
public class HoaDonDichVu {
    public int MaDV;
    public int MaHD;
    public String MaSp;
    public int SoLuong;
    public Double gia;
    public Date NgaySD;

    public HoaDonDichVu() {
    }

    public HoaDonDichVu(int MaDV, int MaHD, String MaSp, int SoLuong, Double gia, Date NgaySD) {
        this.MaDV = MaDV;
        this.MaHD = MaHD;
        this.MaSp = MaSp;
        this.SoLuong = SoLuong;
        this.gia = gia;
        this.NgaySD = NgaySD;
    }

    public int getMaDV() {
        return MaDV;
    }

    public void setMaDV(int MaDV) {
        this.MaDV = MaDV;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSp() {
        return MaSp;
    }

    public void setMaSp(String MaSp) {
        this.MaSp = MaSp;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Date getNgaySD() {
        return NgaySD;
    }

    public void setNgaySD(Date NgaySD) {
        this.NgaySD = NgaySD;
    }
    
}
