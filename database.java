package cafe;

import java.sql.*;


public class database {
    Connection c;
    Statement s;
  database(){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/cafe","root","khalashi420");
            s=c.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
  }
    public static void main(String[] args) {
        
    }
   
    
    
}
