
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class productclass {
   String forname=  "com.mysql.jdbc.Driver";
   String driver = "jdbc:mysql://localhost/bsit21";
   String us = "root";
   String ps1 ="";
   
   
   public void addProd(String product,int quantity,String price){
          try {
              Class.forName(forname);
              Connection con = DriverManager.getConnection(driver,us,ps1);
              PreparedStatement ps = con.prepareStatement("insert into producttbl values(null,?,?,?)");
              ps.setString(1, product);
              ps.setInt(2, quantity);
              ps.setString(3, price);
              ps.executeUpdate();
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(productclass.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(productclass.class.getName()).log(Level.SEVERE, null, ex);
          }
   }
   
   public void remove(int id){
         try {
              Class.forName(forname);
              Connection con = DriverManager.getConnection(driver,us,ps1);
              PreparedStatement ps = con.prepareStatement("delete from producttbl where id =?");
              ps.setInt(1, id);
              
              ps.executeUpdate();
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(productclass.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(productclass.class.getName()).log(Level.SEVERE, null, ex);
          }
   }
   
   public void editProduct(int id, String product, int quantity, String price){
          try {
              Class.forName(forname);
              Connection con = DriverManager.getConnection(driver,"root","");
              PreparedStatement ps = con.prepareStatement("update producttbl set product = ?,quantity = ?, price = ? where id =?");
              ps.setString(1,product);
              ps.setInt(2,quantity);
              ps.setString(3,price);
              ps.setInt(4,id);
              ps.executeUpdate();
              
          } catch (SQLException ex) {
              Logger.getLogger(productclass.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(productclass.class.getName()).log(Level.SEVERE, null, ex);
          }
   }


   public void editqy(int id,int qty){
           try {
           Class.forName(forname);
           Connection con = DriverManager.getConnection(driver,us,ps1);
           PreparedStatement ps = con.prepareStatement("update producttbl set QUANTITY= (QUANTITY+?) where ID = ?");
           ps.setInt(1, qty);
           ps.setInt(2, id);
           
           ps.executeUpdate();
           
          
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(productclass.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(productclass.class.getName()).log(Level.SEVERE, null, ex);
          } 
           
   }
}
         
           


   
           

   
   

