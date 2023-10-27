package testcases;

import practice.pages.HomePage;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


@RunWith(SerenityRunner.class)

public class IMDbTest extends PageObject {
	@Managed
	WebDriver driver;

	@Steps
	HomePage homePage;

	@Test
	public void tc_verify_sort_movies_based_on_imdb_rating() throws InterruptedException {
		driver.get("https://www.imdb.com/list/ls066033834/");
		System.out.println("Title: "+ getTitle());
		Thread.sleep(2000);
		List<WebElement> beforeSort = homePage.getMovieName();
		List<WebElement> rating = homePage.getMovieRating();
		for(int i=0;i<beforeSort.size();i++){
			System.out.println("\nMovie Name:"+beforeSort.get(i).getText()
					+"\n Movie Rating:"+ rating.get(i).getText());
		}

	}

}
