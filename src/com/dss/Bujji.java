package com.dss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bujji {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//this program about storing a table in oracle database, the table is about my second sibling family members
		
		//step-1 loading the oracle driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		System.out.println("--------------------------------------------");
		
		//step-2 connecting with the database through Connection object & DriverManager.getConnection()
		Connection ts = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","R@m123");
		System.out.println("Connected with the Oracle database");
		System.out.println("--------------------------------------------");
		
		//step-3 declaring/writing the queries
		//String r0 = "create table ONERAM.Bujji(Name varchar2(40), Relation varchar2(40), SerialNumber number)";
		//String r1 = "insert into ONERAM.Bujji values('Swarupa Bejjanki','Herself my second sister', 111)";
		//String r2 = "insert into ONERAM.Bujji values('Rajendra Prasad Pendyala','her husband',222)";
		//String r3 = "insert into ONERAM.Bujji values('Bhanu Prakash Pendyala','her first son',333)";
		//String r4 = "insert into ONERAM.Bujji values('Om Prakash Pendyala','her second son',444)";
		String r5 = "select * from ONERAM.Bujji";
		
		//step-4 creating statement object to execute quries through executeUpdate() & executeQuery()
		Statement nt = ts.createStatement();
		
		//executing create & update queries with executeUpdate() method
		//int b0 = nt.executeUpdate(r0);
		//int b1 = nt.executeUpdate(r1);
		//int b2 = nt.executeUpdate(r2);
		//int b3 = nt.executeUpdate(r3);
		//int b4 = nt.executeUpdate(r4);
		
		//executing select query with executeQuery() method through ResultSet object
		ResultSet b5 = nt.executeQuery(r5);
		while (b5.next()) {
			System.out.println(b5.getString(1)+" is "+b5.getString(2)+" and "+b5.getInt(3)+" number in talbe ");
		}
		
		//step-5 closing the database connection
		ts.close();
	}

}
