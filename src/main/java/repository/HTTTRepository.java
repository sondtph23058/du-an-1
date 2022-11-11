/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import ConfigHibernate.HibernateConfig;
import java.util.ArrayList;
import javax.persistence.Query;
import model.HINHTHUCTHANHTOAN;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vuong
 */
public class HTTTRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<HINHTHUCTHANHTOAN> getList() {
        Session session = HibernateConfig.getFACTORY().openSession();
        Query q = session.createQuery("From HINHTHUCTHANHTOAN");
        ArrayList<HINHTHUCTHANHTOAN> list = (ArrayList<HINHTHUCTHANHTOAN>) q.getResultList();
        return list;
    }

    public Boolean add(HINHTHUCTHANHTOAN httt) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(httt);
            transaction.commit();
            System.err.println("MaHTTT " + check);
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean update(HINHTHUCTHANHTOAN httt, int id) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            HINHTHUCTHANHTOAN hinhthucthanhtoan = session.get(HINHTHUCTHANHTOAN.class, id);
            hinhthucthanhtoan.setTenHTTT(httt.getTenHTTT());
            hinhthucthanhtoan.setNgayTao(httt.getNgayTao());
            hinhthucthanhtoan.setNgaySua(httt.getNgaySua());
            hinhthucthanhtoan.setTrangThai(httt.getTrangThai());
            transaction = session.beginTransaction();
            session.update(hinhthucthanhtoan);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean delete(int id) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            HINHTHUCTHANHTOAN hinhthucthanhtoan = session.get(HINHTHUCTHANHTOAN.class, id);
            transaction = session.beginTransaction();
            session.delete(hinhthucthanhtoan);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
