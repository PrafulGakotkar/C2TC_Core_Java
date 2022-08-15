package com.tns.core.jdbc;
/*WAP in jdbc to fetch all employee details from employee table of oracle database & display them, use type-4 driver .
 * 
 * create table employee(eid number(10),ename varchar(20),eloc varchar(20),esal number(20),edesg varchar(20));
 * insert into employee values(101,'Geeta','Pune',30000,'developer');
 * insert into employee values(102,'Seeta','Amravati',40000,'administrator');
 * insert into employee values(103,'Dhiraj','Nagpur',30000,'designer');
 * insert into employee values(104,'Mahesh','Nagpur',50000,'manager');
 * insert into employee values(105,'Radhika','Pune',30000,'designer');
 * commit;
 * 
 * */

import java.sql.*;
class JdbcTesting2{
	
	public static void main(String[] args) throws ClassNotFoundException{
		
		String query = "select * from emp1 ";
		
		try{
			
			//register type-4 jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//establish the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","SYSTEM","praful11");
			
			//create jdbc Statement object
			Statement st = con.createStatement();
			
			//execute the query and process the result
			ResultSet rst = st.executeQuery(query);
			
			//Display database table records
			while(rst.next()!=false){
				
				//System.out.println("Inside while Loop......");
				System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+"\t"+rst.getString(3)+"\t"+rst.getInt(4)+"\t"+rst.getString(5));
			}
			
			//close jdbc objects in reverse order
			rst.close();
			st.close();
			con.close();
		}
		catch(Exception se){
			se.printStackTrace();
		}
	}
}