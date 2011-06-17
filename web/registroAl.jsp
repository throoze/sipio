
<%@page import="pio.hibernate.Plantel"%>
<%@page import="java.util.List"%>
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
                                    Cerrar Session
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
                        Registro Estudiante
                    </h1> 
                    <html:form action="/registerAl">
                        <table>
                            <tr>
                                <td>Nombres:</td>
                                <td><html:text property="nombre"/></td>
                            </tr>
                            <tr>
                                <td>Apellidos:</td>
                                <td><html:text property="apellido"/></td>
                            </tr>
                            <tr>
                                <td>Cedula:</td>
                                <td><html:text property="cedula"/></td>
                            </tr>
                            <tr>
                                <td>Email:</td>
                                <td><html:text property="correo"/></td>
                            </tr>
                            <tr>
                                <td>Sexo:</td>
                                <td>
                                    Masculino<html:radio property="sexo" value="masculino"/><br/>
                                    Femenino<html:radio property="sexo" value="femenino"/>
                                </td>
                            </tr>
                            <tr>
                                <td>Plantel:</td>
                                <td>
                                    <html:select name="RegisterAlForm" property="nombrePlantel" >
                                        <html:option value="0">Plantel</html:option>
                                        <html:optionsCollection name="RegisterAlForm" property="listaPlanteles" label="nombrePlantel" value="nombrePlantel" />
                                    </html:select>
                                </td>
                            <tr/> 
                            <tr>
                                <td>Promedio:</td>
                                <td><html:text property="promedio" value=""/></td>
                            </tr>
                            <tr>
                                <td>Carrera 1:</td>
                                <td><html:text property="carrera1"/></td>
                            </tr>
                            <tr>
                                <td>Carrera 2:</td>
                                <td><html:text property="carrera2"/></td>
                            </tr>
                            <tr>
                                <td>Carrera 3:</td>
                                <td><html:text property="carrera3"/></td>
                            </tr>
                            <tr>
                                <td><html:submit value="Registrar"/></td>
                            </tr>
                        </table>
                    </html:form>
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