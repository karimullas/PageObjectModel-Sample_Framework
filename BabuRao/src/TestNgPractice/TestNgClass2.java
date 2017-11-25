package TestNgPractice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners()
public class TestNgClass2 {

    
	@Test(groups="Sanity")
	public void method2()
	{
		try{
		Assert.assertEquals("Karimulla", "karimulla");
		}catch(Error e)
		{
			System.out.println(e);
		}
		System.out.println("Hi Kapil, you are handsome Guy in Suntrust");
	}

	@Test(groups="Smoke")
	public void Login()
	{
		System.out.println("Method6");
	}
	
	@Test(groups="Sanity")
	public void LogOut()
	{
		System.out.println("Method7");
	}
	
	@Test(groups="Regression")
	public void method6()
	{
		System.out.println("Karim4");
		
	}
	
	@Test(groups="Regression")
	public void method7()
	{
		System.out.println("Karim5");
		
	}
	
	@Test(groups="Regression")
	public void method8()
	{
		System.out.println("Karim6");
		
	}

}
