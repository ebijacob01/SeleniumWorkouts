package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegister {
      public static void main(String[] args) {
    	  WebDriverManager.chromedriver().setup();
  		
  		ChromeDriver driver=new ChromeDriver();
  		driver.get("https://www.facebook.com/");
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ebinazer");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("ebinazer321@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ebinazer321@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Ebi@123#Ebi@123");
		
		WebElement birthday_day = driver.findElement(By.name("birthday_day"));
		Select index = new Select(birthday_day);
		index.selectByIndex(12);
		WebElement birthday_month = driver.findElement(By.name("birthday_month"));
		Select index1 = new Select(birthday_month);
		index1.selectByIndex(7);
		
		driver.findElement(By.id("year")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
	}
}
