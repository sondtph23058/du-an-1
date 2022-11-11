package repository;

import ConfigHibernate.HibernateConfig;
import java.util.ArrayList;
import javax.persistence.Query;

import model.MauSac;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MauSacRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<MauSac> getlist() {
        session = HibernateConfig.getFACTORY().openSession();
        Query q = session.createQuery("From MauSac");
        ArrayList<MauSac> list = (ArrayList<MauSac>) q.getResultList();
        return list;
    }

    public Boolean add(MauSac MauSac) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(MauSac);
            transaction.commit();
            System.err.println("Ma Hoa Don " + check);
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean update(MauSac mauSac, int id) {
        Transaction transaction = null;
         Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            MauSac ms = session.get(MauSac.class, id);

            ms.setTenMauSac(mauSac.getTenMauSac());
            ms.setNgayTao(mauSac.getNgayTao());
            ms.setNgaySua(mauSac.getNgaySua());
            ms.setTrangThai(mauSac.getTrangThai());
            transaction = session.beginTransaction();
            session.update(ms);
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
            MauSac ms = session.get(MauSac.class, id);
            transaction = session.beginTransaction();
            session.delete(ms);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
