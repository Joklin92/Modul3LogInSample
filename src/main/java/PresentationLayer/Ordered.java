/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.Calculation;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.PreOrder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Ordered extends Command {

    OrderMapper om = new OrderMapper();
    int userID = 0;
    int length = 0;
    int width = 0;
    int height = 0;

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, ClassNotFoundException {

        HttpSession session = request.getSession();
        userID = (int) session.getAttribute("id");
        length = Integer.parseInt(request.getParameter("length"));
        width = Integer.parseInt(request.getParameter("width"));
        height = Integer.parseInt(request.getParameter("height"));
        PreOrder pre = new PreOrder(userID, length, width, height);
        session.setAttribute("pre", pre);        

        Calculation c = LogicFacade.Calculate(pre); //not sure if works

        session.setAttribute("evenLegoPieces one ", c.getEvenLength()); //save this in session
        session.setAttribute("unevenLegoPieces two ", c.getUnevenLength()); //save this in session
        session.setAttribute("evenLegoPieces three ", c.getEvenWidth()); //save this in session
        session.setAttribute("evenLegoPieces four ", c.getUnevenWidth()); //save this in session

        om.createPreOrder(pre);
        return "ordered";
    }

}
