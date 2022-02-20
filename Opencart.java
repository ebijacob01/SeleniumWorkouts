package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cart=new ChromeDriver();
		cart.get("https://www.opencart.com/index.php?route=account/register");
		cart.manage().window().maximize();
		cart.findElement(By.id("input-username")).sendKeys("Ebinazer321");
		cart.findElement(By.id("input-firstname")).sendKeys("Ebinazer");
		cart.findElement(By.id("input-lastname")).sendKeys("M");
		cart.findElement(By.id("input-email")).sendKeys("Ebinazer321@gmail.com");
		cart.findElement(By.id("input-country")).sendKeys("India");
		cart.findElement(By.id("input-password")).sendKeys("Testleaf@123");
		
	}

}
