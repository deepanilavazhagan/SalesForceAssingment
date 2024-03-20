package assingment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		File src = driver.getScreenshotAs(OutputType.FILE);

		File dst = new File("./snap/img.jpeg");
		FileUtils.copyFile(src, dst);
		driver.findElement(By.id("email")).sendKeys("ddeepanilavazhagan");
		driver.findElement(By.id("pass")).sendKeys("nilavu@2001");
		driver.findElement(By.name("login")).click();

	}

}
