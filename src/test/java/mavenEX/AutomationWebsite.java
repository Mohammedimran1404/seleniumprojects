package mavenEX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationWebsite {
	public static WebDriver driver;

	public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
				driver.manage().window().maximize();
				
				By textL= By.xpath("//span[text()='AUTOMATION PRACTICE ME']");
				WebElement text=driver.findElement(textL);
				if(text.isDisplayed()) {
					System.out.println(text.isDisplayed());
					System.out.println(text.getText()+" is displayed");
				}
				
				By firstL = By.xpath("//input[@name='firstname']");
				WebElement first =driver.findElement(firstL);
				first.sendKeys("mohammed");
				
				By lastL = By.xpath("//input[@name='lastname']");
				WebElement last =driver.findElement(lastL);
				last.sendKeys("imran");
				
				By genL = By.xpath("//input[@id='sex-0']");
				WebElement gen =driver.findElement(genL);
				gen.click();
				
				By expL = By.xpath("//input[@id='exp-0']");
				WebElement exp =driver.findElement(expL);
				exp.click();
				
				By dateL = By.xpath("//input[@id='datepicker']");
				WebElement date =driver.findElement(dateL);
				date.sendKeys("21/04/2023");
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true)",date);
				
				By autoL = By.xpath("//input[@type='checkbox' and contains(@id,'profession')]");
				List<WebElement> auto =driver.findElements(autoL);
				for(WebElement ele1:auto) {
					ele1.click();
				}
				
				
				By allL = By.xpath("//input[@type='checkbox' and contains( @id,'tool')]");
				List<WebElement> all =driver.findElements(allL);
				for(WebElement ele: all) {
					ele.click();
				}
				By seleL = By.xpath("//select[@id='continents']");
				WebElement sele =driver.findElement(seleL);
				Select selec= new Select(sele);
				selec.selectByIndex(3);
				
				By sele1L = By.xpath("//select[@id='selenium_commands']");
				WebElement sele1 =driver.findElement(sele1L);
				Select sele2 = new Select(sele1);
				sele2.selectByVisibleText("WebElement Commands");
				sele2.selectByIndex(1);
				js.executeScript("arguments[0].scrollIntoView(true)",sele1);
				

				By btnL = By.xpath("//button[text()='Button']");
				WebElement btn =driver.findElement(btnL);
				btn.click();
				System.out.println(btn.getText());
				System.out.println(btn.isEnabled());
	}
				

	}


