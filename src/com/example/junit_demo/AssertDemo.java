package com.example.junit_demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo {
	
	@Test//this annotation is not apply to class because its unit testing ,is use for only units (method)
	public void simple1()
	{
		int result=1;
		int expected=1;
		assertEquals(result, expected);
	}
	
	@Test
	public void simple2()
	{
		int result=1;
		int expected=2;
		assertEquals(result, expected);
	}
	
	@Disabled // it's used to not apply test on that method
	@Test
	public void simple3()
	{
		int result=1;
		int expected=3;
		assertEquals(result, expected);
	}

}
