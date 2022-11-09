package repository;

import ConfigHibernate.HibernateConfig;
import java.util.ArrayList;
import javax.persistence.Query;
import model.ChucVu;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ChucVuRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<ChucVu> getList() {
        Query q = session.createQuery("From ChucVu");
        ArrayList<ChucVu> list = (ArrayList<ChucVu>) q.getResultList();
        return list;
    }

    public Boolean add(ChucVu chucVu) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(chucVu);
            transaction.commit();
            System.err.println("Ma Hoa Don " + check);
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean update(ChucVu chucVu, int id) {
        Transaction transaction = null;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            ChucVu cv = session.get(ChucVu.class, id);
            cv.setTenCV(chucVu.getTenCV());
            cv.setNgayTao(chucVu.getNgayTao());
            cv.setNgaySua(chucVu.getNgaySua());
            cv.setTrangThai(chucVu.getTrangThai());
            
            transaction = session.beginTransaction();
            session.save(cv);
            transaction.commit();
            
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean delete(int id) {
        Transaction transaction = null;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            ChucVu cv = session.get(ChucVu.class, id);
            transaction = session.beginTransaction();
            session.delete(cv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
