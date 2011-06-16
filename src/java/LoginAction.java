/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.UsuarioHelper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pio.hibernate.Usuario;
import helpers.UsuarioHelper;

/**
 *
 * @author erick
 */
public class LoginAction extends org.apache.struts.action.Action {

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
        LoginForm formBean = (LoginForm) form;
        String uname = formBean.getUname();
        String pass = formBean.getPass();
        UsuarioHelper ush = new UsuarioHelper();
        Usuario usr = ush.Login(uname, pass);
        
        if (session.getAttribute("logged") != null) {
            return mapping.findForward(SUCCESS);
        }

        if (uname == null || pass == null
                || uname.equals("") || pass.equals("")) {
            formBean.setError(666);
            return mapping.findForward(FAILURE);
        }

        if (usr != null){
            session.setAttribute("uname", uname);
            session.setAttribute("user", usr);
            return mapping.findForward(SUCCESS);
        }
        
        formBean.setError(0);
        return mapping.findForward(FAILURE);

    }
}
