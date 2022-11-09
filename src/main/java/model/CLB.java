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
@Table(name = "CLB")
public class CLB implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MACLB")
    private Integer MACLB;
    @Column(name = "MAMTT")
    private Integer MAMTT;
    @Column(name = "TENCLB")
    private String TENCLB;
    @Column(name = "NGAYTAO")
    private Date NGAYTAO;
    @Column(name = "NGAYSUA")
    private Date NGAYSUA;
    @Column(name = "TRANGTHAI")
    private Integer TRANGTHAI;

    public Integer getMACLB() {
        return MACLB;
    }

    public void setMACLB(Integer MACLB) {
        this.MACLB = MACLB;
    }

    public Integer getMAMTT() {
        return MAMTT;
    }

    public void setMAMTT(Integer MAMTT) {
        this.MAMTT = MAMTT;
    }

    public String getTENCLB() {
        return TENCLB;
    }

    public void setTENCLB(String TENCLB) {
        this.TENCLB = TENCLB;
    }

    public Date getNGAYTAO() {
        return NGAYTAO;
    }

    public void setNGAYTAO(Date NGAYTAO) {
        this.NGAYTAO = NGAYTAO;
    }

    public Date getNGAYSUA() {
        return NGAYSUA;
    }

    public void setNGAYSUA(Date NGAYSUA) {
        this.NGAYSUA = NGAYSUA;
    }

    public CLB(Integer MACLB, Integer MAMTT, String TENCLB, Date NGAYTAO, Date NGAYSUA, Integer TRANGTHAI) {
        this.MACLB = MACLB;
        this.MAMTT = MAMTT;
        this.TENCLB = TENCLB;
        this.NGAYTAO = NGAYTAO;
        this.NGAYSUA = NGAYSUA;
        this.TRANGTHAI = TRANGTHAI;
    }

    public Integer getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setTRANGTHAI(Integer TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }



    public CLB() {
    }
    
    
}
