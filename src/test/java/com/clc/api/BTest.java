package com.clc.api;

import org.testng.annotations.Test;
//@Listeners(value=TestNGReportListener.class)


public class BTest {
	

	@Test
	public void baxbcd() {
		System.out.println("axb");
	}

	@Test
	public void baabcd() {
		System.out.println("aab");
	}

	@Test
	public void basbcd() {
		System.out.println("asb");
	}

	@Test(groups={"smoke","regression","integration","sanity","db"})
	public void bfabcd() {
			System.out.println("fab");
	}

	@Test(groups={"smoke","db"})
	public void bpabcd() {
		System.out.println("pab");
	}


}
