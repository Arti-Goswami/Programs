package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite
	public void setUp() {
		System.out.println("Setup sytem property for chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Before Login Method");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Verify google title");
	}
}
