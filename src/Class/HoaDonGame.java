/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author pc
 */
public class HoaDonGame {
    public int MaHD;
    public String TenMay;
    public Date Ngay;
    public Time GioBD;
    public Time GioKT;
    public Double TongTien;
    public String MaNV;

    public HoaDonGame() {
    }

    public HoaDonGame(String TenMay, Date Ngay, Time GioBD, Time GioKT, Double TongTien, String MaNV) {
        this.TenMay = TenMay;
        this.Ngay = Ngay;
        this.GioBD = GioBD;
        this.GioKT = GioKT;
        this.TongTien = TongTien;
        this.MaNV = MaNV;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String TenMay) {
        this.TenMay = TenMay;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }

    public Time getGioBD() {
        return GioBD;
    }

    public void setGioBD(Time GioBD) {
        this.GioBD = GioBD;
    }

    public Time getGioKT() {
        return GioKT;
    }

    public void setGioKT(Time GioKT) {
        this.GioKT = GioKT;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
}
