/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pio.hibernate.PerfilUsuario;
import pio.hibernate.Usuario;
import helpers.UsuarioHelper;

/**
 *
 * @author erick
 */
public class RegisterUsrAction extends org.apache.struts.action.Action {

  /* forward name="success" path="" */
  private static final String SUCCESS = "success";
  private static final String FAILURE = "failure";

  /**
   * This is the action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   * @throws java.lang.Exception
   * @return
   */
  @Override
  public ActionForward execute(ActionMapping mapping, ActionForm form,
          HttpServletRequest request, HttpServletResponse response)
          throws Exception {

    HttpSession session = request.getSession();
    RegisterUsrForm beanForm = (RegisterUsrForm) form;
    String uname = beanForm.getUname();
    String pass = beanForm.getPass();
    String correo = beanForm.getCorreo();
    String cedula = beanForm.getCedula();
    String nombre = beanForm.getNombre();
    String apellido = beanForm.getApellido();
    String repass = beanForm.getRepass();
    char esSuperusuario = 'N';
    UsuarioHelper ush = new UsuarioHelper();
    boolean usr = ush.userExists(uname);
    boolean err = false;
    beanForm.cleanErrors();
    if (correo.equals("") || cedula.equals("") || pass.equals("") || 
            repass.equals("") || nombre.equals("") || apellido.equals("")
            || uname.equals("")) {
      beanForm.setError2("<span style='color:blue'>No puede haber campos vacios</span>");
      err = true;
    }
    if (usr && !uname.equals("")) {
      beanForm.setError0("<span style='color:blue'>Usuario ya existe</span>");
      err = true;
    }
    if (!pass.equals(repass)) {
      beanForm.setError1("<span style='color:blue'>Contrasenas no coinciden</span>");
      err = true;
    }
    if (err) {
      return mapping.findForward(FAILURE);
    }
    Usuario newUser = new Usuario(uname, pass);
    PerfilUsuario newPUser = new PerfilUsuario(uname, newUser, Integer.parseInt(cedula), nombre, apellido, correo, esSuperusuario);
    ush.addUser(newUser, newPUser);
    return mapping.findForward(SUCCESS);
  }
}
