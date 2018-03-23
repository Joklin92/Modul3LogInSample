/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.LoginSampleException;
import FunctionLayer.PreOrder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dorte
 */
public class Ordered extends Command {
    
    OrderMapper om = new OrderMapper();
    int userID, length, width, height;
    
    
        @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
       
        
        //if(!Double.isNaN(Double.parseDouble(request.getParameter("id"))))
        
        try {
         userID = Integer.parseInt(request.getParameter("id"));
         length = Integer.parseInt(request.getParameter("length"));
         width = Integer.parseInt(request.getParameter("width"));
         height = Integer.parseInt(request.getParameter("height"));
            
        PreOrder pre = new PreOrder(userID,length,width,height);
        
        om.createPreOrder(pre);
        
        }catch(NumberFormatException e) {
            return "ordered";
            
        }
            return "ordered";
    }
    
    
}
