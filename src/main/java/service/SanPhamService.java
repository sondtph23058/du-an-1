package service;

import java.util.ArrayList;
import model.SanPham;

public interface SanPhamService {

    ArrayList<SanPham> getListSanPham();

    String addSanPham(SanPham sp);

    String delete(int id);

    String update(SanPham sp, int id);
}
