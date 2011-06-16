/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author erick
 */
public class LoginForm extends org.apache.struts.action.ActionForm {

    private String uname;
    private String pass;
    private String error;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getError() {
        return error;
    }

    public void setError(int i) {
        switch (i) {
            case 0:
                this.error =
                        "<span style = 'color:blue'> Usuario o password invalido</span>";
                break;
            default:
                this.error =
                        "<span style='color:blue'>Campos Invalidos</span>";
        }
    }

    /**
     *
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUname() == null || getUname().length() < 1) {
            errors.add("uname", new ActionMessage("error.uname.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
