package com.practicepararmeter;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups = "regression")
	public void m11() {
		System.out.println("m11");
	}

	@Test(groups = "smoke")
	public void m12() {
		System.out.println("m12");
	}

	@Test(groups = "regression")
	public void m13() {
		System.out.println("m13");
	}

	@Test(groups = "sanity")
	public void m14() {
		System.out.println("m14");
	}

	@Test(groups = "smoke")
	public void m15() {
		System.out.println("m15");
	}
	@Test()
	public void s16() {
		System.out.println("s16");
	}
}
