import java.sql.Connection;
import java.sql.DriverManager;



class MyConnection {

     public static  Connection getConnection(){
       Connection c=null;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           c=DriverManager.getConnection("jdbc:mysql://localhost/billing","root","1311441@gow");
       }catch(Exception ex)
        {
            System.out.println(ex);
        }
     
        return c;
        }
}



  
