/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simko_test1;


import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nikof
 */
public class Koneksi {
    private Connection connect;
    
    private String driverName = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/simko";
    private String username = "root";
    private String password = "";
    
    public Connection getKoneksi() {
        if(connect == null){
            try{
                Class.forName(driverName);
                System.out.println("Class driver ditemukan");
                
                connect = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException ex) {
                java.util.logging.Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        return connect;
    }
    public static void main(String[] args) {
       Koneksi koneksi = new Koneksi();
       koneksi.getKoneksi();
    }
}
