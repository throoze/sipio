/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.EstudianteHelper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pio.hibernate.EstudianteBachillerato;

/**
 *
 * @author giuseppe
 */
public class consultarAlAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

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
        consultarAlForm formBean = (consultarAlForm) form;
        String cedula = formBean.getCedula();
        EstudianteHelper EH = new EstudianteHelper();
        EstudianteBachillerato pp = EH.getEstudiante(cedula);
        
        form = new RegisterAlForm();
        RegisterAlForm formBean2 = (RegisterAlForm) form;
        
        formBean.setUsuario(pp.getUsuario());
        formBean.setNombre((pp.getPerfilUsuario()).getPrimerNombre());
        formBean.setApellido((pp.getPerfilUsuario()).getPrimerApellido());
        formBean.setEmail((pp.getPerfilUsuario()).getEmail());
        formBean.setPlantel((pp.getPlantel()).getNombrePlantel());
        formBean.setSexo(pp.getSexo());
        formBean.setCarrera1(pp.getCarrera1());
        formBean.setCarrera2(pp.getCarrera2());
        formBean.setCarrera3(pp.getCarrera3());
 
        return mapping.findForward(SUCCESS);
    }
}
