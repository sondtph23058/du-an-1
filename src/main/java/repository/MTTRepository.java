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
        session = HibernateConfig.getFACTORY().openSession();
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
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            MONTHETHAO mtt = session.get(MONTHETHAO.class, id);
            mtt.setTENMTT(montt.getTENMTT());
            mtt.setNGAYTAO(montt.getNGAYTAO());
            mtt.setNGAYSUA(montt.getNGAYSUA());
            mtt.setTRANGTHAI(montt.getTRANGTHAI());

            transaction = session.beginTransaction();
            session.update(mtt);
            transaction.commit();

            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean deleteMTTSQL(int id) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            MONTHETHAO mtt = session.get(MONTHETHAO.class, id);
            transaction = session.beginTransaction();
            session.delete(mtt);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
