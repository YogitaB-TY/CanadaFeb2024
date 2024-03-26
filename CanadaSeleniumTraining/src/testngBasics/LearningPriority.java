package testngBasics;

import org.testng.annotations.Test;

public class LearningPriority {
	/**
	 * One class can have multiple @Test. 
	 * But it is not recommended to have multiple test cases in same class
	 * register--> login--> wishlist--> addtocart
	 * @Test has built in helper attributes --> priority
	 */
	
	@Test(priority = 2)
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	@Test(priority = 1)
	public void registerTest() {
		System.out.println("Register Test");
	}
	
	@Test(priority = 3)
	public void wishlistTest() {
		System.out.println("WishList test");
	}
	
	@Test(priority = 4)
	public void addToCartTest() {
		System.out.println("Add to cart Test");
	}

}
