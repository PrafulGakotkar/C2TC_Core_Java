package com.tns.core.jdbc;

import java.sql.*;
import java.io.*;
public class JdbcTest1 {
	public static void main(String[] args)throws ClassNotFoundException {
		try {
			//register type-4 driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//establish the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","praful11");
			if(con!= null) {
				System.out.println("Connection Success");
			}
			else {
				System.out.println("Connection Failed");
				
			}
		}
			catch(Exception ob) {
				ob.printStackTrace();
			}
		
	}

}
