/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGame;

/**
 *
 * @author CLAB_37
 */
import java.sql.*;



public class connteStr {
    public static void main(String Args[]){
        String dbUrl="jdbc:mysql://localhost:3306/test";
        String username="root";
        String password="";
        String Query="select count(*) from testerdatatable";
        
        Connection dbCon=null;
        Statement stmt=null;
        ResultSet rs=null;
        
        try{
            
            //getting database connection to MySQL server 
            dbCon = DriverManager.getConnection(dbUrl, username, password); 
            
            //getting PreparedStatment to execute query
            stmt = dbCon.prepareStatement(Query); 

            //Resultset returned by query 
            rs = stmt.executeQuery(Query);
            
            while(rs.next())
            { 
                int count = rs.getInt(1);
                System.out.println("count of stock : " + count); }



        }catch (SQLException ex) {
            System.err.println(ex);
        }
    }
            
}
