
package repository;

import ConfigHibernate.HibernateConfig;
import java.util.ArrayList;
import javax.persistence.Query;
import model.MONTHETHAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MTTRepository {
    
    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<MONTHETHAO> getListMTTSQL() {
        Query q = session.createQuery("From MONTHETHAO");
        ArrayList<MONTHETHAO> list = (ArrayList<MONTHETHAO>) q.getResultList();
        return list;
    }

    public Boolean addMTTSQL(MONTHETHAO montt) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(montt);
            transaction.commit();
            System.err.println("Ma Hoa Don " + check);
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean updateMTTSQL(MONTHETHAO montt, int id) {
        Transaction transaction = null;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            MONTHETHAO cv = session.get(MONTHETHAO.class, id);
            cv.setTENMTT(montt.getTENMTT());
            cv.setNGAYTAO(montt.getNGAYTAO());
            cv.setNGAYSUA(montt.getNGAYSUA());
            cv.setTRANGTHAI(montt.getTRANGTHAI());
            
            transaction = session.beginTransaction();
            session.save(cv);
            transaction.commit();
            
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean deleteMTTSQL(int id) {
        Transaction transaction = null;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            MONTHETHAO cv = session.get(MONTHETHAO.class, id);
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
