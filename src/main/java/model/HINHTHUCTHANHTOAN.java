/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vuong
 */
@Entity
@Table(name = "HINHTHUCTHANHTOAN")
public class HINHTHUCTHANHTOAN implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer maHTTT;
    private String tenHTTT;
    private Date ngayTao;
    private Date ngaySua;
    private Integer TrangThai;

    public HINHTHUCTHANHTOAN(Integer maHTTT, String tenHTTT, Date ngayTao, Date ngaySua, Integer TrangThai) {
        this.maHTTT = maHTTT;
        this.tenHTTT = tenHTTT;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.TrangThai = TrangThai;
    }

    public HINHTHUCTHANHTOAN() {
    }

    public Integer getMaHTTT() {
        return maHTTT;
    }

    public void setMaHTTT(Integer maHTTT) {
        this.maHTTT = maHTTT;
    }

    public String getTenHTTT() {
        return tenHTTT;
    }

    public void setTenHTTT(String tenHTTT) {
        this.tenHTTT = tenHTTT;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }
    

}
