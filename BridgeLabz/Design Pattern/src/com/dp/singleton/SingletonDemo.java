package com.dp.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class SingletonDemo {
	public static void main(String[] args) throws ClassCastException,SQLException, ClassNotFoundException{
		Connection con1= Singleton.getConnection();
		
		System.out.println(con1.hashCode());
		
		
		Connection con2=Singleton.getConnection();
		System.out.println(con2.hashCode());
		
	}

}
