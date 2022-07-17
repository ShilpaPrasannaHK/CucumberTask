package CucumberHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before("@Smoke")
	public void setup_browser(Scenario sc)
	{
		System.out.println("Launch chrome browser");
		System.out.println(sc.getName());
	}
	
//	@Before(order=2)
//	public void setup_url()
//	{
//		System.out.println("Launch url");
//	}
//	
//	@After(order=2)
//	public void tearDown_close()
//	{
//		System.out.println("close the browser");
//	}
	
	@After("@Smoke")
	public void tearDown_logout()
	{
		System.out.println("logout from application");
	}
	
	@BeforeStep
	public void takescreenshot()
	{
		System.out.println("Take the screenshot");
	}
	
	@AfterStep
	public void refreshPage()
	{
		System.out.println("refresh the page");
	}


}
