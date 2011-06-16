<%-- 
    Document   : HomeLogin
    Created on : May 18, 2011, 6:54:20 PM
    Author     : erick
--%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <%
      String uname = (String) session.getAttribute("uname");
    %>
    <script type="text/javascript">
      function setValue(field)
      {
        if(''!=field.defaultValue)
        {
          if(field.value==field.defaultValue)
          {
            field.value='';
          }
          else if(''==field.value)
          {
            field.value=field.defaultValue;
          }
        }
      }
    </script>
    <meta name="keywords" content="" /> 
    <meta name="description" content="" /> 
    <meta http-equiv="content-type" content="text/html; charset=utf-8" /> 
    <meta HTTP-EQUIV="Pragma" CONTENT="no-cache"> 
    <title>Programa Igualdad de Oportunidades - PIO USB</title> 
    <link href="usbsheet.css" rel="stylesheet" type="text/css" media="screen" /> 
  </head>
  <body>
    <div id="wrapper"> 
      <div id="header"> 
        <div id="logo"> 
        </div> 
        <div id="title"><h1>Programa Igualdad de Oportunidades - USB</h1></div> 
        <div id="username"> 
          <h3>Bienvenido 
            <%=uname%>
          </h3>
        </div>
      </div> 
      <!-- end #header --> 
      <div id="menu"> 
        <ul> 
          <li><a href="index.jsp">Inicio</a></li> 
          <li><a href="index.jsp">¿Quiénes Somos?</a></li> 
          <li><a href="index.jsp">Admisión</a></li> 
          <li class="current_page_item"><a href="registroUsr.jsp">Registro</a></li>
          <li><a href="HomeLogin.jsp">Login</a></li> 
          <li><a href="index.jsp">PIO</a></li> 
        </ul> 
        <div style="clear:both;"></div> 
      </div> 
      <!-- end #menu --> 
      <div id="page"> 
        <div id="sidebar"> 
          <div id="actions"> 
            <h3> 
              Acciones
            </h3> 
            <ul> 

              <%if (uname != null) {%>
              <li><a href="gesUsrHome.jsp">Gestionar Usuarios</a></li>
              <li><a href="gesAlHome.jsp">Gestionar Estudiantes</a></li> 
              <li><a href="gesPlantHome.jsp">Gestionar Planteles</a></li>
              <li>Generar Reporte</li> 
              <li>Enviar Correo</li> 
              <li>Cosas Administrativas</li> 
              <li>
                <html:link styleClass="usbsheet.css" action="/logout">
                  Cerrar Sesion
                </html:link>
              </li>
              <%} else {%>
              <li>accion1</li> 
              <li>accion2</li> 
              <li>accion3</li> 
              <li>accion4</li>
              <%}%>
            </ul> 
          </div> 
          <div id="news"> 
            <h3> 
              Noticias
            </h3> 
            <ul> 
              <li>Noticia1</li> 
              <li>Noticia2</li> 
              <li>Noticia3</li> 
              <li>Noticia4</li> 
            </ul> 
          </div> 
        </div> 
        <div id="content">
          <h1> Registro de Plantel Educativo </h1>
          <html:form action="/registerIn">
            <div class="tabber">            
              <div class="tabbertab tabbertabdefault">
                <table border="0" cellspacing="4">
                  <tbody>
                    <tr>
                      <td>Nombre de la institucion:</td>
                      <td><html:text property="NIns"/></td>
                    </tr>
                    <tr>
                      <td>Telefono:</td>
                      <td><html:text property="tlf"/></td>
                    </tr>
                    <tr>
                      <td>Fax:</td>
                      <td><html:text property="fax"/></td>
                    </tr>
                    <tr>
                      <td>Email:</td>
                      <td><html:text property="email"/></td>
                    </tr>
                    <tr>
                      <td>Direccion:</td>
                      <td><html:textarea property="dir"/></td>
                    </tr>
                    <tr>
                      <td>Tipo instituto:</td>
                      <td>
                        Publico
                        <html:radio property="instituto" value="Publico"/>
                        Subsidiado
                        <html:radio property="instituto" value="Subsidiado"/>                                            
                      </td>
                    </tr>
                    <tr>
                      <td>Distrito escolar:</td>
                      <td><html:text property="distEsc"/></td>
                    </tr>
                    <tr>
                      <td>Mencion del diversificado:</td>
                      <td><html:text property="mencionDiv"/></td>
                    </tr>
                    <tr>
                      <td>Nombre Director:</td>
                      <td><html:text property="nombreDir"/></td>
                    </tr>
                    <tr>
                      <td>Email:</td>
                      <td><html:text property="emailDir"/></td>
                    </tr>
                    <tr>
                      <td>Telefono (hab):</td>
                      <td><html:text property="tlfDir"/></td>
                    </tr>
                    <tr>
                      <td>Celular:</td>
                      <td><html:text property="celDir"/></td>
                    </tr>
                    <tr>
                      <td>Nombre Coordinador:</td>
                      <td><html:text property="nombreCoord"/></td>
                    </tr>
                    <tr>
                      <td>Email:</td>
                      <td><html:text property="emailCoord"/></td>
                    </tr>
                    <tr>
                      <td>Telefono (hab):</td>
                      <td><html:text property="tlfCoord"/></td>
                    </tr>
                    <tr>
                      <td>Celular:</td>
                      <td><html:text property="celCoord"/></td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <div class="tabbertab">
                <table border="0" cellspacing="4">
                  <tbody>
                    <tr>
                      <td colspan="2">
                        <table border="0">
                          <thead>
                            <tr>
                              <th>  Tipo de servicio  </th>
                              <th>  Cantidad  </th>
                              <th>  Condicion  </th>
                              <th>  Observacion  </th>
                            </tr>
                            <tr>
                              <td></td>
                              <td></td>
                              <td colspan="2">Bue Reg Def</td>
                            </tr>
                          </thead>
                          <tbody>
                            <tr>
                              <th>Sanitarios</th>
                              <td><html:text property="banhoCant" value=""/></td>
                              <td>
                                <html:radio property="condBan" value="Buena"/>
                                <html:radio property="condBan" value="Reg"/>
                                <html:radio property="condBan" value="Def"/>
                              </td>
                              <td><html:text property="banho"/></td>
                            </tr>
                            <tr>
                              <th>Cafetines</th>
                              <td><html:text property="cafetCant" value=""/></td>
                              <td>
                                <html:radio property="condCaf" value="Buena"/>
                                <html:radio property="condCaf" value="Reg"/>
                                <html:radio property="condCaf" value="Def"/>
                              </td>
                              <td><html:text property="cafetines"/></td>
                            </tr>
                            <tr>
                              <th>Comedores</th>
                              <td><html:text property="comeCant" value=""/></td>
                              <td>
                                <html:radio property="condCom" value="Buena"/>
                                <html:radio property="condCom" value="Reg"/>
                                <html:radio property="condCom" value="Def"/>
                              </td>
                              <td><html:text property="comedores"/></td>
                            </tr>
                            <tr>
                              <th>Bebederos</th>
                              <td><html:text property="bebeCant" value=""/></td>
                              <td>
                                <html:radio property="condBeb" value="Buena"/>
                                <html:radio property="condBeb" value="Reg"/>
                                <html:radio property="condBeb" value="Def"/>
                              </td>
                              <td><html:text property="bebederos"/></td>
                            </tr>
                            <tr>
                              <th>Aulas</th>
                              <td><html:text property="aulaCant" value=""/></td>
                              <td>
                                <html:radio property="condAulas" value="Buena"/>
                                <html:radio property="condAulas" value="Reg"/>
                                <html:radio property="condAulas" value="Def"/>
                              </td>
                              <td><html:text property="aulas"/></td>
                            </tr>                          
                            <tr>
                              <th>Laboratorios</th>
                              <td><html:text property="labCant" value=""/></td>
                              <td>
                                <html:radio property="condLabs" value="Buena"/>
                                <html:radio property="condLabs" value="Reg"/>
                                <html:radio property="condLabs" value="Def"/>
                              </td>
                              <td><html:text property="labs"/></td>
                            </tr>
                            <tr>
                              <th>Canchas deportivas</th>
                              <td><html:text property="canchCant" value=""/></td>
                              <td>
                                <html:radio property="condCan" value="Buena"/>
                                <html:radio property="condCan" value="Reg"/>
                                <html:radio property="condCan" value="Def"/>
                              </td>
                              <td><html:text property="canchas"/></td>
                            </tr>
                          </tbody>
                        </table>
                      </td>
                    </tr>
                    <tr>
                      <th>Observaciones de planta fisica</th>
                      <td><html:textarea property="obsPlantaFisica"/></td>
                    </tr>
                    <tr>
                      <th colspan="2">Observaciones generales de aspectos academicos</th>                      
                    </tr>
                    <tr>
                      <td colspan="2">Hay profesores en todas las materias?</td>                      
                    </tr>
                    <tr>
                      <td>
                        <html:radio property="asignaturasProf" value="si"/> si
                        <html:radio property="asignaturasProf" value="no"/> no
                      </td>
                      <td><html:textarea property="descAsignaturasProf" 
                                     onblur="setValue(this)"
                                     onfocus="setValue(this)"
                                     value="Si es negativa la respuesta: Cual asignatura? y por que?"/></td>
                    </tr>
                    <tr>
                      <td>Nivel:</td>
                      <td> 
                        7mo<html:multibox property="nivelAsignatura" value="1"/>  
                        8vo<html:multibox property="nivelAsignatura" value="2"/>
                        9no<html:multibox property="nivelAsignatura" value="3"/>
                        4to<html:multibox property="nivelAsignatura" value="4"/>
                        5to<html:multibox property="nivelAsignatura" value="5"/>
                        6to<html:multibox property="nivelAsignatura" value="6"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Matricula de la institucion:</td>
                      <td><html:text property="matInst"/></td>
                    </tr>
                    <tr>
                      <td>Nro de asistentes a la charla PIO:</td>
                      <td><html:text property="numAsistentes" value=""/></td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <div class="tabbertab">
                <table border="0" cellspacing="4">
                  <tbody>
                    <tr>
                      <th colspan="2">Situacion de embarazo en la adolescencia</th>                      
                    </tr>
                    <tr>
                      <td>Nro de alumnas embarazadas</td>
                      <td><html:text property="numEmbarazadas" value=""/></td>
                    </tr>
                    <tr>
                      <td>Edades</td>
                      <td>
                        12<html:multibox property="edadEmbarazada" value="1"/>  
                        13<html:multibox property="edadEmbarazada" value="2"/>
                        14<html:multibox property="edadEmbarazada" value="3"/>
                        15<html:multibox property="edadEmbarazada" value="4"/>
                        16<html:multibox property="edadEmbarazada" value="5"/>
                        17<html:multibox property="edadEmbarazada" value="6"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Nivel</td>
                      <td>
                        7mo<html:multibox property="nivelEmbarazada" value="1"/>  
                        8vo<html:multibox property="nivelEmbarazada" value="2"/>
                        9no<html:multibox property="nivelEmbarazada" value="3"/>
                        4to<html:multibox property="nivelEmbarazada" value="4"/>
                        5to<html:multibox property="nivelEmbarazada" value="5"/>
                        6to<html:multibox property="nivelEmbarazada" value="6"/>
                      </td>
                    </tr>
                    <tr>
                      <th colspan="2">Tipos de asistencia por parte de la institucion:</th>
                    </tr>
                    <tr>
                      <td>Orientacion individualizada:</td>
                      <td>
                        si<html:radio property="oriInd" value="si"/>
                        no<html:radio property="oriInd" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Orientacion familiar:</td>
                      <td>
                        si<html:radio property="oriFam" value="si"/>
                        no<html:radio property="oriFam" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Remitir a programas:</td>
                      <td>
                        si<html:radio property="remProg" value="si"/>
                        no<html:radio property="remProg" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td colspan="2">
                        <html:textarea property="remProgCuales" value="Cuales" onblur="setValue(this)"
                                       onfocus="setValue(this)"/>
                      </td>
                    </tr>
                    <tr>
                      <th colspan="2">Aplicacion de programas de orientacion
                        personal-social
                      </th>
                    </tr>
                    <tr>
                      <td>
                        si<html:radio property="oriPerSoc" value="si"/>
                        no<html:radio property="oriPerSoc" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td>A todos los niveles:</td>
                      <td>
                        si<html:radio property="nivelOriPerSoc" value="si"/>
                        no<html:radio property="nivelOriPerSoc" value="no"/>
                      </td>
                    </tr>                    
                    <tr>
                      <td colspan="2">
                        <html:textarea property="nivelOriPerSocCuales" value="Cuales" 
                                       onblur="setValue(this)" onfocus="setValue(this)"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Por parte de la coordinacion de orientacion:</td>
                      <td>
                        si<html:radio property="oriCoord" value="si"/>
                        no<html:radio property="oriCoord" value="no"/>
                      </td>
                    </tr>                    
                    <tr>
                      <td colspan="2">
                        <html:textarea property="oriCoordCuales" value="Cuales" 
                                       onblur="setValue(this)" onfocus="setValue(this)"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Por parte de instituciones sin fines de lucro:</td>
                      <td>
                        si<html:radio property="oriSinLucro" value="si"/>
                        no<html:radio property="oriSinLucro" value="no"/>
                      </td>
                    </tr>                    
                    <tr>
                      <td colspan="2">
                        <html:textarea property="oriSinLucroCuales" value="Cuales" 
                                       onblur="setValue(this)" onfocus="setValue(this)"/>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <div class="tabbertab">
                <table border="0" cellspacing="4">
                  <tbody>
                    <tr>
                      <th colspan="2">Violencia fisica</th>
                    </tr>
                    <tr>
                      <td>Enfretamiento con daños fisicos evidentes:</td>
                      <td>
                        si<html:radio property="edfe" value="si"/>
                        no<html:radio property="edfe" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td colspan="2">
                        <html:textarea property="tipoDanho" value="Tipo de daño" 
                                       onblur="setValue(this)" onfocus="setValue(this)"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Uso armas blancas:</td>
                      <td>
                        si<html:radio property="usoArmasBlanca" value="si"/>
                        no<html:radio property="usoArmasBlanca" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Uso armas fuego:</td>
                      <td>
                        si<html:radio property="usoArmasFuego" value="si"/>
                        no<html:radio property="usoArmasFuego" value="no"/>
                      </td>
                    </tr> 
                    <tr>
                      <td>Uso de objetos contundentes:</td>
                      <td>
                        si<html:radio property="usoObjCont" value="si"/>
                        no<html:radio property="usoObjCont" value="no"/>
                      </td>
                    </tr> 
                    <tr>
                      <td colspan="2">
                        <html:textarea property="consecABAF" value="Consecuencias" 
                                       onblur="setValue(this)" onfocus="setValue(this)"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Nivel que se presenta con frecuencia</td>
                      <td>
                        7mo<html:multibox property="nivelArma" value="1"/>  
                        8vo<html:multibox property="nivelArma" value="2"/>
                        9no<html:multibox property="nivelArma" value="3"/>
                        4to<html:multibox property="nivelArma" value="4"/>
                        5to<html:multibox property="nivelArma" value="5"/>
                        6to<html:multibox property="nivelArma" value="6"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Registro de los agredidos y agresores:</td>
                      <td>
                        si<html:radio property="regArg" value="si"/>
                        no<html:radio property="regArg" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td><html:textarea property="accTom" value="Acciones Tomadas"
                                     onblur="setValue(this)" onfocus="setValue(this)"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Causas probables:</td>
                      <td>
                        Influencia social<html:multibox property="causasProb" value="1"/> </br> 
                        Entorno<html:multibox property="causasProb" value="2"/> </br>
                        Discusiones personales<html:multibox property="causasProb" value="3"/> </br>
                        Enfrentamiento de bandas<html:multibox property="causasProb" value="4"/> </br>
                        Drogas<html:multibox property="causasProb" value="5"/> </br>
                        Supervivencia al medio<html:multibox property="causasProb" value="6"/> </br>
                      </td>
                    </tr>
                    <tr>
                      <td colspan="2">Sexo que manifiesta con frecuencia los casos de violencia</td>
                    </tr>
                    <tr>
                      <td>
                        Masculino<html:radio property="sexoViolento" value="masculino"/>
                        Femenino<html:radio property="sexoViolento" value="femenino"/>
                      </td>
                    </tr>
                    <tr>
                      <td>Asistencia por programas de seguridad:</td>
                      <td>
                        si<html:radio property="aps" value="si"/>
                        no<html:radio property="aps" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td colspan="2"><html:textarea property="apsCuales" value="Cuales"
                                     onblur="setValue(this)" onfocus="setValue(this)"/></td>
                    </tr>
                    <tr>
                      <td colspan="2">Violencia verbal</td>
                    </tr>
                    <tr>
                      <td>Presencia de estas por parte de los alumnos</td>
                      <td>
                        si<html:radio property="presAlumno" value="si"/>
                        no<html:radio property="presAlumno" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td>En que forma:</td>
                      <td>
                        Insultos<html:multibox property="verbalForma" value="1"/> </br> 
                        Malas palabras<html:multibox property="verbalForma" value="2"/></br>
                        Gritos de alteracion de conducta<html:multibox property="verbalForma" value="3"/></br>
                        Descalificaciones<html:multibox property="verbalForma" value="4"/></br>
                      </td>
                    </tr>
                    <tr>
                      <td colspan="2"><html:textarea property="medidasVerbal" 
                                     value="Medidas tomadas" onfocus="setValue(this)"
                                     onblur="setValue(this)"/></td>
                    </tr>
                    <tr>
                      <td>Hacia los profesores:</td>
                      <td>
                        si<html:radio property="verbalHaciaProf" value="si"/>
                        no<html:radio property="verbalHaciaProf" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td colspan="2"><html:textarea property="medidasVerbalProf" 
                                     value="Medidas tomadas" onblur="setValue(this)"
                                     onfocus="setValue(this)"/></td>
                    </tr>
                    <tr>
                      <td>Hacia otros miembros de la comunidad escolar:</td>
                      <td>
                        si<html:radio property="verbalHaciaComEsc" value="si"/>
                        no<html:radio property="verbalHaciaComEsc" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        Personal Administrativo<html:multibox property="verbalComEsc" value="1"/>
                        Obrero<html:multibox property="verbalComEsc" value="2"/>
                      </td>
                    </tr>
                    <tr>
                      <td colspan="2"><html:textarea property="medidasVerbalComEsc" 
                                     value="Medidas tomadas" onblur="setValue(this)"
                                     onfocus="setValue(this)"/></td>
                    </tr>
                    <tr>
                      <th colspan="2">Daño a las instalaciones del plantel</th>
                    </tr>                    
                    <tr>
                      <td>Ocurrencia:</td>
                      <td>
                        si<html:radio property="danhoInstalacion" value="si"/>
                        no<html:radio property="danhoInstalacion" value="no"/>
                      </td>
                    </tr>
                    <tr>
                      <td colspan="2">
                        Destruccion pupitres<html:multibox property="danhoInstalacionCasos" value="1"/> </br> 
                        Rayar paredes<html:multibox property="danhoInstalacionCasos" value="2"/></br>
                        Destruccion de material instruccional<html:multibox property="danhoInstalacionCasos" value="3"/></br>
                        Destruccion de baños<html:multibox property="danhoInstalacionCasos" value="4"/></br>
                        Bebederos<html:multibox property="danhoInstalacionCasos" value="5"/></br>
                      </td>
                    </tr>
                  </tbody>
                </table>
                <html:submit value="Registrar"/>
              </div>            
            </div>
          </html:form>
          <script type="text/javascript" src="tabber.js">
          </script>
        </div> 
        <!-- end #page --> 
        <div style="clear:both;"></div> 
      </div> 
      <div id="footer"> 
        <p>© 2011 Todos los derechos reservados. Sistema diseñado y desarrollado por <a href="http://www.css.com">Cachicamo Systems Solutions C.A.</a></p> 
      </div> 
      <!-- end #footer --> 
  </body>
</html>
