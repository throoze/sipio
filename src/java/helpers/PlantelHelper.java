/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;
import org.hibernate.Query;
import org.hibernate.Session;
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
}