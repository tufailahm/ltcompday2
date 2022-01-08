package day5.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo_Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
		System.out.println("Connected");
		
		Scanner scanner = new Scanner(System.in);
		
		//Inputting the product details from the user
		System.out.println("Enter product id to update : ");
		int productId = scanner.nextInt();
		
		System.out.println("Enter new product name : ");
		String productName = scanner.next();
		
		System.out.println("Enter new quantity on hand : ");
		int quantityOnHand = scanner.nextInt();
		
		System.out.println("Enter new price : ");
		int price = scanner.nextInt();
		
		//Use case : We have to update the entered details in the database.
		
		PreparedStatement preparedStatement = connection.prepareStatement
				("update product set productName = ?, quantityOnHand = ?, price = ? where productId = ?");
		preparedStatement.setInt(4, productId);
		preparedStatement.setString(1, productName);
		preparedStatement.setInt(2, quantityOnHand);
		preparedStatement.setInt(3, price);
		
		int result = preparedStatement.executeUpdate();
		
		System.out.println(result + " rows(s) affected");
		
		preparedStatement.close();
		connection.close();
	}
}
