package day5.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection connection = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
		System.out.println("Connected");
		Statement statement = connection.createStatement();
		ResultSet res = statement.executeQuery("select * from product");

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
