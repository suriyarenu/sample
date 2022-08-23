package org.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testclass {

	@Test
	public void tc01() { 
		String s = "suriya";
		Assert.assertTrue(true);
		System.out.println(s);

	}

	@BeforeClass

	public static void tc02() {
		String s = "nandha"; 
		Assert.assertTrue(true);
		System.out.println(s);

	}

	@AfterClass
	public static void tc03() {
		String s = "vinoth";
		Assert.assertTrue(true);
		System.out.println(s);

	}

	@Before
	public void tc04() {
		String s = "karthick";
		Assert.assertTrue(true);
		System.out.println(s);

	}

	@After
	public void tc05() { 
		String s = "aravind";
		Assert.assertNotEquals("aravind",s);
		System.out.println(s);

	}

}
