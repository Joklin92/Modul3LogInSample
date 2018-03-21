/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LoginSampleException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dorte
 */
public class Return extends Command {
        @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
       
            try {
                response.sendRedirect("customerpage.jsp");
            } catch (IOException ex) {
                Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
            }

    return "return";
}
}
