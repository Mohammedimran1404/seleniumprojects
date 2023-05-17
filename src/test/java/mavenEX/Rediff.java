package mavenEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff {
	public static WebDriver driver;
//	@Test
//	public void loginToRediff() {
//		WebDriverManager.edgedriver().setup();
//	    driver = new EdgeDriver();
//		driver.get("https://www.rediff.com/");
//		driver.manage().window().maximize();
//	}
		@Test(priority =1,dataProvider="getdat",dataProviderClass=DataProviderss.class)
		public static void textbox(String usernames,String passwords) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get("https://www.rediff.com/");
			driver.manage().window().maximize();
			
			By signL = By.xpath("//p[@id='signin_info']/child::a[1]");
			WebElement sign = driver.findElement(signL);
			sign.click();
			By usernameL = By.xpath("//div[@class='cell']//child::input[@id='login1']");
			WebElement username = driver.findElement(usernameL);
			username.sendKeys(usernames);
			System.out.println("in pass method");
			//Thread.sleep(3000);
			By passwordL = By.xpath("//input[@id=\"password\"]");
			WebElement password = driver.findElement(passwordL);
			password.sendKeys(passwords);
			By buttonL = By.xpath("//input[@name='proceed']");		
			WebElement button = driver.findElement(buttonL);
			button.click();	
			driver.quit();
			/*By logoutL = By.xpath("//a[text()='Logout']");
			WebElement logout = driver.findElement(logoutL);
			logout.click();*/
			
		}
//		@Test
//		public void logout() {
//			driver.close();
//		}
		
		

		
			
		}
		
	


		
	
	
	
