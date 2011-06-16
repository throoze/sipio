<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"> 
  <head>
    <%
      String uname = (String) session.getAttribute("uname");
    %>
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
          <h1> 
            Principal de Gestion de Estudiantes
          </h1>
          <a href="registroAl.jsp">Registrar Estudiante</a><br/>
          <a href="#">Registrar Estudiantes (Archivo Excel)</a><br/>
          <a href="#">Consultar Estudiante</a>
        </div> 
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