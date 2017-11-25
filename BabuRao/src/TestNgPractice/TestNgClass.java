package TestNgPractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgClass {
	
	@Test(groups="Sanity")
	public void method1()
	{
		System.out.println("Karimulla");
	
	}
	
	@Test(groups="Smoke")
	public void method3()
	{
		System.out.println("Karim");
		
	}
	
	@Test(groups="Sanity")
	public void method4()
	{
		System.out.println("Karim2");
		
	}
	
	@Test(groups="Regression")
	public void method5()
	{
		System.out.println("Karim3");
		
	}	

}
