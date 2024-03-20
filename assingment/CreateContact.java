package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("deepan");
		driver.findElement(By.id("lastNameField")).sendKeys("k");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.name("description")).sendKeys("i am deepanilavazhagan");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ddeepanilavazhagan@gmail.com");
		WebElement a=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select obj=new Select(a);
		obj.selectByValue("NY");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Hello");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
	
	}

}
