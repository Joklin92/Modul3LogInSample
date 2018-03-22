package Test;

import DBAccess.OrderMapper;
import FunctionLayer.Employee;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author malik
 */
public class Main 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
//        Calculation c = new Calculation();
//        //int res = c.brickTotalBottom(20);
//        System.out.println("Bottom " + c.brickTotalBottom(20));
//        System.out.println("Above bottom " + c.brickTotalOverBottom(20));
//        
//        BrickMapper brick = new BrickMapper();
//        System.out.println("\n\nAll " + brick.getAllBottoms());
//        
//        System.out.println("... " + brick.totalLength("big"));
        
        OrderMapper om = new OrderMapper();
        
        ArrayList<Integer> orderID = new ArrayList<>();
        Employee emp = new Employee();
        
        emp.idList();
        
        System.out.println(emp.getOrderID().toString().replace("[","").replace("]","").replace(",",""));
        orderID = om.getAllOrders();
        
        for (int i = 0; i < orderID.size(); i++) {
            System.out.println(orderID.get(i));
        }
        
        
        
    }
}
