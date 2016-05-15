
import java.sql.SQLException;
import java.util.ArrayList;





public class Calculate {
    
    
    public static ArrayList<Integer> keys; 
    
    public static void add_to_keys (int id){
        keys.add(id);
    }
    
    public static double cal (int id , int q) throws SQLException{
        
        double p = Connecting.get_cost(Connecting.conn, id);
        p = p * q;
        
        return p;
        
        
    }
    
    
}
