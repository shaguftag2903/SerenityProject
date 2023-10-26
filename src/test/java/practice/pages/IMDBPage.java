package practice.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IMDBPage extends PageObject {

	// Constructor
	public IMDBPage(WebDriver driver) {
		super(driver);
	}

	protected By movieName = By.xpath("//h3/a[contains(text(),title)]");
	protected By movieRating = By.xpath("//div[@class='ipl-rating-star small']//span[contains(@class,'__rating')]");
	protected By sortDropdown = By.className("lister-sort-by");

	public List<WebElement> getMovieName(){
		List<WebElement> list = getDriver().findElements(movieName);
		return list;
	}
	public List<WebElement> getMovieRating(){
		List<WebElement> list = getDriver().findElements(movieRating);
		return list;
	}

}
