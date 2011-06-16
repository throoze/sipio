/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;
import org.hibernate.cfg.Configuration;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pio.hibernate.HibernateUtil;
import pio.hibernate.Plantel;

/**
 *
 * @author erick
 */
public class PlantelHelper {
  Session session;
  public PlantelHelper() {
    this.session = HibernateUtil.getSessionFactory().getCurrentSession();
  }
  
  public boolean existePlantel(String nomPlantel){
    Plantel pl = null;
    try{
      Query q = session.createQuery("from Plantel as pl where pl.nombrePlantel='"+nomPlantel+"'");
      pl = (Plantel)q.uniqueResult();
    }catch(Exception e){
      e.printStackTrace();
    }
    if(pl != null){
      return true;
    }
    return false;
  }
  
  public void agrPlantel(Plantel pl){
    org.hibernate.Transaction tx = session.beginTransaction();
    session.save((Object)pl);
    tx.commit();
  }
  
 public List listarPlanteles() {
        Plantel pl = null;
        SessionFactory sf;
        List planteles = null;

        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            String q = "from Plantel as pl";
            planteles = session.createQuery(q).list();
            session.close();
            return planteles;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Plantel getPlantel(String nombre) {
        Plantel pl = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Plantel as pl where pl.nombrePlantel='" + nombre + "'");
            pl = (Plantel) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pl;
    }
}