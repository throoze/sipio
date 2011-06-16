<%-- 
    Document   : menu
    Created on : 03/06/2011, 03:33:53 AM
    Author     : victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div id="menu"> 
    <ul> 
        <%
            String current = request.getParameter("current");
        %>
        <li <% if (current.equals("home")) {%> class="current_page_item" <%} %> ><a href="index.jsp">Inicio</a></li>
        <li <% if (current.equals("who")) {%> class="current_page_item" <%} %> ><a href="index.jsp">¿Quiénes Somos?</a></li>
        <li <% if (current.equals("adm")) {%> class="current_page_item" <%} %> ><a href="index.jsp">Admisión</a></li>
        <li <% if (current.equals("news")) {%> class="current_page_item" <%} %> ><a href="index.jsp">Noticias</a></li>
    </ul> 
    <div style="clear:both;"></div> 
</div>