package com.clc.autheticate;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

//@Listeners(value=TestNGReportListener.class)
public class DTest {

	@AfterSuite
	public void laogobasbcd() {
		System.out.println("Aftero Suite Method...!");
	}
	
	@Test(groups={"sanity","db"})
	public void bxasbcd() {
		System.out.println("asbD");
	}

	@Test
	public void byfabcd() {
			System.out.println("fabD");
	}
}
