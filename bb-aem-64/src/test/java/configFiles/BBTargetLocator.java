package configFiles;

import org.openqa.selenium.*;

public class BBTargetLocator {
    private final WebDriver webDriver;
//    private final WindowTracker windowTracker;
    private Alert alert;

    public BBTargetLocator(final WebDriver webDriver) {
        this.webDriver = webDriver;
//        this.windowTracker = windowTracker;
    }

//    public SwitchToWindow window() {
//        return new SwitchToWindowImpl(webDriver);
//    }

//    public WebDriver newWindow() {
//        return newWindow(defaultTimeout());
//    }

//    public WebDriver newWindow(final Timeouts timeout) {
//        try {
//            final FluentWait<WebDriver> wait = new WebDriverWait(webDriver, timeout.getSeconds());
//            int windowIndex = windowTracker.getCount(); //Zero-based so does not need to be incremented
//            return wait.until(windowToBeAvailableAndSwitchToIt(windowIndex));
//        } catch (TimeoutException e) {
//            throw new NoSuchWindowException(e.getMessage());
//        }
//    }

    public WebDriver frame(int frameIndex) {
        return webDriver.switchTo().frame(frameIndex);
    }

    public WebDriver frame(String frameName) {
        return webDriver.switchTo().frame(frameName);
    }

    public WebDriver frame(WebElement frameElement) {
        return webDriver.switchTo().frame(frameElement);
    }

    public WebDriver parentFrame() {
        return webDriver.switchTo().parentFrame();
    }

    public WebDriver defaultContent() {
        return webDriver.switchTo().defaultContent();
    }

    public WebElement activeElement() {
        return webDriver.switchTo().activeElement();
    }

//    public Alert alert() {
//        return alert(defaultTimeout());
//    }

//    public Alert alert(final Timeout timeout) {
//        try {
//            final FluentWait<WebDriver> wait = new WebDriverWait(webDriver, timeout.getSeconds());
//            return new Alert(webDriver, wait.until(alertIsPresent())) {
//                @Override
//                public void dismiss() {
//                    alert.dismiss();
//                    waitUntilAlertIsNotPresent();
//                }
//
//                @Override
//                public void accept() {
//
//                }
//
//                @Override
//                public String getText() {
//                    return null;
//                }
//
//                @Override
//                public void sendKeys(String s) {
//
//                }
//
//                @Override
//                public void setCredentials(Credentials credentials) {
//
//                }
//
//                @Override
//                public void authenticateUsing(Credentials credentials) {
//
//                }
//            };
//        } catch (TimeoutException e) {
//            throw new NoAlertPresentException(e.getMessage());
//        }
//    }
}
