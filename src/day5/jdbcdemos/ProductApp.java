package day5.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductApp {
	Scanner scanner = new Scanner(System.in);

	Connection connection;

	public void menu() throws ClassNotFoundException, SQLException {
		while (true) {
			System.out.println(" M E N U ");
			System.out.println("1. Add Product");
			System.out.println("2. Update Product");
			System.out.println("3. Delete Product");
			System.out.println("4. View All Products");
			System.out.println("9. E X I T");
			System.out.println("Enter your choice : ");
			int choice = scanner.nextInt();

			initialize();

			switch (choice) {
			case 1:
				System.out.println("Welcome to add product section ");
				insertProduct();
				break;
			case 2:
				System.out.println("Welcome to update product section ");
				updateProduct();
				break;
			case 3:
				System.out.println("Welcome to delete product section ");
				deleteProduct();
				break;
			case 4:
				System.out.println("Welcome to view all product section ");
				viewAllProducts();
				break;
			case 9:
				System.out.println("Thanks for using my product app");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice (1-4) and 9 to exit");
			}
		}
	}

	public void initialize() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
	}

	public void deleteProduct() throws SQLException {
		System.out.println("Enter product id : ");
		int productId = scanner.nextInt();

		PreparedStatement preparedStatement = connection.prepareStatement("delete from product where productid = ?");
		preparedStatement.setInt(1, productId);

		int result = preparedStatement.executeUpdate();
		System.out.println(result + " rows(s) affected");
	}

	public void updateProduct() throws SQLException {
		// Inputting the product details from the user
		System.out.println("Enter product id to update : ");
		int productId = scanner.nextInt();

		System.out.println("Enter new product name : ");
		String productName = scanner.next();

		System.out.println("Enter new quantity on hand : ");
		int quantityOnHand = scanner.nextInt();

		System.out.println("Enter new price : ");
		int price = scanner.nextInt();

		// Use case : We have to update the entered details in the database.

		PreparedStatement preparedStatement = connection.prepareStatement(
				"update product set productName = ?, quantityOnHand = ?, price = ? where productId = ?");
		preparedStatement.setInt(4, productId);
		preparedStatement.setString(1, productName);
		preparedStatement.setInt(2, quantityOnHand);
		preparedStatement.setInt(3, price);

		int result = preparedStatement.executeUpdate();

		System.out.println(result + " rows(s) affected");

	}

	public void insertProduct() throws SQLException {
		// Inputting the product details from the user
		System.out.println("Enter product id : ");
		int productId = scanner.nextInt();

		System.out.println("Enter product name : ");
		String productName = scanner.next();

		System.out.println("Enter quantity on hand : ");
		int quantityOnHand = scanner.nextInt();

		System.out.println("Enter price : ");
		int price = scanner.nextInt();

		// Use case : We have to insert the entered details in the database.

		PreparedStatement preparedStatement = connection.prepareStatement("insert into product values(?,?,?,?)");
		preparedStatement.setInt(1, productId);
		preparedStatement.setString(2, productName);
		preparedStatement.setInt(3, quantityOnHand);
		preparedStatement.setInt(4, price);

		int result = preparedStatement.executeUpdate();

		System.out.println(result + " rows(s) affected");

	}

	public void viewAllProducts() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet res = statement.executeQuery("select * from product");

		while (res.next()) {
			System.out.print(res.getString(1)+ "   ");
			System.out.print(res.getString(2)+ "   ");
			System.out.print(res.getString(3)+ "   ");
			System.out.println(res.getString(4)+ "   ");
		}
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductApp app = new ProductApp();
		app.menu();
	}

}
