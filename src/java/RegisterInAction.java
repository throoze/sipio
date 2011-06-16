/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pio.hibernate.Plantel;
import helpers.PlantelHelper;

/**
 *
 * @author erick
 */
public class RegisterInAction extends org.apache.struts.action.Action {

  /* forward name="success" path="" */
  private static final String SUCCESS = "success";
  private static final String FAILURE = "failure";

  /**
   * This is the action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   * @throws java.lang.Exception
   * @return
   */
  @Override
  public ActionForward execute(ActionMapping mapping, ActionForm form,
          HttpServletRequest request, HttpServletResponse response)
          throws Exception {
    HttpSession session = request.getSession();
    RegisterInForm beanForm = (RegisterInForm) form;
    String nins = beanForm.getNIns();
    String tlf = beanForm.getTlf();
    String fax = beanForm.getFax();
    String email = beanForm.getEmail();
    String dir = beanForm.getDir();
    String instituto = beanForm.getInstituto();
    String distEsc = beanForm.getDistEsc();
    String mencionDiv = beanForm.getMencionDiv();
    String nombreDir = beanForm.getNombreDir();
    String emailDir = beanForm.getEmailDir();
    String tlfDir = beanForm.getTlfDir();
    String celDir = beanForm.getCelDir();
    String nombreCoord = beanForm.getNombreCoord();
    String emailCoord = beanForm.getEmailCoord();
    String tlfCoord = beanForm.getTlfCoord();
    String celCoord = beanForm.getCelCoord();
    String banho = beanForm.getBanho();
    String cafetines = beanForm.getCafetines();
    String comedores = beanForm.getComedores();
    String bebederos = beanForm.getBebederos();
    String aulas = beanForm.getAulas();
    String labs = beanForm.getLabs();
    String canchas = beanForm.getCanchas();
    String condBan = beanForm.getCondBan();
    String condCaf = beanForm.getCondCaf();
    String condCom = beanForm.getCondCom();
    String condBeb = beanForm.getCondBeb();
    String condAulas = beanForm.getCondAulas();
    String condLabs = beanForm.getCondLabs();
    String condCan = beanForm.getCondCan();
    String obsPlantaFisica = beanForm.getObsPlantaFisica();
    String asignaturasProf = beanForm.getAsignaturasProf();
    String descAsignaturasProf = beanForm.getDescAsignaturasProf();
    String matInst = beanForm.getMatInst();
    String[] nivelAsignatura = beanForm.getNivelAsignatura();
    String[] edadEmbarazada = beanForm.getEdadEmbarazada();
    String[] nivelEmbarazada = beanForm.getNivelEmbarazada();
    String[] verbalComEsc = beanForm.getVerbalComEsc();
    String[] danhoInstalacionCasos = beanForm.getDanhoInstalacionCasos();
    String[] nivelArma = beanForm.getNivelArma();
    String edfe = beanForm.getEdfe();
    String usoArmasBlanca = beanForm.getUsoArmasBlanca();
    String usoArmasFuego = beanForm.getUsoArmasFuego();
    String usoObjCont = beanForm.getUsoObjCont();
    String consecABAF = beanForm.getConsecABAF();
    String tipoDanho = beanForm.getTipoDanho();
    String regArg = beanForm.getRegArg();
    String accTom = beanForm.getAccTom();
    String causasProb = beanForm.getCausasProb();
    String sexoViolento = beanForm.getSexoViolento();
    String aps = beanForm.getAps();
    String apsCuales = beanForm.getApsCuales();
    String verbalForma[] = beanForm.getVerbalForma();
    String presAlumno = beanForm.getPresAlumno();
    String medidasVerbal = beanForm.getMedidasVerbal();
    String verbalHaciaProf = beanForm.getVerbalHaciaProf();
    String medidasVerbalProf = beanForm.getMedidasVerbalProf();
    String verbalHaciaComEsc = beanForm.getVerbalHaciaComEsc();
    String medidasVerbalComEsc = beanForm.getMedidasVerbalComEsc();
    String danhoInstalacion = beanForm.getDanhoInstalacion();
    String numAsistentes = beanForm.getNumAsistentes();
    String numLiceo = beanForm.getNumLiceo();
    String numEmbarazadas = beanForm.getNumEmbarazadas();
    String banhoCant = beanForm.getBanhoCant();
    String cafetCant = beanForm.getCafetCant();
    String comeCant = beanForm.getComeCant();
    String bebeCant = beanForm.getBebeCant();
    String aulaCant = beanForm.getAulaCant();
    String labCant = beanForm.getLabCant();
    String canchCant = beanForm.getCanchCant();
    String oriInd = beanForm.getOriInd();
    String oriFam = beanForm.getOriFam();
    String remProg = beanForm.getRemProg();
    String remProgCuales = beanForm.getRemProgCuales();
    String oriPerSoc = beanForm.getOriPerSoc();
    String nivelOriPerSoc = beanForm.getNivelOriPerSoc();
    String nivelOriPerSocCuales = beanForm.getNivelOriPerSocCuales();
    String oriCoord = beanForm.getOriCoord();
    String oriCoordCuales = beanForm.getOriCoordCuales();
    String oriSinLucro = beanForm.getOriSinLucro();
    String oriSinLucroCuales = beanForm.getOriSinLucroCuales();
    boolean err = false;

    if (nins.equals("") || tlf.equals("") || email.equals("") || dir.equals("")
            || instituto == null || distEsc.equals("") || mencionDiv.equals("")
            || nombreDir.equals("") || tlfDir.equals("") || celDir.equals("")
            || emailDir.equals("") || nombreCoord.equals("") || emailCoord.equals("")
            || tlfCoord.equals("") || celCoord.equals("")) {
      err = true;
      return mapping.findForward(FAILURE);
    }

    if (asignaturasProf != null && asignaturasProf.equals("no")
            && (descAsignaturasProf.equals("")
            || descAsignaturasProf.equals("Si es negativa la respuesta: Cual asignatura? y por que?"))
            && (nivelAsignatura == null || nivelAsignatura.length <= 0)) {
      err = true;
      return mapping.findForward(FAILURE);
    }

    if (!numEmbarazadas.equals("") && Integer.parseInt(numEmbarazadas) < 0
            && ((edadEmbarazada == null || edadEmbarazada.length <= 0)
            || nivelEmbarazada == null || nivelEmbarazada.length <= 0)) {
      err = true;
      return mapping.findForward(FAILURE);
    }

    if (remProg != null && remProg.equals("si") && (remProgCuales.equals("")
            || remProgCuales.equals("Cuales"))) {
      return mapping.findForward(FAILURE);
    }

    if (oriPerSoc != null && oriPerSoc.equals("si") && (nivelOriPerSoc == null
            || oriCoord == null || oriSinLucro == null)) {
      return mapping.findForward(FAILURE);
    }

    if ((nivelOriPerSoc != null && nivelOriPerSoc.equals("si")
            && (nivelOriPerSocCuales.equals("")
            || nivelOriPerSocCuales.equals("Cuales")))
            || (oriCoord != null && oriCoord.equals("si")
            && (oriCoordCuales.equals("") || oriCoordCuales.equals("Cuales")))
            || (oriSinLucro != null && oriSinLucro.equals("si")
            && (oriSinLucroCuales.equals("") || oriSinLucroCuales.equals("Cuales")))) {
      return mapping.findForward(FAILURE);
    }

    if (edfe != null && edfe.equals("si") && ((tipoDanho.equals("")
            || tipoDanho.equals("Tipo de daño")) || usoArmasBlanca == null
            || usoArmasFuego == null || usoObjCont == null)) {
      return mapping.findForward(FAILURE);
    }

    if (edfe != null && edfe.equals("si") && ((nivelArma == null
            || nivelArma.length <= 0) || (regArg == null || (regArg.equals("si")
            && accTom.equals(""))) || (sexoViolento == null)
            || (aps == null || (aps.equals("si") && (apsCuales.equals("")
            || apsCuales.equals("Cuales")))))) {
      return mapping.findForward(FAILURE);
    }

    if (presAlumno != null && presAlumno.equals("si") && ((verbalForma == null
            || verbalForma.length <= 0) || (medidasVerbal.equals("")
            || medidasVerbal.equals("Medidas tomadas")) || (verbalHaciaProf == null
            || (verbalHaciaProf.equals("si") && (medidasVerbalProf.equals("")
            || medidasVerbalProf.equals("Medidas tomadas"))) || (verbalHaciaComEsc == null
            || (verbalHaciaComEsc.equals("si") && ((verbalComEsc == null
            || verbalComEsc.length <= 0) || (medidasVerbalComEsc.equals("")
            || medidasVerbalComEsc.equals("Medidas tomadas")))))))) {
      return mapping.findForward(FAILURE);
    }

    if (danhoInstalacion != null && danhoInstalacion.equals("si")
            && (danhoInstalacionCasos == null || danhoInstalacionCasos.length <= 0)) {
      return mapping.findForward(FAILURE);
    }
    int idplantel = 1;
    PlantelHelper plh = new PlantelHelper();
    if (!plh.existePlantel(nins)) {
      Plantel pl = new Plantel(idplantel, nins, instituto, Integer.parseInt(numLiceo), dir, nombreDir, nombreCoord);
      plh.agrPlantel(pl);
    } else {
      return mapping.findForward(FAILURE);
    }
    return mapping.findForward(SUCCESS);
  }
}
