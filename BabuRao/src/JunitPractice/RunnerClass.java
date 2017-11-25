package JunitPractice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({Inbox.class,Sent.class,Trash.class})
public class RunnerClass {

	@BeforeClass
	public static void App_Launch()
	{
		System.out.println("App_Launch");
	}
	
	@AfterClass
	public static void App_exit()
	{
		System.out.println("App_Exit");
	}
}
