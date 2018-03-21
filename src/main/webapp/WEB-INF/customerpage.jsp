<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h3>Hello <%=request.getParameter("email")%> </h3>

        This is where you will input order

        <form action="FrontController" method="POST">
            <input type="hidden" name="command" value="ordered">
            <div class="height">
                <label> Height</label><input type="number" name="height" max="99" required value="4"/>
            </div>            
            <div class="length">
                <label> Length</label><input type="number" name="length" max="999" required value="6"/>
            </div>            
            <div class="width">
                <label> Width</label><input type="number" name="Width" max="999" required value="1"/>
            </div>            
            <div class="amount">
                <label> Amount</label><input type="number" name="amount" max="999" required value="1"/>
            </div>            
            <form name="customerpage" action="FrontController" method="POST">
                <input type="hidden" name="command" value="ordered">
                <input type="submit" value="Order">
            </form>

    </body>
</html>
