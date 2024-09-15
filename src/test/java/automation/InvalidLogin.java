package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class InvalidLogin {

	
		// TODO Auto-generated method stub
	private WebDriver dr;
		@BeforeTest
		public void setup() {
		 dr=new ChromeDriver();
		//to open up th url
		dr.get("https://app.germanyiscalling.com/common/login/");
		};
		//for login
		@Test
		public void Login() {
//				dr.findElement(By.className("text-dark")).click();
				//to fill the email input box
				dr.findElement(By.id("username")).sendKeys("mamtathakur47363@gmail.com");
				//to fill the password input box
				dr.findElement(By.id("password")).sendKeys("mamta@1");
				//to click on login button
				dr.findElement(By.className("btn-danger")).click();
		//to catch the text
//		WebElement al =dr.findElement(By.xpath("//*[contains(text(),'correct username')]"));
				WebElement al=dr.findElement(By.className("alert-danger"));
				String actStr=al.getText();
		String str="Please enter a correct username and password. Note that both fields may be case-sensitive.";
		Assert.assertEquals(actStr,str);
		};
		
	}


