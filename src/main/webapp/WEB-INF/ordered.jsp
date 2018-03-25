

<%@page import="DBAccess.OrderMapper"%>
<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ordered</title>
    </head>
    <body>
                <%
                    User user = (User)session.getAttribute("user");
            OrderMapper om = new OrderMapper();
            %>
        
        <h1>Thanks for ordering</h1>
        <form name="ordered" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="orderhistory">
                        <input type="submit" value="Orderhistory">
                    </form>
              
    </body>
        
    
</html>
