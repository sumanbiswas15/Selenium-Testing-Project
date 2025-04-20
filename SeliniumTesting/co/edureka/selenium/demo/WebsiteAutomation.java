package co.edureka.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebsiteAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", 
            "C:\\Users\\91843\\OneDrive\\Desktop\\SE\\Exe Files\\geckodriver-v0.36.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        try {
            
            driver.get("http://127.0.0.1:5500/Home_page.html");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            
            driver.findElement(By.id("registerButton")).click();
            Thread.sleep(2000);
            


            
            driver.findElement(By.id("username")).sendKeys("test user");
            driver.findElement(By.id("phno")).sendKeys("1234568795");
            driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
            driver.findElement(By.id("age")).sendKeys("20");
            driver.findElement(By.id("password")).sendKeys("ac2134");
            driver.findElement(By.id("confirmPassword")).sendKeys("ac2134");
            driver.findElement(By.id("submit")).click();
            Thread.sleep(2000);

            
            driver.get("http://127.0.0.1:5500/Login.html");
            Thread.sleep(2000);

            
            driver.findElement(By.id("loginUsername")).sendKeys("test user");
            driver.findElement(By.id("loginPassword")).sendKeys("ac2134");
            driver.findElement(By.id("submit")).click();
            Thread.sleep(2000);

             
            driver.get("http://127.0.0.1:5500/Dashboard.html");
            Thread.sleep(2000);

            
            System.out.println("Student management system successfully!");

            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}



