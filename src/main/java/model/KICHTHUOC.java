/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
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
@Table(name = "KICHTHUOC")
public class KICHTHUOC implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKichThuoc")
    private Integer maKichThuoc;
    @Column(name = "KichThuoc")
    private String kichThuoc;
    @Column(name = "NgayTao")
    private Date ngayTao;
    @Column(name = "NgaySua")
    private Date ngaySua;
    @Column(name = "TrangThai")
    private Integer trangThai;

    public KICHTHUOC() {
    }

    public KICHTHUOC(Integer maKichThuoc, String kichThuoc, Date ngayTao, Date ngaySua, Integer trangThai) {
        this.maKichThuoc = maKichThuoc;
        this.kichThuoc = kichThuoc;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public Integer getMaKichThuoc() {
        return maKichThuoc;
    }

    public void setMaKichThuoc(Integer maKichThuoc) {
        this.maKichThuoc = maKichThuoc;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
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
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KichThuoc{" + "MaKichThuoc " + maKichThuoc + " KichThuoc " + kichThuoc + " NgayTao " + ngayTao + " NgaySua " + ngaySua + " TrangThai " + trangThai + "}";
    }
}
