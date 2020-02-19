//package stepdefs;
//
//import com.google.inject.Inject;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.openqa.selenium.WebDriver;
//import org.junit.Assert;
//import pages.TestPage;
//
//import java.time.temporal.TemporalAmount;
//
//public class stepdefs {
//
//    Webdriver driver;
//    private TestPage testPage;
//
//    @Inject
//    public stepdefs(final TestPage testPage){
//        this.testPage = testPage;
//    }
//
////    @Given("^I am on Coverage Checker homepage$")
////    public void iAmOnCoverageCheckerHomepage() {
////        driver.getClass().
////    }
//
//    @When("^I provide location or postcode$")
//    public void iProvideLocationOrPostcode() {
//        testPage.provideLocation().clickCheck();
//    }
//
//    @Then("^I see the location is displaying in the header field$")
//    public void iSeeTheLocationIsDisplayingInTheHeaderField() {
//    Assert.assertTrue("not displaying", testPage.isLocationFieldDisplaying());
//    }
//}
