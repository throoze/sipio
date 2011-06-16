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
public class RegisterAlForm extends org.apache.struts.action.ActionForm {

    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String correo;
    private String telefono;
    private String carrera1;
    private String carrera2;
    private String carrera3;
    private String sexo;
    private int promedio;

  public int getPromedio() {
    return promedio;
  }

  public void setPromedio(int promedio) {
    this.promedio = promedio;
  }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera1() {
        return carrera1;
    }

    public void setCarrera1(String carrera1) {
        this.carrera1 = carrera1;
    }

    public String getCarrera2() {
        return carrera2;
    }

    public void setCarrera2(String carrera2) {
        this.carrera2 = carrera2;
    }

    public String getCarrera3() {
        return carrera3;
    }

    public void setCarrera3(String carrera3) {
        this.carrera3 = carrera3;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNombre() == null || getNombre().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
