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
public class RegisterInForm extends org.apache.struts.action.ActionForm {

  private String NIns, tlf, fax, email, dir, instituto, distEsc, mencionDiv;
  private String nombreDir, emailDir, tlfDir, celDir;
  private String nombreCoord, emailCoord, tlfCoord, celCoord;
  private String banho, cafetines, comedores, bebederos, aulas, labs, canchas;
  private String condBan, condCaf, condCom, condBeb, condAulas, condLabs, condCan;
  private String obsPlantaFisica;
  private String asignaturasProf, descAsignaturasProf;
  private String matInst;
  private String[] nivelAsignatura = {};
  private String[] edadEmbarazada = {};
  private String[] nivelEmbarazada = {};
  private String[] verbalComEsc = {};
  private String[] danhoInstalacionCasos = {};
  private int numAsistentes,numLiceo, numEmbarazadas;
  private int banhoCant, cafetCant, comeCant, bebeCant, aulaCant, labCant, canchCant;
  private String edfe,usoArmasBlanca,usoArmasFuego,usoObjCont,consecABAF,tipoDanho;
  private String nivelArma,regArg,accTom,causasProb,sexoViolento,aps,apsCuales;
  private String verbalForma,presAlumno,medidasVerbal,verbalHaciaProf,medidasVerbalProf;
  private String verbalHaciaComEsc,medidasVerbalComEsc,danhoInstalacion;

  public String getDanhoInstalacion() {
    return danhoInstalacion;
  }

  public void setDanhoInstalacion(String danhoInstalacion) {
    this.danhoInstalacion = danhoInstalacion;
  }

  public String[] getDanhoInstalacionCasos() {
    return danhoInstalacionCasos;
  }

  public void setDanhoInstalacionCasos(String[] danhoInstalacionCasos) {
    this.danhoInstalacionCasos = danhoInstalacionCasos;
  }

  public String getMedidasVerbalComEsc() {
    return medidasVerbalComEsc;
  }

  public void setMedidasVerbalComEsc(String medidasVerbalComEsc) {
    this.medidasVerbalComEsc = medidasVerbalComEsc;
  }

  public String getMedidasVerbalProf() {
    return medidasVerbalProf;
  }

  public void setMedidasVerbalProf(String medidasVerbalProf) {
    this.medidasVerbalProf = medidasVerbalProf;
  }

  public String[] getVerbalComEsc() {
    return verbalComEsc;
  }

  public void setVerbalComEsc(String[] verbalComEsc) {
    this.verbalComEsc = verbalComEsc;
  }

  public String getVerbalHaciaComEsc() {
    return verbalHaciaComEsc;
  }

  public void setVerbalHaciaComEsc(String verbalHaciaComEsc) {
    this.verbalHaciaComEsc = verbalHaciaComEsc;
  }

  public String getVerbalHaciaProf() {
    return verbalHaciaProf;
  }

  public void setVerbalHaciaProf(String verbalHaciaProf) {
    this.verbalHaciaProf = verbalHaciaProf;
  }

  public String getMedidasVerbal() {
    return medidasVerbal;
  }

  public void setMedidasVerbal(String medidasVerbal) {
    this.medidasVerbal = medidasVerbal;
  }

  public String getPresAlumno() {
    return presAlumno;
  }

  public void setPresAlumno(String presAlumno) {
    this.presAlumno = presAlumno;
  }

  public String getVerbalForma() {
    return verbalForma;
  }

  public void setVerbalForma(String verbalForma) {
    this.verbalForma = verbalForma;
  }

  
  public String getUsoObjCont() {
    return usoObjCont;
  }

  public void setUsoObjCont(String usoObjCont) {
    this.usoObjCont = usoObjCont;
  }
  
  public String getApsCuales() {
    return apsCuales;
  }

  public void setApsCuales(String apsCuales) {
    this.apsCuales = apsCuales;
  }

  public String getAps() {
    return aps;
  }

  public void setAps(String aps) {
    this.aps = aps;
  }

  public String getSexoViolento() {
    return sexoViolento;
  }

  public void setSexoViolento(String sexoViolento) {
    this.sexoViolento = sexoViolento;
  }

  public String getCausasProb() {
    return causasProb;
  }

  public void setCausasProb(String causasProb) {
    this.causasProb = causasProb;
  }

  public String getAccTom() {
    return accTom;
  }

  public void setAccTom(String accTom) {
    this.accTom = accTom;
  }

  public String getRegArg() {
    return regArg;
  }

  public void setRegArg(String regArg) {
    this.regArg = regArg;
  }

  public String getNivelArma() {
    return nivelArma;
  }

  public void setNivelArma(String nivelArma) {
    this.nivelArma = nivelArma;
  }
  
  public String getConsecABAF() {
    return consecABAF;
  }

  public void setConsecABAF(String consecABAF) {
    this.consecABAF = consecABAF;
  }

  public String getUsoArmasFuego() {
    return usoArmasFuego;
  }

  public void setUsoArmasFuego(String usoArmasFuego) {
    this.usoArmasFuego = usoArmasFuego;
  }

  public String getEdfe() {
    return edfe;
  }

  public void setEdfe(String edfe) {
    this.edfe = edfe;
  }

  public String getTipoDanho() {
    return tipoDanho;
  }

  public void setTipoDanho(String tipoDanho) {
    this.tipoDanho = tipoDanho;
  }

  public String getUsoArmasBlanca() {
    return usoArmasBlanca;
  }

  public void setUsoArmasBlanca(String usoArmasBlancas) {
    this.usoArmasBlanca = usoArmasBlancas;
  }
  
  
  public String[] getEdadEmbarazada() {
    return edadEmbarazada;
  }

  public void setEdadEmbarazada(String[] edadEmbarazada) {
    this.edadEmbarazada = edadEmbarazada;
  }

  public String[] getNivelEmbarazada() {
    return nivelEmbarazada;
  }

  public void setNivelEmbarazada(String[] nivelEmbarazada) {
    this.nivelEmbarazada = nivelEmbarazada;
  }

  public String getAsignaturasProf() {
    return asignaturasProf;
  }

  public void setAsignaturasProf(String asignaturasProf) {
    this.asignaturasProf = asignaturasProf;
  }

  public String getDescAsignaturasProf() {
    return descAsignaturasProf;
  }

  public void setDescAsignaturasProf(String descAsignaturasProf) {
    this.descAsignaturasProf = descAsignaturasProf;
  }

  public int getNumLiceo() {
    return numLiceo;
  }

  public void setNumLiceo(int numLiceo) {
    this.numLiceo = numLiceo;
  }
  
  public String getMatInst() {
    return matInst;
  }

  public void setMatInst(String matInst) {
    this.matInst = matInst;
  }

  public String[] getNivelAsignatura() {
    return nivelAsignatura;
  }

  public void setNivelAsignatura(String[] nivelAsignatura) {
    this.nivelAsignatura = nivelAsignatura;
  }

  public int getNumAsistentes() {
    return numAsistentes;
  }

  public void setNumAsistentes(int numAsistentes) {
    this.numAsistentes = numAsistentes;
  }

  public int getNumEmbarazadas() {
    return numEmbarazadas;
  }

  public void setNumEmbarazadas(int numEmbarazadas) {
    this.numEmbarazadas = numEmbarazadas;
  }

  public String getCondAulas() {
    return condAulas;
  }

  public void setCondAulas(String condAulas) {
    this.condAulas = condAulas;
  }

  public String getCondBan() {
    return condBan;
  }

  public void setCondBan(String condBan) {
    this.condBan = condBan;
  }

  public String getCondBeb() {
    return condBeb;
  }

  public void setCondBeb(String condBeb) {
    this.condBeb = condBeb;
  }

  public String getCondCaf() {
    return condCaf;
  }

  public void setCondCaf(String condCaf) {
    this.condCaf = condCaf;
  }

  public String getCondCan() {
    return condCan;
  }

  public void setCondCan(String condCan) {
    this.condCan = condCan;
  }

  public String getCondCom() {
    return condCom;
  }

  public void setCondCom(String condCom) {
    this.condCom = condCom;
  }

  public String getCondLabs() {
    return condLabs;
  }

  public void setCondLabs(String condLabs) {
    this.condLabs = condLabs;
  }

  public String getNIns() {
    return NIns;
  }

  public void setNIns(String NIns) {
    this.NIns = NIns;
  }

  public int getAulaCant() {
    return aulaCant;
  }

  public void setAulaCant(int aulaCant) {
    this.aulaCant = aulaCant;
  }

  public String getAulas() {
    return aulas;
  }

  public void setAulas(String aulas) {
    this.aulas = aulas;
  }

  public String getBanho() {
    return banho;
  }

  public void setBanho(String banho) {
    this.banho = banho;
  }

  public int getBanhoCant() {
    return banhoCant;
  }

  public void setBanhoCant(int banhoCant) {
    this.banhoCant = banhoCant;
  }

  public int getBebeCant() {
    return bebeCant;
  }

  public void setBebeCant(int bebeCant) {
    this.bebeCant = bebeCant;
  }

  public String getBebederos() {
    return bebederos;
  }

  public void setBebederos(String bebederos) {
    this.bebederos = bebederos;
  }

  public int getCafetCant() {
    return cafetCant;
  }

  public void setCafetCant(int cafetCant) {
    this.cafetCant = cafetCant;
  }

  public String getCafetines() {
    return cafetines;
  }

  public void setCafetines(String cafetines) {
    this.cafetines = cafetines;
  }

  public int getCanchCant() {
    return canchCant;
  }

  public void setCanchCant(int canchCant) {
    this.canchCant = canchCant;
  }

  public String getCanchas() {
    return canchas;
  }

  public void setCanchas(String canchas) {
    this.canchas = canchas;
  }

  public String getCelCoord() {
    return celCoord;
  }

  public void setCelCoord(String celCoord) {
    this.celCoord = celCoord;
  }

  public String getCelDir() {
    return celDir;
  }

  public void setCelDir(String celDir) {
    this.celDir = celDir;
  }

  public int getComeCant() {
    return comeCant;
  }

  public void setComeCant(int comeCant) {
    this.comeCant = comeCant;
  }

  public String getComedores() {
    return comedores;
  }

  public void setComedores(String comedores) {
    this.comedores = comedores;
  }

  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public String getDistEsc() {
    return distEsc;
  }

  public void setDistEsc(String distEsc) {
    this.distEsc = distEsc;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmailCoord() {
    return emailCoord;
  }

  public void setEmailCoord(String emailCoord) {
    this.emailCoord = emailCoord;
  }

  public String getEmailDir() {
    return emailDir;
  }

  public void setEmailDir(String emailDir) {
    this.emailDir = emailDir;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getInstituto() {
    return instituto;
  }

  public void setInstituto(String instituto) {
    this.instituto = instituto;
  }

  public int getLabCant() {
    return labCant;
  }

  public void setLabCant(int labCant) {
    this.labCant = labCant;
  }

  public String getLabs() {
    return labs;
  }

  public void setLabs(String labs) {
    this.labs = labs;
  }

  public String getMencionDiv() {
    return mencionDiv;
  }

  public void setMencionDiv(String mencionDiv) {
    this.mencionDiv = mencionDiv;
  }

  public String getNombreCoord() {
    return nombreCoord;
  }

  public void setNombreCoord(String nombreCoord) {
    this.nombreCoord = nombreCoord;
  }

  public String getNombreDir() {
    return nombreDir;
  }

  public void setNombreDir(String nombreDir) {
    this.nombreDir = nombreDir;
  }

  public String getObsPlantaFisica() {
    return obsPlantaFisica;
  }

  public void setObsPlantaFisica(String obsPlantaFisica) {
    this.obsPlantaFisica = obsPlantaFisica;
  }

  public String getTlf() {
    return tlf;
  }

  public void setTlf(String tlf) {
    this.tlf = tlf;
  }

  public String getTlfCoord() {
    return tlfCoord;
  }

  public void setTlfCoord(String tlfCoord) {
    this.tlfCoord = tlfCoord;
  }

  public String getTlfDir() {
    return tlfDir;
  }

  public void setTlfDir(String tlfDir) {
    this.tlfDir = tlfDir;
  }

  /**
   *
   */
  public RegisterInForm() {
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
    if (getNIns() == null || getNIns().length() < 1) {
      errors.add("name", new ActionMessage("error.name.required"));
      // TODO: add 'error.name.required' key to your resources
    }
    return errors;
  }
}
