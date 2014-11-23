/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
/**
 *
 * @author Marcos
 */
public class DB {
    private static DB instance;
    Connection conn;
    Statement comand;
    ResultSet result;
    
    static{
        DB.instance = new DB();
    }
    
    /** Creates a new instance of MyDBConnection */
    private DB() {
        this.init();
    }

    public void init(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(
                    "jdbc:mysql://localhost/Biblioteca","root", "guilherme96238976152553"
                    );
            comand = conn.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }
    
    public static DB getInstance(){
        return DB.instance;
    }
    
    public Connection getMyConnection(){
        return conn;
    }
    
    
    public void close(ResultSet rs){
        
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        
        }
    }
    
     public void close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        
        }
    }
     
    public void destroy(){
  
        if(conn !=null){
    
            try{
               conn.close();
            }
            catch(Exception e){}
        
        
        }
    }
    
    public ResultSet consult(String query){
        try{
            return comand.executeQuery(query);
        }
        catch(SQLException e){
            System.out.println("Erro ao executar a query");
            return null;
        }
    }
}
