package pio.hibernate;
// Generated 16/06/2011 03:01:40 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;

/**
 * ViolenciaVerbal generated by hbm2java
 */
public class ViolenciaVerbal  implements java.io.Serializable {


     private int plantel;
     private char agresionesVerbales;
     private String tipoAgresion;
     private String medidas1;
     private char profesores;
     private String medidas2;
     private char otroMiembro;
     private Serializable cualMiembro;
     private String medidas3;

    public ViolenciaVerbal() {
    }

	
    public ViolenciaVerbal(int plantel, char agresionesVerbales, char profesores, char otroMiembro) {
        this.plantel = plantel;
        this.agresionesVerbales = agresionesVerbales;
        this.profesores = profesores;
        this.otroMiembro = otroMiembro;
    }
    public ViolenciaVerbal(int plantel, char agresionesVerbales, String tipoAgresion, String medidas1, char profesores, String medidas2, char otroMiembro, Serializable cualMiembro, String medidas3) {
       this.plantel = plantel;
       this.agresionesVerbales = agresionesVerbales;
       this.tipoAgresion = tipoAgresion;
       this.medidas1 = medidas1;
       this.profesores = profesores;
       this.medidas2 = medidas2;
       this.otroMiembro = otroMiembro;
       this.cualMiembro = cualMiembro;
       this.medidas3 = medidas3;
    }
   
    public int getPlantel() {
        return this.plantel;
    }
    
    public void setPlantel(int plantel) {
        this.plantel = plantel;
    }
    public char getAgresionesVerbales() {
        return this.agresionesVerbales;
    }
    
    public void setAgresionesVerbales(char agresionesVerbales) {
        this.agresionesVerbales = agresionesVerbales;
    }
    public String getTipoAgresion() {
        return this.tipoAgresion;
    }
    
    public void setTipoAgresion(String tipoAgresion) {
        this.tipoAgresion = tipoAgresion;
    }
    public String getMedidas1() {
        return this.medidas1;
    }
    
    public void setMedidas1(String medidas1) {
        this.medidas1 = medidas1;
    }
    public char getProfesores() {
        return this.profesores;
    }
    
    public void setProfesores(char profesores) {
        this.profesores = profesores;
    }
    public String getMedidas2() {
        return this.medidas2;
    }
    
    public void setMedidas2(String medidas2) {
        this.medidas2 = medidas2;
    }
    public char getOtroMiembro() {
        return this.otroMiembro;
    }
    
    public void setOtroMiembro(char otroMiembro) {
        this.otroMiembro = otroMiembro;
    }
    public Serializable getCualMiembro() {
        return this.cualMiembro;
    }
    
    public void setCualMiembro(Serializable cualMiembro) {
        this.cualMiembro = cualMiembro;
    }
    public String getMedidas3() {
        return this.medidas3;
    }
    
    public void setMedidas3(String medidas3) {
        this.medidas3 = medidas3;
    }




}

