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
        String name = formBean.getNombre();
        String apellido = formBean.getApellido();
        String cedula = formBean.getCedula();
        String correo = formBean.getCorreo();
        String direccion = formBean.getDireccion();
        String sexo = formBean.getSexo();
        String carrera1 = formBean.getCarrera1();
        String carrera2 = formBean.getCarrera2();
        String carrera3 = formBean.getCarrera3();
        String tlf = formBean.getTelefono();
        int promedio = formBean.getPromedio();
        boolean err = false;
        
        if(name == null || apellido == null || cedula == null
                || correo == null || direccion == null ||
                sexo == null || carrera1 == null || 
                carrera2 == null || carrera3 == null){
          err = true;
        }
        
        if(err){
          return mapping.findForward(FAILURE);
        }
        return mapping.findForward(SUCCESS);
    }
}
