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
public class ThucPham {
    public String MaSp;
    public String TenSp;
    public int SoLuong;

    public ThucPham() {
    }

    public ThucPham(String MaSp, String TenSp, int SoLuong) {
        this.MaSp = MaSp;
        this.TenSp = TenSp;
        this.SoLuong = SoLuong;
    }

    public String getMaSp() {
        return MaSp;
    }

    public void setMaSp(String MaSp) {
        this.MaSp = MaSp;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
