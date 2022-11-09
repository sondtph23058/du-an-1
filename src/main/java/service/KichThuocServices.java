/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.KICHTHUOC;

/**
 *
 * @author vuong
 */
public interface KichThuocServices {

    ArrayList<KICHTHUOC> getListKT();

    String add(KICHTHUOC kichThuoc);

    String update(KICHTHUOC kichThuoc, int id);

    String delete(int id);
}
