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
public class LSDD {
    public int ID;
    public int MaKH;
    public Double Tien;
    public Date NgayNap;
    public String MaNV;

    public LSDD() {
    }

    public LSDD(int ID, int MaKH, Double Tien, Date NgayNap, String MaNV) {
        this.ID = ID;
        this.MaKH = MaKH;
        this.Tien = Tien;
        this.NgayNap = NgayNap;
        this.MaNV = MaNV;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public Double getTien() {
        return Tien;
    }

    public void setTien(Double Tien) {
        this.Tien = Tien;
    }

    public Date getNgayNap() {
        return NgayNap;
    }

    public void setNgayNap(Date NgayNap) {
        this.NgayNap = NgayNap;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
}
