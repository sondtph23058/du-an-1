/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import ConfigHibernate.HibernateConfig;
import java.util.ArrayList;
import javax.persistence.Query;
import model.KICHTHUOC;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vuong
 */
public class KichThuocRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<KICHTHUOC> getList() {
        Query q = session.createQuery("From KICHTHUOC");
        ArrayList<KICHTHUOC> list = (ArrayList<KICHTHUOC>) q.getResultList();
        return list;
    }

    public Boolean add(KICHTHUOC kichThuoc) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(kichThuoc);
            transaction.commit();
            System.err.println("MaKichThuoc " + check);
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean update(KICHTHUOC kichthuoc, int id) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
           KICHTHUOC kt = session.get(KICHTHUOC.class, id);
            kt.setKichThuoc(kichthuoc.getKichThuoc());
            kt.setNgayTao(kichthuoc.getNgayTao());
            kt.setNgaySua(kichthuoc.getNgaySua());
            kt.setTrangThai(kichthuoc.getTrangThai());
            transaction = session.beginTransaction();
            check = (Integer) session.save(kt);        
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean delete(int id) {
        Transaction transaction = null;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            KICHTHUOC kt = session.get(KICHTHUOC.class, id);
            transaction = session.beginTransaction();
            session.delete(kt);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

}
