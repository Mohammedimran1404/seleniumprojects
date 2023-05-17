package mavenEX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reteriving_the_data_from_table {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/Admin/Customer/List");
		driver.manage().window().maximize();
		
		By buttonL = By.xpath("//button[text()='Log in']");
		WebElement button = driver.findElement(buttonL);
		button.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		By tableL = By.xpath("//*[@id=\"customers-grid_wrapper\"]/div[1]/div");
		WebElement table = driver.findElement(tableL);
		
		js.executeScript("arguments[0].scrollIntoView(true)", table);
		
		By rowsL= By.tagName("tr");
		List<WebElement>rows= table.findElements(rowsL);
		int totalrows=rows.size();
		for(int r=1;r<=totalrows-1;r++) {
			
			By columnsL= By.tagName("td");
			List<WebElement> columns = rows.get(r).findElements(columnsL);
			int totalcolumns=columns.size();
			for(int c=1;c<totalcolumns;c++) {
				String data=columns.get(c).getText();
				System.out.print(data);
				
			}
			System.out.println();
		}
		 
		
		
		
		

	}

}
