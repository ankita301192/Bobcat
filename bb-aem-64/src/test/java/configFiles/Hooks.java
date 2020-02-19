package configFiles;

import com.google.inject.Inject;
import cucumber.api.java.Before;

public class Hooks {

    private final Env env;


    @Inject
    public Hooks(final Env env){
        this.env = env;
    }

    @Before("@hook-aem")
    public void openAEMWebSite() throws Throwable {
        open(env.config.getString("aem-login-url"));
        Browser.manage().window().maximize();
    }

    public static void open(String url) {
        Browser.getWebDriver().get(url);
    }
}
