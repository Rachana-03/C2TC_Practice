package com.example.junit_demo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.function.Executable;

public class DynamicTestDemo {
	
	Collection <DynamicTest> dynamicTests(){
		return Arrays.asList(
			dynamicTest("simple dynamic Test" , () ->assertTrue(true)),
			
			dynamicTest("My Executable class" , new MyExecutable()),
			
			dynamicTest("exception executable" , () -> {throw new Exception("exception executable");}),
			
			dynamicTest("simple dynamic Test -2" , () -> assertTrue(true))
		);
	}

}

class MyExecutable implements Executable{

	@Override
	public void execute() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Hellooooo");
	}
	
}