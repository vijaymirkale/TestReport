package com.clc.autheticate;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Listeners(value=TestNGReportListener.class)
public class ETest {
	

	
	
	@Test
	public void bEasbcd() {
		System.out.println("asbE");
	}

	@AfterSuite
	public void abcd(){
		System.out.println("inside after suite");
	}
	
	@BeforeClass
	public void abcd2(){
		System.out.println("inside before class");
	}
	
	@AfterGroups
	public void abcd5(){
		System.out.println("inside before class");
	}
	
	

	@AfterTest
	public void abcd6(){
		System.out.println("inside before class");
	}
	
	
	
	@Test
	public void b3Efabcd() {
			System.out.println("fabE");
	}
	
	@Test
	public void b2Easbcd() {
		System.out.println("asbE");
	}

	@Test
	public void b1Efabcd() {
			System.out.println("fabE");
	}

}
