package include_Exclude;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	public static WebDriver driver;
	@Test
	@Parameters({"Browser","url","username","password"})
	public void rediff(String Browser, String url,String username,String password) {
		if(Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(Browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		By sigL = By.xpath("//a[text()='Sign in']");
		WebElement sig = driver.findElement(sigL);
		sig.click();
		
		By fieL = By.xpath("//input[@id='login1']");
		WebElement fie = driver.findElement(fieL);
		fie.sendKeys(username);
		
		By pasL = By.xpath("//input[@id='password']");
		WebElement pas = driver.findElement(pasL);
		pas.sendKeys(password);
		
		By signL = By.xpath("//input[@name='proceed']");
		WebElement sign = driver.findElement(signL);
		sign.click();
	}

}
