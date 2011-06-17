/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import org.hibernate.Query;
import org.hibernate.Session;
import pio.hibernate.EstudianteBachillerato;
import pio.hibernate.HibernateUtil;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author giuseppe
 */
public class EstudianteHelper {

    Session session = null;

    public EstudianteHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public boolean estudianteExists(String newEst) {
        EstudianteBachillerato user = null;
        if (newEst.equals("")) {
            return user == null;
        }

        try {
            Query q = session.createQuery("from EstudianteBachillerato as user where user.='" + newEst + "'");
            user = (EstudianteBachillerato) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (user == null) {
            return false;
        }
        return true;
    }

    public EstudianteBachillerato getEstudiante(String nombre) {
        EstudianteBachillerato pl = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from EstudianteBachillerato as pl where pl.usuario='" + nombre + "'");
            pl = (EstudianteBachillerato) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pl;
    }
}
