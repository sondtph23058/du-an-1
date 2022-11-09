/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.CHATLIEU;
import repository.ChatLieuRepository;
import service.ChatLieuServices;

/**
 *
 * @author vuong
 */
public class ChatLieuServicesImpl implements ChatLieuServices {

    private ChatLieuRepository clr = new ChatLieuRepository();

    @Override

    public ArrayList<CHATLIEU> getListKT() {
        return clr.getList();

    }

    @Override
    public String add(CHATLIEU chatlieu) {
        if (clr.add(chatlieu)) {
            return "Thêm thành công";
        } else {
            return "Thêm th?t b?i";
        }
    }

    @Override
    public String update(CHATLIEU chatlieu, int id) {
        if (clr.update(chatlieu, id)) {
            return "update thành công";
        } else {
            return "update th?t b?i";
        }
    }

    @Override
    public String delete(int id) {
        if (clr.delete(id)) {
            return "delete thành công";
        } else {
            return "delete th?t b?i";
        }
    }

}
