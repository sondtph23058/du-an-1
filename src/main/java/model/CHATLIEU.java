/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
@Table(name = "CHATLIEU")
public class CHATLIEU {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaChatLieu")
    private Integer maChatLieu;
    @Column(name = "TenChatLieu")
    private String tenChatLieu;
    @Column(name = "ngayTao")
    private Date ngayTao;
    @Column(name = "ngaySua")
    private Date ngaySua;
    @Column(name = "TrangThai")
    private int trangThai;

    public CHATLIEU() {
    }

    public CHATLIEU(Integer maChatLieu, String tenChatLieu, Date ngayTao, Date ngaySua, int trangThai) {
        this.maChatLieu = maChatLieu;
        this.tenChatLieu = tenChatLieu;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public Integer getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(Integer maChatLieu) {
        this.maChatLieu = maChatLieu;
    }

    public String getTenChatLieu() {
        return tenChatLieu;
    }

    public void setTenChatLieu(String tenChatLieu) {
        this.tenChatLieu = tenChatLieu;
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

}
