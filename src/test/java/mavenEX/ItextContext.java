package mavenEX;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ItextContext {
	// ITestContext is a interface
	// purpose = within the class we can share data
	@Test(priority=1)
	public void login(ITestContext context) {
		System.out.println("Login to the Application");
		context.setAttribute("Google", "Chrome");
		
	}
	@Test(priority=2,dependsOnMethods="login")
	public void enterSigningBtn(ITestContext context) {
		System.out.println("Clicking on Signong button");
	String Browsers=(String)context.getAttribute("Google");
	System.out.println("The browsers are : "+Browsers);
	context.setAttribute("Microsoft", "Dell");
		
	}
	@Test(priority=3, dependsOnMethods= {"enterSigningBtn","login"})
	public void logOut(ITestContext context) {
		System.out.println("Logout from the application");
	String Browsers=(String)context.getAttribute("Google");
	System.out.println("the browser are : "+Browsers);
	String OperatingSystem=(String)context.getAttribute("Microsoft");
	System.out.println("The os are : "+OperatingSystem);
	}

}
