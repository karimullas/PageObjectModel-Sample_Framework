package JunitPractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Sent {

	@Before
	public void Login()
	{
		System.out.println("Login");
	}

	@After
	public void LogOut()
	{
		System.out.println("Logout");
	}
	
	@Test
	public void Test_Sent()
	{
		System.out.println("Sent");
	}
}
