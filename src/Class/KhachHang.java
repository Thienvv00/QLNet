/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author pc
 */
public class KhachHang {
    public int MaKH;
    public String MaNV;
    public String TenKH;
    public String MatKhau;
    public Double Tien;

    public KhachHang() {
    }

    public KhachHang(int MaKH, String MaNV, String TenKH, String MatKhau, Double Tien) {
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.TenKH = TenKH;
        this.MatKhau = MatKhau;
        this.Tien = Tien;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public Double getTien() {
        return Tien;
    }

    public void setTien(Double Tien) {
        this.Tien = Tien;
    }
    
}
