package mavenEX;

import java.io.FileInputStream;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
//		By buttonL = By.xpath("//button[text()='Click for JS Alert']");
//		WebElement button= driver.findElement(buttonL);
//		button.click();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
//		By butonL = By.xpath("//button[text()='Click for JS Prompt']");
//		WebElement buton= driver.findElement(butonL);
//		buton.click();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("kairos");
//		alert.accept();

		By buttonL = By.xpath("//span[text()='right click me']");
		WebElement button= driver.findElement(buttonL);
	    Actions action = new Actions(driver);
        action.contextClick(button).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
//        driver.switchTo().frame("iframeResult");
//		By fieldL = By.id("field1");
//		WebElement field= driver.findElement(fieldL);
//		field.clear();
//		field.sendKeys("imran");
//		Actions action = new Actions(driver);
//
//		By buttonL = By.xpath("//button[text()='Copy Text']");
//		WebElement button= driver.findElement(buttonL);
//		action.doubleClick(button).build().perform();
		
		
//		int rows=1;
//		int column=2;
//		for(int i=0;i<rows;i++) {
//			System.out.println(rows);
//		
//			for(int j=0;j<column;j++) {
//				System.out.println(column);
		
//	    FileInputStream fi = new FileInputStream(pat);
//		XSSFWorkbook w = new XSSFWorkbook(fi);
//		XSSFSheet s = w.getSheetAt(0);
//		
		driver.quit();
//				
//			}
//}
	}
	
}
//http://swisnl.github.io/jQuery-contextMenu/demo.html
