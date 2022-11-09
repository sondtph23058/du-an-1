
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
@Table(name="MauSac")
public class MauSac implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MaMauSac")
    private int MaMauSac;
    @Column(name="TenMauSac")
    private String TenMauSac;
    @Column(name="NgayTao")
    private Date NgayTao;
    @Column(name="NgaySua")
    private Date NgaySua;
    @Column(name="TrangThai")
    private Integer TrangThai;

    public MauSac() {
    }

    public MauSac(int MaMauSac, String TenMauSac, Date NgayTao, Date NgaySua, Integer TrangThai) {
        this.MaMauSac = MaMauSac;
        this.TenMauSac = TenMauSac;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public int getMaMauSac() {
        return MaMauSac;
    }

    public void setMaMauSac(int MaMauSac) {
        this.MaMauSac = MaMauSac;
    }

    public String getTenMauSac() {
        return TenMauSac;
    }

    public void setTenMauSac(String TenMauSac) {
        this.TenMauSac = TenMauSac;
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

}
