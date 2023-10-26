package practice.pages;

import org.openqa.selenium.WebElement;
import net.serenitybdd.annotations.Step;

import java.util.List;

public class HomePage {
    IMDBPage imdbPage;

    @Step("This is to get the movie names")
    public List<WebElement> getMovieName(){
        return imdbPage.getMovieName();
    }
    @Step("This is to get the movie rating")
    public List<WebElement> getMovieRating(){
        return imdbPage.getMovieRating();
    }

//    @Step("Sort the text by movie name")
//    public List<WebElement> sortByText(String str){
//        imdbPage.sortByText(str);
//    }
}
