package com.clc.api;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(value=TestNGReportListener.class)
public class CTest {

	@BeforeSuite
	public void abcd(){
		System.out.println("inside before suite");
	}

	
	@Test(groups={"smoke","sanity","db"})
	public void bcasbcd() {
		System.out.println("casb");
	}

	@Test
	public void bcfabcd() {
			System.out.println("cfab");
	}

	@BeforeGroups
	public void m1(){
		System.out.println("inside before groups");
	}
	
	@BeforeTest
	public void m2(){
		System.out.println("inside before test");
	}
	
	@BeforeMethod
	public void m3(){
		System.out.println("inside before method");
	}	
	
	@BeforeClass
	public void m4(){
		System.out.println("inside before class");
	}	
	
	}


