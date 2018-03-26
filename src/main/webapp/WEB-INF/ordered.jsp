

<%@page import="FunctionLayer.PreOrder"%>
<%@page import="sun.security.util.Length"%>
<%@page import="FunctionLayer.Calculation"%>
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
            User user = (User) session.getAttribute("user");
            PreOrder pre = (PreOrder) session.getAttribute("pre");
            OrderMapper om = new OrderMapper();
            Calculation calc = new Calculation();
        %>
        <h1>Thanks for ordering</h1>
        <table border="1">
            <tr>
                <th><p>Brick type</th>
                <th><p>house length</th>
                <th><p>house width</th>
                <th><p>sides total</th>
                <th><p>Total bricks each type</th>
                    <% calc.getUnevenLength();
                        calc.getEvenLength();
                        calc.getUnevenWidth();
                        calc.getEvenWidth();
                    %>
            </tr>
            <tr>
                <th><p>1x2</th>
                <td><p><%out.print(session.getAttribute("evenLegoPieces one ")); %></td>
                <td><p><%out.print(session.getAttribute("unevenLegoPieces two ")); %></td>
                <td><p><%out.print("lerp"); %></td>
                <td><p><%out.print("werp");%></td>
            </tr>
            <tr>
                <th><p>2x2</th>
                <td><p><%out.print(session.getAttribute("unevenLegoPieces three ")); %></td>
                <td><p><%out.print(session.getAttribute("unevenLegoPieces four ")); %></td>
                <td><p><%out.print("lurp"); %></td>
                <td><p><%out.print("wurp");%></td>
            </tr>
            <tr>
                <th><p>4x2</th>
                <td><p><%out.print("darp"); %></td>
                <td><p><%out.print("sarp"); %></td>
                <td><p><%out.print("larp"); %></td>
                <td><p><%out.print("warp");%></td>
            </tr>
        </table>
        <form name="ordered" action="FrontController" method="POST">
            <input type="hidden" name="command" value="orderhistory">
            <input type="submit" value="Orderhistory">
        </form>

        Order<br><br>


    </body>


</html>
