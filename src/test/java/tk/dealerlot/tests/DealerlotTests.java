package tk.dealerlot.tests;

import org.testng.annotations.Test;

import tk.dealerlot.common.Driver;
import tk.dealerlot.pages.HomePage;

public class DealerlotTests {
	
	@Test
	public void verifyNumberOfCarsOnPageMatchNumberOfCarsInDatabase() {
		HomePage homePage = new HomePage();
		homePage.goToPage();
		int numberOfCarsOnPage = homePage.getNumberOfCarsOnPage();
		System.out.println("There are " + numberOfCarsOnPage + " on HomePage");
		
		
	}
}
