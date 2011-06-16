/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author giuseppe
 */
public class ListarPlantForm extends org.apache.struts.action.ActionForm {
    
    private List planteles;

    public List getPlanteles() {
        return planteles;
    }

    public void setPlanteles(List planteles) {
        this.planteles = planteles;
    }
 
    /**
     *
     */
    public ListarPlantForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getPlanteles() == null) {
            errors.add("plantel", new ActionMessage("error.plantel.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
