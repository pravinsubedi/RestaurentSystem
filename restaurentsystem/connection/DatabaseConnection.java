/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurentsystem.connection;

/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import javax.swing.JOptionPane;

/**
 *
 * @author pravin
 */
public class DatabaseConnection {
   /*    */ 
/* 16 */   Connection conn = null;
/*    */   
/*    */   public static Connection connectDb() {
/*    */     try {
/* 20 */       Class.forName("org.sqlite.JDBC");
/*    */       
/* 22 */       return DriverManager.getConnection("jdbc:sqlite:restdb.sqlite");
/*    */ 
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 27 */       JOptionPane.showMessageDialog(null, e); }
/* 28 */     return null;
/*    */   }                                                                                                                                                                                  
}
