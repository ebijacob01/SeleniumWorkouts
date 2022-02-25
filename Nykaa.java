package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver type=new ChromeDriver(option);
		type.get("https://www.nykaa.com/");
		type.manage().window().maximize();
		type.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        Actions builder=new Actions(type);
		
		WebElement men = type.findElement(By.xpath("//a[text()='brands']"));
		builder.moveToElement(men).perform();
		type.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		type.findElement(By.linkText("L'Oreal Paris")).click();
		
		String title1=type.getTitle();
		System.out.println(title1);
	}

}
