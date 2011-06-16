/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.PlantelHelper;
import java.math.BigDecimal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pio.hibernate.EstudianteBachillerato;
import pio.hibernate.PerfilUsuario;
import pio.hibernate.Plantel;
import pio.hibernate.Usuario;
import helpers.UsuarioHelper;

/**
 *
 * @author erick
 */
public class RegisterAlAction extends org.apache.struts.action.Action {

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
        RegisterAlForm formBean = (RegisterAlForm) form;
        String nombre = formBean.getNombre();
        String apellido = formBean.getApellido();
        String cedula = formBean.getCedula();
        String correo = formBean.getCorreo();
        String sexo = formBean.getSexo();
        String uname = cedula;
        String nombrePlantel = formBean.getNombrePlantel();
        String carrera1 = formBean.getCarrera1();
        String carrera2 = formBean.getCarrera2();
        String carrera3 = formBean.getCarrera3();
        BigDecimal promedio = formBean.getPromedio();
        boolean err = false;
        char esSuperusuario = 'N';
        UsuarioHelper ush = new UsuarioHelper();
        PlantelHelper plh = new PlantelHelper();
        boolean usr = ush.userExists(uname);
        String pass = formBean.generarPass();
        boolean error0 = false;
        boolean error1=false;
        char s = 'f';
        formBean.cleanErrors();
        
        
        
        boolean t = sexo.equals("");
                
        
        if (nombre.equals("") ||  apellido.equals("") || cedula.equals("")
                || correo.equals("") || sexo != null || nombrePlantel.equals("")
                || carrera1.equals("") || carrera2.equals("") || carrera3.equals("")) {
            formBean.setError0("<span style='color:blue'>No puede haber campos vacios</span>");
            error0 = true;
        }

        if (usr && !uname.equals("")) {
            formBean.setError1("<span style='color:blue'>Usuario ya existe</span>");
            err = true;
        }

        if (err) {
            return mapping.findForward(FAILURE);
        }
        
        if (sexo.equals("Masculino"))  {
            s = 'm';
        }
        Usuario newUser = new Usuario(uname, pass);
        PerfilUsuario newPUser = new PerfilUsuario(uname, newUser, Integer.parseInt(cedula), nombre, apellido, correo, esSuperusuario);
        Plantel pl = null;
        session.setAttribute("plant", nombrePlantel);
        if(nombrePlantel==null) {
            return mapping.findForward(SUCCESS);
        }
        
        pl = plh.getPlantel(nombrePlantel);
       
       
        EstudianteBachillerato est = new EstudianteBachillerato(uname, newPUser, pl, s,(BigDecimal) promedio, carrera1, carrera2, carrera3, "ok");
        ush.addUser(newUser, newPUser,est);


        return mapping.findForward(SUCCESS);
    }
}
