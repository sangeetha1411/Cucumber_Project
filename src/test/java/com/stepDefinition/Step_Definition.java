package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
public class Step_Definition {
	public WebDriver driver;

	@Given("Entering google com")

	public void entering_google_com() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91888\\eclipse-workspace\\Seliniom_Project\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    System.out.println("google page launched");
	    
}
@When("Click the search box")
public void click_the_search_box() {
	driver.findElement(By.name("q")).sendKeys("Automation testing");
}
@When("Search term as {string}")
public void search_term_as(String string) {
   
}
@Then("search result for Automation testing")
public void search_result_for_automation_testing() {
	boolean status = driver.findElement(By.partialLinkText("Automationtesting")).isDisplayed();
	if(status){
		System.out.println("Result displayed");
		
	}
    
}




}
