
package service;

import java.util.ArrayList;
import model.MONTHETHAO;

public interface MTTService {
    
    ArrayList< MONTHETHAO> getListMTT();

    String addMTT(MONTHETHAO mtt);

    String updateMTT(MONTHETHAO mtt, int id);

    String deleteMTT(int id);


}
