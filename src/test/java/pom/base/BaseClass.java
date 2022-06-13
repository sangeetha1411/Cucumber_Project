package pom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void getBrowser(String browsername) {
		try {
			browsername.equalsIgnoreCase("chrome");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91888\\eclipse-workspace\\Seliniom_Project\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	   
		
	}

}
