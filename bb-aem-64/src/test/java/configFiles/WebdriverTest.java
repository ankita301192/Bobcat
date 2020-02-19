package configFiles;
import org.openqa.selenium.*;
import org.openqa.selenium.logging.Logs;

import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.logging.Logs;

public interface WebdriverTest{


    public interface WebDriver extends SearchContext {
        void get(String var1);

        String getCurrentUrl();

        String getTitle();

        List<WebElement> findElements(By var1);

        WebElement findElement(By var1);

        String getPageSource();

        void close();

        void quit();

        Set<String> getWindowHandles();

        String getWindowHandle();

        org.openqa.selenium.WebDriver.TargetLocator switchTo();

        org.openqa.selenium.WebDriver.Navigation navigate();

        org.openqa.selenium.WebDriver.Options manage();

        @Beta
        public interface Window {
            void setSize(Dimension var1);

            void setPosition(Point var1);

            Dimension getSize();

            Point getPosition();

            void maximize();
        }

        public interface ImeHandler {
            List<String> getAvailableEngines();

            String getActiveEngine();

            boolean isActivated();

            void deactivate();

            void activateEngine(String var1);
        }

        public interface Navigation {
            void back();

            void forward();

            void to(String var1);

            void to(URL var1);

            void refresh();
        }

        public interface TargetLocator {
            org.openqa.selenium.WebDriver frame(int var1);

            org.openqa.selenium.WebDriver frame(String var1);

            org.openqa.selenium.WebDriver frame(WebElement var1);

            org.openqa.selenium.WebDriver window(String var1);

            org.openqa.selenium.WebDriver defaultContent();

            WebElement activeElement();

            Alert alert();
        }

        public interface Timeouts {
            org.openqa.selenium.WebDriver.Timeouts implicitlyWait(long var1, TimeUnit var3);

            org.openqa.selenium.WebDriver.Timeouts setScriptTimeout(long var1, TimeUnit var3);
        }

        public interface Options {
            void addCookie(Cookie var1);

            void deleteCookieNamed(String var1);

            void deleteCookie(Cookie var1);

            void deleteAllCookies();

            Set<Cookie> getCookies();

            Cookie getCookieNamed(String var1);

            org.openqa.selenium.WebDriver.Timeouts timeouts();

            org.openqa.selenium.WebDriver.ImeHandler ime();

            @Beta
            org.openqa.selenium.WebDriver.Window window();

            @Beta
            Logs logs();
        }
    }
}
