/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.MauSac;

public interface MauSacService {

    ArrayList<MauSac> getlistMauSac();

    String addMauSac(MauSac mauSac);

    String delete(int id);

    String update(MauSac mauSac, int id);
}
