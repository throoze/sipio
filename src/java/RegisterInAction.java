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
    String edfe = beanForm.getEdfe();
    String usoArmasBlanca = beanForm.getUsoArmasBlanca();
    String usoArmasFuego = beanForm.getUsoArmasFuego();
    String usoObjCont = beanForm.getUsoObjCont();
    String consecABAF = beanForm.getConsecABAF();
    String tipoDanho = beanForm.getTipoDanho();
    String[] nivelArma = beanForm.getNivelArma();
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
    int numAsistentes = beanForm.getNumAsistentes();
    int numLiceo = beanForm.getNumLiceo();
    int numEmbarazadas = beanForm.getNumEmbarazadas();
    int banhoCant = beanForm.getBanhoCant();
    int cafetCant = beanForm.getCafetCant();
    int comeCant = beanForm.getComeCant();
    int bebeCant = beanForm.getBebeCant();
    int aulaCant = beanForm.getAulaCant();
    int labCant = beanForm.getLabCant();
    int canchCant = beanForm.getCanchCant();
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
            || instituto.equals("") || distEsc.equals("") || mencionDiv.equals("")
            || nombreDir.equals("") || tlfDir.equals("") || celDir.equals("")
            || emailDir.equals("") || nombreCoord.equals("") || emailCoord.equals("")
            || tlfCoord.equals("") || celCoord.equals("") || asignaturasProf.equals("")
            || matInst.equals("") || oriInd.equals("") || oriFam.equals("")
            || remProg.equals("") || oriPerSoc.equals("") || edfe.equals("")
            || usoArmasBlanca.equals("") || usoArmasFuego.equals("") || usoObjCont.equals("")
            || presAlumno.equals("") || danhoInstalacion.equals("") || condAulas.equals("")
            || condBan.equals("") || condBeb.equals("") || condCaf.equals("") || condCom.equals("")
            || condCan.equals("") || condLabs.equals("")) {
      err = true;
    }

    if (banhoCant < 0 || comeCant < 0 || cafetCant < 0 || bebeCant < 0 || aulaCant < 0
            || labCant < 0 || canchCant < 0 || numAsistentes < 0 || numEmbarazadas < 0
            || numLiceo < 0) {
      err = true;
    }

    if ((asignaturasProf.equals("no") && (descAsignaturasProf.equals("")
            || nivelAsignatura.length <= 0)) || (numEmbarazadas > 0
            && (edadEmbarazada.length <= 0 || nivelEmbarazada.length <= 0))) {
      err = true;
    }

    if ((remProg.equals("si") && remProgCuales.equals(""))
            || (oriCoord.equals("si") && oriCoordCuales.equals(""))
            || (oriSinLucro.equals("si") && oriSinLucroCuales.equals(""))) {
      err = true;
    }

    if (edfe.equals("si") && (tipoDanho.equals("") || usoArmasBlanca.equals("")
            || usoArmasFuego.equals("") || usoObjCont.equals("") || consecABAF.equals("")
            || nivelArma.length <= 0 || regArg.equals("") || accTom.equals("")
            || sexoViolento.equals(""))) {
      err = true;
    }

    if (aps.equals("si") && apsCuales.equals("")) {
      err = true;
    }

    if ((presAlumno.equals("si") && (verbalForma.length <= 0 || medidasVerbal.equals(""))) || (verbalHaciaProf.equals("si") && medidasVerbalProf.equals(""))
            || (verbalHaciaComEsc.equals("si") && (verbalComEsc.length <= 0
            || medidasVerbalComEsc.equals("")))) {
      err = true;
    }

    if (danhoInstalacion.equals("si") && danhoInstalacionCasos.length <= 0) {
      err = true;
    }
    if (err) {
      return mapping.findForward(FAILURE);
    }
    return mapping.findForward(SUCCESS);
  }
}
