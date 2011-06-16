package pio.hibernate;
// Generated 16/06/2011 03:01:40 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;

/**
 * ObsAA generated by hbm2java
 */
public class ObsAA  implements java.io.Serializable {


     private int plantel;
     private Plantel plantel_1;
     private char profAsig;
     private String asignaturas;
     private Serializable nivel;
     private String motivo;

    public ObsAA() {
    }

	
    public ObsAA(int plantel, Plantel plantel_1, char profAsig) {
        this.plantel = plantel;
        this.plantel_1 = plantel_1;
        this.profAsig = profAsig;
    }
    public ObsAA(int plantel, Plantel plantel_1, char profAsig, String asignaturas, Serializable nivel, String motivo) {
       this.plantel = plantel;
       this.plantel_1 = plantel_1;
       this.profAsig = profAsig;
       this.asignaturas = asignaturas;
       this.nivel = nivel;
       this.motivo = motivo;
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
    public char getProfAsig() {
        return this.profAsig;
    }
    
    public void setProfAsig(char profAsig) {
        this.profAsig = profAsig;
    }
    public String getAsignaturas() {
        return this.asignaturas;
    }
    
    public void setAsignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }
    public Serializable getNivel() {
        return this.nivel;
    }
    
    public void setNivel(Serializable nivel) {
        this.nivel = nivel;
    }
    public String getMotivo() {
        return this.motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }




}

