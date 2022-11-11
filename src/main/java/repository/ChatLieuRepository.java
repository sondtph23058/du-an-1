/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import ConfigHibernate.HibernateConfig;
import java.util.ArrayList;
import javax.persistence.Query;
import model.CHATLIEU;
import model.KICHTHUOC;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vuong
 */
public class ChatLieuRepository {
    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<CHATLIEU> getList() {
        session = HibernateConfig.getFACTORY().openSession();
        Query q = session.createQuery("From CHATLIEU");
        ArrayList<CHATLIEU> list = (ArrayList<CHATLIEU>) q.getResultList();
        return list;
    }

    public Boolean add(CHATLIEU chatlieu) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(chatlieu);
            transaction.commit();
            System.err.println("MacHatLieu " + check);
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean update(CHATLIEU chatlieu, int id) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
           CHATLIEU cl = session.get(CHATLIEU.class, id);
            cl.setTenChatLieu(chatlieu.getTenChatLieu());
            cl.setNgayTao(chatlieu.getNgayTao());
            cl.setNgaySua(chatlieu.getNgaySua());
            cl.setTrangThai(chatlieu.getTrangThai());
            transaction = session.beginTransaction();
            check = (Integer) session.save(cl);        
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
            CHATLIEU cl = session.get(CHATLIEU.class, id);
            transaction = session.beginTransaction();
            session.delete(cl);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
