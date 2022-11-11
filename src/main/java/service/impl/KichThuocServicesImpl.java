/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.KICHTHUOC;
import repository.KichThuocRepository;
import service.KichThuocServices;

/**
 *
 * @author vuong
 */
public class KichThuocServicesImpl implements KichThuocServices {

    public KichThuocRepository ktr = new KichThuocRepository();

    public ArrayList<KICHTHUOC> getListKT() {
        return ktr.getList();
    }

    public String add(KICHTHUOC kichThuoc) {
        if (ktr.add(kichThuoc)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(KICHTHUOC kichThuoc, int id) {
        if (ktr.update(kichThuoc, id)) {
            return "Sua thành công";
        } else {
            return "Sua thất bại";
        }

    }

    @Override
    public String delete(int id) {
        if (ktr.delete(id)) {
            return "xoa thành công";
        } else {
            return "xoa thất bại";
        }
    }
}
