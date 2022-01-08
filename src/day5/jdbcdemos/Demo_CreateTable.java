package day5.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo_CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
		
		//Use case : We have to create a table from java
		
		Statement statement = connection.createStatement();
		statement.execute("create table emp ( empid int, empname varchar(20), salary int)");
		
		System.out.println("Table created");
		
		statement.close();
		connection.close();
	}
}
