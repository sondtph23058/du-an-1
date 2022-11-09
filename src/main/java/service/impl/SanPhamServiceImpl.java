package service.impl;

import java.util.ArrayList;
import model.SanPham;
import repository.SanPhamRepository;
import service.SanPhamService;

public class SanPhamServiceImpl implements SanPhamService {

    private SanPhamRepository sanphamRepository = new SanPhamRepository();

    @Override
    public ArrayList<SanPham> getListSanPham() {
        return sanphamRepository.getList();
    }

    @Override
    public String addSanPham(SanPham sp) {
        if (sanphamRepository.add(sp)) {
            return "Thêm Thành Công";
        } else {
            return "Thêm Thất Bại";
        }
    }

    @Override
    public String delete(int id) {
        if (sanphamRepository.delete(id)) {
            return "Xoa Thành Công";
        } else {
            return "Xoa Thất Bại";
        }
    }

    @Override
    public String update(SanPham sp, int id) {
        if (sanphamRepository.update(sp, id)) {
            return "Sua Thành Công";
        } else {
            return "Sua Thất Bại";
        }
    }
}
