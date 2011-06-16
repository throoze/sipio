/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import org.hibernate.Query;
import org.hibernate.Session;
import pio.hibernate.HibernateUtil;
import pio.hibernate.Usuario;
import pio.hibernate.PerfilUsuario;

/**
 *
 * @author erick
 */
public class UsuarioHelper {

  Session session = null;

  public UsuarioHelper() {
    this.session = HibernateUtil.getSessionFactory().getCurrentSession();
  }

  public Usuario Login(String User, String Pass) {
    Usuario user = null;
    try {
      org.hibernate.Transaction tx = session.beginTransaction();
      Query q = session.createQuery("from Usuario as user where user.nombreUsuario='" + User + "' and user.contrasenia='" + Pass + "'");
      user = (Usuario) q.uniqueResult();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return user;
  }

  public boolean userExists(String newUser) {
    Usuario user = null;
    if(newUser.equals("")){
      return user==null;
    }
    try {
      Query q = session.createQuery("from Usuario as user where user.nombreUsuario='" + newUser + "'");
      user = (Usuario) q.uniqueResult();
    } catch (Exception e) {
      e.printStackTrace();
    }
    if(user==null){
      return false;
    }
    return true;
  }
  
  public void addUser(Usuario User,PerfilUsuario PUser){
    org.hibernate.Transaction tx = session.beginTransaction();
    session.save((Object)User);
    session.save((Object)PUser);
    tx.commit();
  }
}
