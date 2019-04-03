package com.dp.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
	
    
    private static Connection connection;  
      
//JDBCSingleton prevents the instantiation from any other class.  
  private Singleton() {  }  
   
  
  static {
	  try {
	  connection=null;  
      Class.forName("com.mysql.jdbc.Driver");  
      connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/lucky", "root", "");  
	  }
	  catch (Exception e) {
		e.printStackTrace();
		  // TODO: handle exception
	}
	  
  }
 
       
// to get the connection from methods like insert, view etc.   
     @SuppressWarnings("unused")
	public static Connection getConnection()throws ClassNotFoundException, SQLException  
     {  
           
         return connection; 
           
     }  

}
