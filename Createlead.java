package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ebinazer");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ebi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Jacob");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("8/13/2000");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testleaf is a good place to learn");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9884280689");
		
		WebElement createLeadForm_dataSourceId=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select index1=new Select(createLeadForm_dataSourceId);
		index1.selectByIndex(4);
		
		WebElement createLeadForm_industryEnumId=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select index=new Select(createLeadForm_industryEnumId);
		index.selectByIndex(3);
		
		driver.findElement(By.name("generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.name("submitButton")).click();
	}

}
