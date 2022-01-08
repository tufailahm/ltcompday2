package day5.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo_Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
		System.out.println("Connected");
		
		Scanner scanner = new Scanner(System.in);
		
		//Inputting the product details from the user
		System.out.println("Enter product id : ");
		int productId = scanner.nextInt();
		
		System.out.println("Enter product name : ");
		String productName = scanner.next();
		
		System.out.println("Enter quantity on hand : ");
		int quantityOnHand = scanner.nextInt();
		
		System.out.println("Enter price : ");
		int price = scanner.nextInt();
		
		//Use case : We have to insert the entered details in the database.
		
		PreparedStatement preparedStatement = connection.prepareStatement("insert into product values(?,?,?,?)");
		preparedStatement.setInt(1, productId);
		preparedStatement.setString(2, productName);
		preparedStatement.setInt(3, quantityOnHand);
		preparedStatement.setInt(4, price);
		
		int result = preparedStatement.executeUpdate();
		
		System.out.println(result + " rows(s) affected");
		
		preparedStatement.close();
		connection.close();
	}
}
