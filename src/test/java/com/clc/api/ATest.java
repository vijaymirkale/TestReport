package com.clc.api;

import org.testng.annotations.Test;

//group suite class test method  -- before after..

//@Listeners(value=TestNGReportListener.class)
public class ATest {
	
	@Test
	public void axbcd() {
		System.out.println("Which Env" +System.getProperty("param"));
		System.out.println("ax");
	}

	@Test
	public void aabcd() {
		System.out.println("aa");
	}
	@Test(groups={"smoke","regression"})
	public void asbcd() {
		System.out.println("as");
	}
	@Test
	public void fabcd() {
			System.out.println("fa");
	}
	@Test
	public void pabcd() {
		System.out.println("pa");
	}
}
