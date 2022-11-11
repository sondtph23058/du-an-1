/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.HINHTHUCTHANHTOAN;

/**
 *
 * @author vuong
 */
public interface HTTTServices {
     ArrayList<HINHTHUCTHANHTOAN> getList();

    String add(HINHTHUCTHANHTOAN httt);

    String update(HINHTHUCTHANHTOAN httt, int id);

    String delete(int id);
}
