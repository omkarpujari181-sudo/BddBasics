package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class HooksTests 
{
	@Before (order=1)
	public void beforeHook1 ()
	{
		System.out.println("this is before hook 1");
	}
	
	@Before (order=2)
	public void beforeHook2 ()
	{
		System.out.println("this is before hook 2");
	}
	
	@After (order = 2)
	public void afterHook1 ()
	{
		System.out.println("this is after hook 1");
	}
	
	@After (order = 1)
	public void afterHook2 ()
	{
		System.out.println("this is after hook 2");
	}

	@AfterStep
	public void beforeStep ()
	{
		
	}
}
