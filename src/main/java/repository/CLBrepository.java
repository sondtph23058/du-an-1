package repository;

import ConfigHibernate.HibernateConfig;
import java.util.ArrayList;
import javax.persistence.Query;
import model.CLB;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CLBrepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<CLB> getList() {
        session = HibernateConfig.getFACTORY().openSession();
        Query q = session.createQuery("From CLB");
        ArrayList<CLB> list = (ArrayList<CLB>) q.getResultList();
        return list;
    }

    public Boolean add(CLB CLB) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(CLB);
            transaction.commit();
            System.err.println("Ma Hoa Don " + check);
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Boolean update(CLB CLB, int id) {
        Transaction transaction = null;
        Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            CLB clb = session.get(CLB.class, id);
            clb.setMAMTT(CLB.getMAMTT());
            clb.setTENCLB(CLB.getTENCLB());
            clb.setNGAYTAO(CLB.getNGAYTAO());
            clb.setNGAYSUA(CLB.getNGAYSUA());
            clb.setTRANGTHAI(CLB.getTRANGTHAI());

            transaction = session.beginTransaction();
            session.update(clb);
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
            CLB clb = session.get(CLB.class, id);
            transaction = session.beginTransaction();
            session.delete(clb);
            transaction.commit();
            return check > 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
