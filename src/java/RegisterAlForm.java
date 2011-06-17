/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.PlantelHelper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import pio.hibernate.Plantel;

/**
 *
 * @author erick
 */
public class RegisterAlForm extends org.apache.struts.action.ActionForm {

    private List listaPlanteles;
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String sexo;
    private String nombrePlantel;
    private BigDecimal promedio;
    private String carrera1;
    private String carrera2;
    private String carrera3;
    private String error0;
    private String error1;
    private static final char[] alfanumerico = new char[36];
    private final Random random = new Random();
    private final char[] buf = new char[6];

    static {
        for (int i = 0; i < 10; i++) {
            alfanumerico[i] = (char) ('0' + i);
        }
        for (int i = 10; i < 36; i++) {
            alfanumerico[i] = (char) ('a' + i - 10);
        }
    }

    public void cleanErrors() {
        this.error0 = null;
    }

    public String getError0() {
        return error0;
    }
    
    public List getListaPlanteles() {
        PlantelHelper pl = new PlantelHelper();
        listaPlanteles = pl.listarPlanteles();
        return listaPlanteles;
    }

    public void setListaPlanteles(List listaPlanteles) {
        this.listaPlanteles = listaPlanteles;
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
    public String getNombrePlantel() {
        return nombrePlantel;
    }

    public void setNombrePlantel(String plantel) {
        this.nombrePlantel = plantel;
    }

    public BigDecimal getPromedio() {
        return promedio;
    }

    public void setPromedio(BigDecimal promedio) {
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

    public String generarPass() {
        for (int i = 0; i < 6; ++i) {
            buf[i] = alfanumerico[random.nextInt(alfanumerico.length)];
        }
        return new String(buf);
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
