/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuento_horas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author javie
 */
public class Conectar_db {
    
    
       /*public static Connection conectDB(){
        
    
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:datos.db");
            
            System.out.println("Connection established");
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
                    return null;
        }
        }*/
       
       public static Connection conectDB(){
        
    
        try {
            //Connection con = DriverManager.getConnection("jdbc:postgresql://combat-hermit-6452.8nj.cockroachlabs.cloud:26257/defaultdb?sslmode=verify-full&password=ZXODcaL7fyS9myPnHxoJXQ&user=javiergracia2003");
            Connection con = DriverManager.getConnection("jdbc:sqlite://Q:/horas/data.db");
            //Connection con = DriverManager.getConnection("jdbc:sqlite://Volumes/shared/pruebas_sql/data.db");
            
           /*PGSimpleDataSource ds = new PGSimpleDataSource();
                ds.setUrl("jdbc:postgresql://uuhcyvf9hrzxpgxhbngu:q2W2xDk8sAMphn4GvfCOArjLhLreYk@bjqmtad9izhpbe9txd9j-postgresql.services.clever-cloud.com:5432/bjqmtad9izhpbe9txd9j");
                ds.setUser("uuhcyvf9hrzxpgxhbngu");
                ds.setPassword("q2W2xDk8sAMphn4GvfCOArjLhLreYk");
            System.out.println("Connection established");
            Connection con = ds.getConnection();*/
            //String url = "jdbc:mysql://qahl063.qnavarra.com/qahl063";
            
            
            
            //String url = "jdbc:mysql://qahl063.qnavarra.com/qahl063";
            //String url = "jdbc:mysql://llxk309.servidoresdns.net/qahl063";
            //String username = "qahl063";
            //String password = "Hner527n7MY";
            
            //tSring connectionString = "jdbc:mysql://qahl063.qnavarra.com/qahl063?user=qahl063&password=Hner527n7MY&useUnicode=true&characterEncoding=UTF-8";


            
            //Connection con = DriverManager.getConnection(url, username, password);
            //Connection con = DriverManager.getConnection(connectionString);
            System.out.println("Connection established");
            return con;
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
                    return null;
        }
        }
       
       
       
       
       
       
       
       
}
