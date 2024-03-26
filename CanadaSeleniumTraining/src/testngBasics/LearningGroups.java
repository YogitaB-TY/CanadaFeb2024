package testngBasics;

import org.testng.annotations.Test;

public class LearningGroups {
	
	//smoke test
	@Test(groups = "smoke")
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	//smoke
	@Test(groups = "smoke")
	public void registerTest() {
		System.out.println("Register Test");
	}
	
	//integration
	@Test(groups = "integration")
	public void wishlistTest() {
		System.out.println("WishList test");
	}
	
	//integration
	@Test(groups = "integration")
	public void addToCartTest() {
		System.out.println("Add to cart Test");
	}

}
