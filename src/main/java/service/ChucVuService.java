package service;

import java.util.ArrayList;
import model.ChucVu;

public interface ChucVuService {

    ArrayList<ChucVu> getListChucVu();

    String addChucVu(ChucVu chucVu);

    String updateChucVu(ChucVu chucVu, int id);

    String deleteChucVu(int id);


}
