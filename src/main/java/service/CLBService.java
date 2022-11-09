package service;

import java.util.ArrayList;
import model.CLB;

public interface CLBService {

    ArrayList<CLB> getListCLB();

    String addCLB(CLB CLB);

    String updateCLB(CLB CLB, int id);

    String deleteCLB(int id);
}
