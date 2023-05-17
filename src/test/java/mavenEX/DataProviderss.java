package mavenEX;

import org.testng.annotations.DataProvider;

public class DataProviderss {
	@DataProvider
	public static Object[][] getdat(){
		Object[][]data= new Object[4][2];
		data[0][0]="seleniumpanda@rediffmail.com";
		data[0][1]="Selenium@123";
		
		data[1][0]="seleniumpanda@rediffmail.com";
		data[1][1]="Selenium@123";
		
		data[2][0]="seleniumpanda@rediffmail.com";
		data[2][1]="Selenium@123";
		
		data[3][0]="seleniumpanda@rediffmail.com";
		data[3][1]="Selenium@123";
		return data;
	}
}
//data[1][0]="seleniumpanda1@rediffmail.com";
//data[1][1]="Donkey@123";
//
//data[2][0]="seleniumpanda2@rediffmail.com";
//data[2][1]="Selenium@123";
//
//data[3][0]="seleniumpanda3@rediffmail.com";
//data[3][1]="Selenium@1234";