package assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("deepan");
		driver.findElement(By.name("lastname")).sendKeys("k");
		driver.findElement(By.name("reg_email__")).sendKeys("9360110516");
		driver.findElement(By.id("password_step_input")).sendKeys("nilavu@2001");
		WebElement a = driver.findElement(By.id("day"));
		Select obj=new Select(a);
		obj.selectByValue("3");
		WebElement b = driver.findElement(By.id("month"));
		Select obj1=new Select(b);
		obj1.selectByValue("3");
		WebElement c =driver.findElement(By.id("year"));
		Select obj2=new Select(c);
		obj2.selectByValue("2001");
		driver.findElement(By.xpath("//label[contains(text(),'Fem')]")).click();
		

		
		
		
	}

}
