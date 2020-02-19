package stepdefs;

import com.google.inject.Inject;
import configFiles.Browser;
import configFiles.Config;
import configFiles.Env;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.TestPage;
import configFiles.WebdriverTest;


public class MyStepdefs {

    private TestPage testPage;

    private Config config;

    private WebdriverTest webdriverTest;

    private WebDriver webDriver;

    private Env env;


    @Inject
    public MyStepdefs(final TestPage testPage, final Config config, final WebdriverTest webdriverTest, final WebDriver webDriver, final Env env) {
        this.testPage = testPage;
        this.config = config;
        this.webdriverTest = webdriverTest;
        this.webDriver = webDriver;
        this.env = env;
    }

//    public static void main(String[] args){
//        getWebDriver.get("https://ee.co.uk/why-ee/mobile-coverage");
//    }

    @Given("^I am on Coverage Checker homepage$")
    public void iAmOnCoverageCheckerHomepage() {
//        getWebDriver.get("https://ee.co.uk/why-ee/mobile-coverage");
        open(env.config.getString("aem-login-url"));
        Browser.manage().window().maximize();
    }

    @When("^I provide location or postcode$")
    public void iProvideLocationOrPostcode() {
        testPage.provideLocation().clickCheck();
    }

    @Then("^I see the location is displaying in the header field$")
    public void iSeeTheLocationIsDisplayingInTheHeaderField() {
        Assert.assertTrue("not displaying", testPage.isLocationFieldDisplaying());
    }

    public static void open(String url) {
        Browser.getWebDriver().get(url);
    }
}
