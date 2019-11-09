package tk.dealerlot.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tk.dealerlot.common.Driver;

public class HomePage {
	
	private By stockLocator = By.id("stockNumber");
	
	public int getNumberOfCarsOnPage() {
		List<WebElement> stockElementList = Driver.getDriver().findElements(stockLocator);
		int count = stockElementList.size();
		return count;
	}
	
	public void goToPage() {
		Driver.getDriver().get("http://dealerlot.tk/");
	}
}
