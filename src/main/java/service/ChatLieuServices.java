/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.CHATLIEU;

/**
 *
 * @author vuong
 */
public interface ChatLieuServices {
    ArrayList<CHATLIEU> getListKT();

    String add(CHATLIEU chatlieu);

    String update(CHATLIEU chatlieu, int id);

    String delete(int id);
}
