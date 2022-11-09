
package service.impl;

import java.util.ArrayList;
import model.MONTHETHAO;
import repository.MTTRepository;
import service.MTTService;

public class MTTServiceImpl implements MTTService{
        public MTTRepository mttr = new MTTRepository();

    public ArrayList<MONTHETHAO> getListMTT() {
        return mttr.getListMTTSQL();
    }

    public String addMTT(MONTHETHAO cv) {
        if (mttr.addMTTSQL(cv)) {
            return "Thêm Thành Công";
        } else {
            return "Thêm Thất Bại";
        }
    }

    public String updateMTT(MONTHETHAO cv, int id) {
        if (mttr.updateMTTSQL(cv, id)) {
            return "Sửa Thành Công";
        } else {
            return "Sửa Thất Bại";
        }
    }

    public String deleteMTT(int id) {
        if (mttr.deleteMTTSQL(id)) {
            return "Xóa Thành Công";
        } else {
            return "Xóa Thất Bại";
        }
    }
}
