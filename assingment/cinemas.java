package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cinemas {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.pvrcinemas.com/\r\n");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("input[@placeholder='Search your city']")).click();
		driver.findElement(By.xpath("//img[@alt='Chennai'")).click();
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer'")).click();
		driver.findElement(By.xpath("//span[text()='Chennai'")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
	}

}
