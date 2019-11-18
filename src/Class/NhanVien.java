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
public class NhanVien {
    public String Manv;
    public String TenNV;
    public String MatKhau;
    public Boolean GioiTinh;
    public String SDT;

    public NhanVien() {
    }

    public NhanVien(String Manv, String TenNV, String MatKhau, Boolean GioiTinh, String SDT) {
        this.Manv = Manv;
        this.TenNV = TenNV;
        this.MatKhau = MatKhau;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
}
