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
public class RegisterUsrForm extends org.apache.struts.action.ActionForm {
  
  private String uname;
  private String pass;
  private String repass;
  private String correo;
  private String cedula;
  private String nombre;
  private String apellido;
  private String error0;
  private String error1;
  private String error2;
  private String error3;

  public String getError0() {
    return error0;
  }

  public void setError0(String error0) {
    this.error0 = error0;
  }

  public String getError1() {
    return error1;
  }

  public void setError1(String error1) {
    this.error1 = error1;
  }

  public String getError2() {
    return error2;
  }

  public void setError2(String error2) {
    this.error2 = error2;
  }

  public String getError3() {
    return error3;
  }

  public void setError3(String error3) {
    this.error3 = error3;
  }

  public String getRepass() {
    return repass;
  }

  public void setRepass(String repass) {
    this.repass = repass;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }
  
  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

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
  
  public void cleanErrors(){
    this.error0 = null;
    this.error1 = null;
    this.error2 = null;
    this.error3 = null;
  }
  /**
   *
   */
  public RegisterUsrForm() {
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
    if (getUname() == null || getUname().length() < 1) {
      errors.add("name", new ActionMessage("error.name.required"));
      // TODO: add 'error.name.required' key to your resources
    }
    return errors;
  }
}
