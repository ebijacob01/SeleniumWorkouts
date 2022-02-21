package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {
    
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver type=new ChromeDriver();
		type.get("http://www.leafground.com/pages/Button.html");
		type.manage().window().maximize();
		type.findElement(By.id("home")).click();
		
		Point location = type.findElement(By.id("position")).getLocation();
		int x = location.getX();
		System.out.println(x);
		int y = location.getY();
		System.out.println(y);
		
		String cssValue = type.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(cssValue);
		
		Dimension size = type.findElement(By.id("size")).getSize();
		int height = size.height;
		System.out.println(height);
		int width = size.width;
		System.out.println(width);
	}
}
