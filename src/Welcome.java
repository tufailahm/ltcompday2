import java.util.Date;
import hr.Product;

//here is a demo for achieving modularity in java
/*
 * 
 */
/**
 * 
 * @author tufai
 * This is demo by Tufail Ahmed from Bangalore
 */
public class Welcome {
	int visitorCount = 91816;
	public void weatherStatus() {
		System.out.println("4. Weather in bangalore is awesome");
	}
	public void display() {
		System.out.println("3.#Display called started");
		Welcome welcome = new Welcome();
		welcome.weatherStatus();
	}
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		Welcome welcome = new Welcome();
		welcome.display();
		System.out.println("6. Core java training is going on");
		ProductApp productApp = new ProductApp();
		productApp.printWelcomeMessage();

		Product product = new Product();
		product.getProduct();

		Orders orders = new Orders();
		orders.takeOrders();
		
		Reviews reviews = new Reviews();
		reviews.giveReviews();
	}
}
class Orders {
	public void takeOrders() {
		Welcome welcome = new Welcome();
		System.out.println("Taking Orders from " + welcome.visitorCount + " user");
	}}
class Reviews extends Welcome {
	public void giveReviews() {
		Welcome welcome = new Welcome();
		System.out.println("Giving reviews from " + welcome.visitorCount + " user");
		System.out.println("Giving reviews for " + visitorCount + " user");
	}
}