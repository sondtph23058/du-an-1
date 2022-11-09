package service.impl;

import java.util.ArrayList;
import model.ChucVu;
import repository.ChucVuRepository;
import service.ChucVuService;

public class ChucVuServiceImpl implements ChucVuService {

    public ChucVuRepository chucVuRepository = new ChucVuRepository();

    public ArrayList<ChucVu> getListChucVu() {
        return chucVuRepository.getList();
    }

    public String addChucVu(ChucVu cv) {
        if (chucVuRepository.add(cv)) {
            return "Thêm Thành Công";
        } else {
            return "Thêm Thất Bại";
        }
    }

    public String updateChucVu(ChucVu cv, int id) {
        if (chucVuRepository.update(cv, id)) {
            return "Sửa Thành Công";
        } else {
            return "Sửa Thất Bại";
        }
    }

    public String deleteChucVu(int id) {
        if (chucVuRepository.delete(id)) {
            return "Xóa Thành Công";
        } else {
            return "Xóa Thất Bại";
        }
    }
}
