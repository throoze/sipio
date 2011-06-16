/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.PlantelHelper;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author giuseppe
 */
public class ListarPlantAction extends org.apache.struts.action.Action {

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
        ListarPlantForm formbean = (ListarPlantForm) form;
        PlantelHelper ush = new PlantelHelper();
        List planteles = ush.listarPlanteles();
        session.setAttribute("planteles", planteles);
        return mapping.findForward(SUCCESS);

    }
}
