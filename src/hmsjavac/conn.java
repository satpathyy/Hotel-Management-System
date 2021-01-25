
package hmsjavac;

import java.sql.*;


public class conn {
    Connection e;
    Statement s;
    
    public conn(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            e = DriverManager.getConnection("jdbc:mysql:///projecthms","root","pupu1011231");
            s = e.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
