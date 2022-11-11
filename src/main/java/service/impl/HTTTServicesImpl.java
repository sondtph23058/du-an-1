/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.HINHTHUCTHANHTOAN;
import repository.HTTTRepository;
import service.HTTTServices;

/**
 *
 * @author vuong
 */
public class HTTTServicesImpl implements HTTTServices{
    private HTTTRepository htttR = new HTTTRepository();
    @Override
    public ArrayList<HINHTHUCTHANHTOAN> getList() {
        return htttR.getList();
    }

    @Override
    public String add(HINHTHUCTHANHTOAN httt) {
        if (htttR.add(httt)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(HINHTHUCTHANHTOAN httt, int id) {
        if (htttR.update(httt, id)) {
            return "update thành công";
        } else {
            return "update thất bại";
        }
    }

    @Override
    public String delete(int id) {
        if (htttR.delete(id)) {
            return "delete thành công";
        } else {
            return "delete Thất bại";
        }
    }
    
}
