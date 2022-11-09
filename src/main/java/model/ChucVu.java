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
@Table(name = "ChucVu")
public class ChucVu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaCV")
    private Integer MaCV;
    @Column(name = "TenCV")
    private String TenCV;
    @Column(name = "NgayTao")
    private Date NgayTao;
    @Column(name = "NgaySua")
    private Date NgaySua;
    @Column(name = "TrangThai")
    private Integer TrangThai;

    public Integer getMaCV() {
        return MaCV;
    }

    public void setMaCV(Integer MaCV) {
        this.MaCV = MaCV;
    }

    public String getTenCV() {
        return TenCV;
    }

    public void setTenCV(String TenCV) {
        this.TenCV = TenCV;
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
    
    
    
    public ChucVu() {
    }

    public ChucVu(Integer MaCV, String TenCV, Date NgayTao, Date NgaySua, Integer TrangThai) {
        this.MaCV = MaCV;
        this.TenCV = TenCV;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "ChucVu{"+ "MACV "+MaCV+" TenCV "+TenCV+" NgayTao "+NgayTao+" NgaySua "+NgaySua+" TrangThai "+TrangThai+"}";
    }
    
    
}
