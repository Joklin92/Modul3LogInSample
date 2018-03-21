

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ordered</title>
    </head>
    <body>
        
        <h1>Thanks for ordering</h1>
        <form name="ordered" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="orderhistory">
                        <input type="submit" value="Orderhistory">
                    </form>
        
    </body>
    
    <a href="FrontController?command=customerpage">Return</a>
        
    
</html>
