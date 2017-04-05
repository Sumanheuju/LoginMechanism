<%-- 
    Document   : add
    Created on : Apr 5, 2017, 7:39:28 PM
    Author     : sumanheuju
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Users !!</h1>
        
        <form method="post" action="${SITE_URL}/save">
            <div>
                <label>Username</label>
                <input type="text" name="userName" value=""/>
            </div>
            <div>
                <label>Email</label>
                <input type="email" name="email" value=""/>
            </div>
            <div>
                <label>Password</label>
                <input type="password" name="password" value=""/>
            </div>
            <div>
                <label>Status</label>
                <input type="checkbox" name="status" value=""/>
            </div>
            <div>
                
                <input type="hidden" name="id" value=""/>
            </div>
            <div>
                
                <button type="submit">Save</button>
            </div>
        </form>
    </body>
</html>
