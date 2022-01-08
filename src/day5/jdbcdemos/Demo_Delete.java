package day5.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo_Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
		System.out.println("Connected");
		
		Scanner scanner = new Scanner(System.in);
		
		//Inputting the product details from the user
		System.out.println("Enter product id : ");
		int productId = scanner.nextInt();
		
		
		//Use case : We have to delete the record for the entered product id from the database.
		
		PreparedStatement preparedStatement = connection.prepareStatement("delete from product where productid = ?");
		preparedStatement.setInt(1, productId);
		
		int result = preparedStatement.executeUpdate();
		
		System.out.println(result + " rows(s) affected");
		
		preparedStatement.close();
		connection.close();
	}
}
