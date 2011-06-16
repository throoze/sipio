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
      </div> 
      <!-- end #header --> 
      <div id="menu"> 
        <ul>
          <li><a href="index.jsp">Inicio</a></li> 
          <li><a href="index.jsp">¿Quiénes Somos?</a></li> 
          <li><a href="index.jsp">Admisión</a></li> 
          <li><a href="registroUsr.jsp">Registro</a></li> 
          <li class="current_page_item"><a href="HomeLogin.jsp">Login</a></li> 
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
          <%if (uname != null) {%>
          <h1>Ya existe una sesion iniciada</h1>
          <h1>
            <html:link styleClass="usbsheet.css" action="/logout">
              Cerrar Sesion (<%=uname%>)
            </html:link>
          </h1>
          <%} else {%>
          <h1> Autentificacion </h1>
          <html:form action="/login">
            <table>
              <tbody>
                <tr>
                  <td colspan="2">
                    <bean:write name="LoginForm" property="error" filter="false"/>
                    &nbsp;</td>
                </tr>
                <tr>
                  <th> Username </th>
                  <td> <html:text property="uname"/> </td>
                </tr>
                <tr>
                  <th> Password </th>
                  <td> <html:password property="pass"/> </td>
                </tr>
                <tr>
                  <td></td>
                  <td> <html:submit value="Login"/> </td>
                </tr>
              </tbody>
            </table>
          </html:form>
          <%}%>
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
