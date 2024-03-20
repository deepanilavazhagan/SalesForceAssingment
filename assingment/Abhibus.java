package assingment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.abhibus.com/\r\n");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

}
