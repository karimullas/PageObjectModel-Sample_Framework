package JunitPractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Inbox {
	
	
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
	public void Test_Inbox()
	{
		System.out.println("Inbox");
	}
	
	
	
	
}
