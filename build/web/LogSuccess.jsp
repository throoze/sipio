<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"> 
  <head> 
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
        <div id="username"> <h3>Bienvenido pioadmin</h3> 
            <html:form action="/logout">
                 <p><html:submit value="Logout"/></p>
            </html:form>
        </div>
      </div> 
      <!-- end #header --> 
      <div id="menu"> 
        <ul> 
	      <li class="current_page_item"><a href="index.jsp">Inicio</a></li> 
	      <li><a href="index.jsp">¿Quiénes Somos?</a></li> 
	      <li><a href="index.jsp">Admisión</a></li> 
	      <li><a href="index.jsp">Registro</a></li> 
	      <!-- <li><a href="index.jsp">Login</a></li> -->
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
              <li>Ver Registro de Incritos</li> 
              <li>Generar Reporte</li> 
              <li>Enviar Correo</li> 
              <li>Cosas Administrativas</li> 
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
            Pagina de Bienvenida!
          </h1> 
          <h3> 
            (En Construcción)
          </h3> 
          <p> 
            Sean bienvenidos al Sistema Pio <br/>In posuere eleifend odio. Quisque semper augue mattis wisi. Maecenas ligula. Pellentesque viverra vulputate enim. Aliquam erat volutpat. Pellentesque tristique ante ut risus. Quisque dictum. Integer nisl risus, sagittis convallis, rutrum id, elementum congue, nibh. Suspendisse dictum porta lectus. Donec placerat odio vel elit. Nullam ante orci, pellentesque eget, tempus quis, ultrices in, est. Curabitur sit amet nulla. Nam in massa. Sed vel tellus. Curabitur sem urna, consequat vel, suscipit in, mattis placerat, nulla. Sed ac leo. Pellentesque imperdiet.
          </p> 
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

<%-- 
    Document   : LogSuccess
    Created on : May 18, 2011, 7:07:25 PM
    Author     : erick

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="estilodiv" type="text/css" href="estilo.css">
        <title>Login Success</title>
    </head>
    <body>
        <h1>Sirvió¡¡¡¡</h1>

        <html:form action="/logout">
        
        
        
        <p><html:submit value="Logout"/></p>
        
        </html:form>
   
    </body>
</html>
--%>