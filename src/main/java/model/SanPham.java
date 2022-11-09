package model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SANPHAM")
public class SanPham implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSP")
    private Integer MaSP;
    @Column(name = "TenSp")
    private String Tensp;
    @Column(name = "NgayTao")
    private Date NgayTao;
    @Column(name = "NgaySua")
    private Date NgaySua;
    @Column(name = "TrangThai")
    private Integer TrangThai;

    public SanPham() {
    }

    public SanPham(Integer MaSP, String Tensp, Date NgayTao, Date NgaySua, Integer TrangThai) {
        this.MaSP = MaSP;
        this.Tensp = Tensp;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public Integer getMaSP() {
        return MaSP;
    }

    public void setMaSP(Integer MaSP) {
        this.MaSP = MaSP;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(Date NgaySua) {
        this.NgaySua = NgaySua;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "SANPHAM{" + "MaSP " + MaSP + " TenSp " + Tensp + " NgayTao " + NgayTao + " NgaySua " + NgaySua + " TrangThai " + TrangThai + "}";
    }

}
