package pio.hibernate;
// Generated 16/06/2011 03:01:40 PM by Hibernate Tools 3.2.1.GA



/**
 * ServiciosPlantel generated by hbm2java
 */
public class ServiciosPlantel  implements java.io.Serializable {


     private int plantel;
     private Plantel plantel_1;
     private String tipo;
     private Integer cantidad;
     private String condicion;
     private String observacion;

    public ServiciosPlantel() {
    }

	
    public ServiciosPlantel(int plantel, Plantel plantel_1, String tipo, String condicion) {
        this.plantel = plantel;
        this.plantel_1 = plantel_1;
        this.tipo = tipo;
        this.condicion = condicion;
    }
    public ServiciosPlantel(int plantel, Plantel plantel_1, String tipo, Integer cantidad, String condicion, String observacion) {
       this.plantel = plantel;
       this.plantel_1 = plantel_1;
       this.tipo = tipo;
       this.cantidad = cantidad;
       this.condicion = condicion;
       this.observacion = observacion;
    }
   
    public int getPlantel() {
        return this.plantel;
    }
    
    public void setPlantel(int plantel) {
        this.plantel = plantel;
    }
    public Plantel getPlantel_1() {
        return this.plantel_1;
    }
    
    public void setPlantel_1(Plantel plantel_1) {
        this.plantel_1 = plantel_1;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getCondicion() {
        return this.condicion;
    }
    
    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }




}

