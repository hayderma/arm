import com.mysql.jdbc.Connection;
import java.awt.EventQueue;
import java.awt.Frame;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Connecting {
    
    
    public final static String username="root";
    public final static String pass ="tech1";
    public final static String conn_str="jdbc:mysql://localhost:3306/JAVA";
    public static Connection conn = get_conn();
    
    public static Connection get_conn (){
         Connection conn=null;
         
        try{
            conn =(Connection) DriverManager.getConnection(conn_str,username,pass);
       conn =(Connection) DriverManager.getConnection(conn_str,username,pass);
    }catch (SQLException e){
            System.out.println(e);
        }
       //JOptionPane.showMessageDialog(null,"Connected to Server");
       
       return conn;
    }
    
    public static double get_cost (Connection c ,int id) throws SQLException{
        
          Statement s = c.createStatement();
      
        String use = "USE JAVA;";
        s.executeUpdate(use);
        String qury = "SELECT cost FROM food WHERE ID = '"+id+"'";
        ResultSet rs = s.executeQuery(qury);
        double pr = 0;
        if(rs.next()) { 
            pr = rs.getDouble("cost");
        }
        return pr;
    }
    
     public static String get_name (int id) throws SQLException{
        Connection c =get_conn();
          Statement s = c.createStatement();
      
        String use = "USE JAVA;";
        s.executeUpdate(use);
        String qury = "SELECT name FROM food WHERE ID = '"+id+"'";
        ResultSet rs = s.executeQuery(qury);
        String nm = null;
        if(rs.next()) { 
            nm = rs.getString("name");
        }
        return nm;
    }
    
}
    
    
    
    
