package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.PreOrder;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author malik
 */
public class OrderMapper 
{
    public void createPreOrder(PreOrder ord) //To test in main
    {
        int orderId = 0;
        try 
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO preOrders (userID, length, width, height) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS ); 
            ps.setInt(1, ord.getUserId()); //user id
            ps.setInt(2, ord.getLength());
            ps.setInt(3, ord.getWidth());
            ps.setInt(4, ord.getHeight());

            System.out.println("Check sql order " + SQL);

            int check = ps.executeUpdate();
            if(check == 1)
            {
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                orderId = ids.getInt( 1 );

                System.out.println("Debug " + orderId);

            }
        } catch ( SQLException | ClassNotFoundException ex ) { //temporary error
            throw new Error( ex.getMessage() );
        }
    }
    
    public static void createOrder(PreOrder ord) //to use in logcfacade
    {
        int orderId = 0;
        try 
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO preOrders (userID, length, width, height) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS ); 
            ps.setInt(1, ord.getUserId()); //user id
            ps.setInt(2, ord.getLength());
            ps.setInt(3, ord.getWidth());
            ps.setInt(4, ord.getHeight());

            System.out.println("Check sql order " + SQL);

            int check = ps.executeUpdate();
            if(check == 1)
            {
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                orderId = ids.getInt( 1 );

                System.out.println("Debug " + orderId);

            }
        } catch ( SQLException | ClassNotFoundException ex ) { //temporary error
            throw new Error( ex.getMessage() );
        }
    }
     
     public ArrayList<Integer> getAllOrders() throws ClassNotFoundException, SQLException {
         ArrayList<Integer> ids = new ArrayList<>();
         
         try {
             Connection con = Connector.connection();
             String sql = "Select id from preorders"; //useradmin.preorders
             
             PreparedStatement ps = con.prepareStatement( sql, Statement.RETURN_GENERATED_KEYS );
             
             ResultSet resultset = ps.executeQuery(sql);

            while (resultset.next()) {
                int userId = resultset.getInt("id");
                ids.add(userId);
            }
             
         } catch (SQLException e) {
             e.printStackTrace();
         }        
         return ids;
     } 
     
     public void sendOrder(int id) {
         
        try 
        {
            Connection con = Connector.connection();
            String SQL = "update preorders set orderConfirmed= '1' where id= '"+id+"'";
            
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS ); 
           // ps.setInt(1, user.getId()); //user id
            
            System.out.println("Check sql order " + SQL);
            
            ps.executeUpdate();
            } catch( SQLException | ClassNotFoundException ex) {
        throw new Error( ex.getMessage() );
}


         
     }
     
     //make an orderline method....
}
