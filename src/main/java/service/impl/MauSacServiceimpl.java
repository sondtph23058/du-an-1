/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.MauSac;
import repository.MauSacRepository;
import service.MauSacService;

public class MauSacServiceimpl implements MauSacService {

    public MauSacRepository MauSacRepository = new MauSacRepository();

    @Override
    public ArrayList<MauSac> getlistMauSac() {
        return MauSacRepository.getlist();
    }

    @Override
    public String addMauSac(MauSac mauSac) {
        if (MauSacRepository.add(mauSac)) {
            return "Thêm Thành Công";
        } else {
            return "Thêm Thất Bại";
        }
    }

    @Override
    public String delete(int id) {
        if (MauSacRepository.delete(id)) {
            return "Xoá Thành Công";
        } else {
            return "Xóa Thất Bại";
        }
    }

    @Override
    public String update(MauSac mauSac, int id) {
        if (MauSacRepository.update(mauSac, id)) {
            return "Sửa Thành Công";
        } else {
            return "Sửa Thất Bại";
        }
    }
}
