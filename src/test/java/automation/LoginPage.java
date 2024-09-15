package automation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginPage {

	private WebDriver dr;
	private ExtentReports extent;
    private ExtentTest test;
		// TODO Auto-generated method stub
	@BeforeTest
	public void setup() {
		dr=new ChromeDriver();
		//to open up the url
		dr.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");
	};
	@Test
	public void code() {
		test = extent.createTest("Login Test");
		//to find the signup page
		dr.findElement(By.xpath("//a[@href='/common/signup/']")).click();
		// to fill the name input box
		dr.findElement(By.id("first_name")).sendKeys("Mamta Thakur");
		// for fill the email input box
		dr.findElement(By.id("username")).sendKeys("mamtathakur4736@gmail.com");
		//for fill out the password input field
		dr.findElement(By.id("password")).sendKeys("mamta@123");
		//to click on submit button
		dr.findElement(By.className("btn-danger")).click();
		//for login
				dr.findElement(By.className("text-dark")).click();
				//to fill the email input box
				dr.findElement(By.id("username")).sendKeys("mamtathakur4736@gmail.com");
				//to fill the password input box
				dr.findElement(By.id("password")).sendKeys("mamta@123");
				//to click on login button
				dr.findElement(By.className("btn-danger")).click();
				
				
	}
		
	
		

	}


