package pio.hibernate;
// Generated 16/06/2011 03:01:40 PM by Hibernate Tools 3.2.1.GA



/**
 * TelefonoU generated by hbm2java
 */
public class TelefonoU  implements java.io.Serializable {


     private TelefonoUId id;
     private PerfilUsuario perfilUsuario;

    public TelefonoU() {
    }

    public TelefonoU(TelefonoUId id, PerfilUsuario perfilUsuario) {
       this.id = id;
       this.perfilUsuario = perfilUsuario;
    }
   
    public TelefonoUId getId() {
        return this.id;
    }
    
    public void setId(TelefonoUId id) {
        this.id = id;
    }
    public PerfilUsuario getPerfilUsuario() {
        return this.perfilUsuario;
    }
    
    public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }




}


