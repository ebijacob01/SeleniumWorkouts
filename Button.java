package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("Home")).click();
		String text="TestLeaf - Selenium Playground";
		String title=driver.getTitle();
		if(text.equals(title)) {
			System.out.println("Home page is displayed");
		}else {
			System.out.println("Home page is not displayed");
		}
		driver.findElement(By.linkText("Button")).click();
		Point location=driver.findElement(By.id("position")).getLocation();
		int x=location.getX();
		System.out.println(x);
		int y=location.getY();
		System.out.println(y);
		
	}
}
