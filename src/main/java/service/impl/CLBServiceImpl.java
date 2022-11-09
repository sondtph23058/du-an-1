
package service.impl;

import java.util.ArrayList;
import model.CLB;
import repository.CLBrepository;
import service.CLBService;

public class CLBServiceImpl implements CLBService{
    
    public CLBrepository clb = new CLBrepository();

    public ArrayList<CLB> getListCLB() {
        return clb.getList();
    }

    public String addCLB(CLB CLB) {
        if (clb.add(CLB)) {
            return "Thêm Thành Công";
        } else {
            return "Thêm Thất Bại";
        }
    }

    public String updateCLB(CLB CLB, int id) {
        if (clb.update(CLB, id)) {
            return "Sửa Thành Công";
        } else {
            return "Sửa Thất Bại";
        }
    }

    public String deleteCLB(int id) {
        if (clb.delete(id)) {
            return "Xóa Thành Công";
        } else {
            return "Xóa Thất Bại";
        }
    }
}
