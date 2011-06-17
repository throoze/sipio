/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loadStudents;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
//import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author victor
 */
public class UploadStudentsForm extends org.apache.struts.action.ActionForm {
    private FormFile uploadedFile;
    private String plantelName;
    private String studentName;
    private String numHoras;
    
    public UploadStudentsForm() {
    }

    public UploadStudentsForm(FormFile uploadedFile, String plantelName, String studentName, String numHoras) {
        this.uploadedFile = uploadedFile;
        this.plantelName = plantelName;
        this.studentName = studentName;
        this.numHoras = numHoras;
    }

    public String getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(String numHoras) {
        this.numHoras = numHoras;
    }

    public String getPlantelName() {
        return plantelName;
    }

    public void setPlantelName(String plantelName) {
        this.plantelName = plantelName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public FormFile getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(FormFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        //ActionErrors errors = new ActionErrors();
        /*if (getName() == null || getName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }*/
        //return errors;
        return null;
    }
}
