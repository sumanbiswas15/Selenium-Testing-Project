package co.edureka.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
    public static void main(String[] args) {
        // ✅ Correct GeckoDriver path for Firefox
        System.setProperty("webdriver.gecko.driver",
            "C:\\Users\\91843\\OneDrive\\Desktop\\SE\\Exe Files\\geckodriver-v0.36.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://www.wikipedia.org/");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            WebElement englishLink = driver.findElement(By.id("js-link-box-en"));
            englishLink.click();
            Thread.sleep(2000);

            WebElement searchBox = driver.findElement(By.name("search"));
            searchBox.sendKeys("Artificial Intelligence");
            searchBox.submit();
            Thread.sleep(3000);

            String pageTitle = driver.getTitle();
            if (pageTitle.toLowerCase().contains("artificial intelligence")) {
                System.out.println("✅ Opened Wikipedia article: " + pageTitle);
            } else {
                System.out.println("❌ Unexpected page title: " + pageTitle);
            }

            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
//