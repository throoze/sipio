<%-- 
    Document   : index
    Created on : 03/06/2011, 12:29:36 AM
    Author     : victor
--%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html:html>
    <%@ include file="../static/header.jsp" %>
    <body>
        <div id="wrapper">
            <%@include file="../static/title.jsp" %>
            <jsp:include page="../static/menu.jsp" >
                <jsp:param name="current" value="none" />
            </jsp:include>
        <div id="page"> 
            <div id="sidebar"> 
                <div id="actions"> 
                    <h3> 
                        Acciones
                    </h3> 
                    <ul> 
                        <li>accion1</li> 
                        <li>accion2</li> 
                        <li>accion3</li> 
                        <li>accion4</li> 
                    </ul> 
                </div> 
                <%@include file="../static/news.jsp" %>
            </div>
            <div id="content"> 
                <h1> 
                    Carga de Estudiantes
                </h1> 
                <h3> 
                    (En Construcción)
                </h3> 
                <p> 
                    Cargue los archivos con los datos recopilados por los ESC en los planteles para crear los usuarios correspondientes a los alumnos de los planteles. Note que debe haber cargado la informacin correspondiente a la charla en la cual los datos fueron captados.
                </p>                

                <html:form enctype="multipart/form-data" action="/upload">
                    <h3>Cargar archivo</h3>
                    Por favor, seleccione el archivo que desea cargar:
                    <br/><br/>
                    <html:file property="uploadedFile"/>
                    <br/><br/>
                    <html:submit value="Cargar Archivo"/>
                </html:form>
            </div>
        </div>
</body>
<%@ include file="../static/footer.jsp" %>
</html:html>
