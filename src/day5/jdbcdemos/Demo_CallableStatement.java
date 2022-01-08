package day5.jdbcdemos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_CallableStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection connection = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
		System.out.println("Connected");
		
		//is used to CALL stored procedures
		CallableStatement statement = connection.prepareCall("call GetRecords()");
	
		ResultSet res = statement.executeQuery();

		while (res.next()) {
			System.out.print(res.getString(1)+ "   ");
			System.out.print(res.getString(2)+ "   ");
			System.out.print(res.getString(3)+ "   ");
			System.out.println(res.getString(4)+ "   ");
		}
		
		statement.close();
		connection.close();

	}
}
