package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver acme=new ChromeDriver();
		acme.get("https://acme-test.uipath.com/login");
		acme.manage().window().maximize();
		acme.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		acme.findElement(By.id("password")).sendKeys("leaf@12");
		acme.findElement(By.xpath("//button[@type='submit']")).click();
		
		String test="ACME System 1 - Dashboard";
		String test1=acme.getTitle();
		if(test.equals(test1)) {
			System.out.println("Webpage is displayed");
		}else {
			System.out.println("Webpage is not displayed");
		}
		acme.findElement(By.linkText("Log Out")).click();
		
		
	}

}
