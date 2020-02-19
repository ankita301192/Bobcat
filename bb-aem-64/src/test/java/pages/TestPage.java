package pages;

import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class TestPage {

    @FindBy(css="input[class='form__control maps-form-control maps-search-box']")
    public WebElement searchBar;

    @FindBy(css="button[class='btn maps-search-btn cc-home-search-btn']")
    public WebElement checkBtn;

    @FindBy(css="span[class='maps-postcode']")
    public WebElement locationField;

    public TestPage provideLocation(){
        searchBar.sendKeys("London");
        return this;
    }

    public TestPage clickCheck(){
        checkBtn.click();
        return this;
    }

    public boolean isLocationFieldDisplaying(){
        return locationField.isDisplayed();
    }
}
