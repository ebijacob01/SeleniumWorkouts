package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver sales = new ChromeDriver();
		sales.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		sales.manage().window().maximize();
		sales.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sales.findElement(By.name("UserFirstName")).sendKeys("Ebinazer");
		sales.findElement(By.name("UserLastName")).sendKeys("M");
		sales.findElement(By.name("UserEmail")).sendKeys("Ebinazer321@gmail.com");
		sales.findElement(By.name("CompanyName")).sendKeys("Testleaf");
		sales.findElement(By.name("UserPhone")).sendKeys("8248411508");
		
	    WebElement UserTitle= sales.findElement(By.name("UserTitle"));
	    Select job=new Select(UserTitle);
	    job.selectByIndex(9);
	    
	    WebElement CompanyEmployees=sales.findElement(By.name("CompanyEmployees"));
	    Select employee=new Select(CompanyEmployees);
	    employee.selectByIndex(1);
	    
	    sales.findElement(By.name("CompanyCountry")).sendKeys("India");
	    sales.findElement(By.name("CompanyState")).sendKeys("Tamil Nadu");
	    //sales.findElement(By.className("checkbox-ui")).click();
	    sales.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
	    
	    
	}

}