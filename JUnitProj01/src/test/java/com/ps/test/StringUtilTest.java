package com.ps.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ps.service.StringUtil;

public class StringUtilTest {

	private static StringUtil util;

	@BeforeAll
	public static void setUpOnce() {
		System.out.println("StringUtilTest.setUpOnce()");
		util = new StringUtil();
	}

	@BeforeEach
	public void setup() {
		System.out.println("StringUtilTest.setup()");

	}

	@Test
	public void testIsPallendromWithValidData() {
		System.out.println("StringUtilTest.testIsPallendromWithValidData()");
		boolean flag = StringUtil.isPallendrome("madam");
		assertTrue(flag);
	}

	@Test
	public void testIsPallendromWithInvalidData() {
		System.out.println("StringUtilTest.testIsPallendromWithInvalidData()");
		boolean flag = StringUtil.isPallendrome("dama");
		assertFalse(flag);
	}

	@Test
	public void testIsPallendromWithNoData() {
		System.out.println("StringUtilTest.testIsPallendromWithNoData()");
		assertThrows(IllegalArgumentException.class, () -> StringUtil.isPallendrome(""));

	}

	@Test
	public void testCreateDateWithValidDate() {
		System.out.println("StringUtilTest.testCreateDateWithValidDate()");
		LocalDate ld=util.createDate(2000, 10, 20);
		assertNotNull(ld);
		assertEquals(LocalDate.of(2000, 10, 20), ld);
	}
	@Test
	public void testCreateDateWithInvalidDate() {
		System.out.println("StringUtilTest.testCreateDateWithInvalidDate()");
		LocalDate ld=util.createDate(1778, 10, 20);
		assertNull(ld);
	}
	
	@Test
	public void testSingletonClass() {
		System.out.println("StringUtilTest.testSingletonClass()");
		Runtime rt1=Runtime.getRuntime();
		Runtime rt2=Runtime.getRuntime();
		System.out.println(rt1.hashCode()+"   "+rt2.hashCode());
		assertSame(rt1, rt2);
	}
	@Test
	public void testNonSingletonClass() {
		System.out.println("StringUtilTest.testNonSingletonClass()");
		LocalDate d1=LocalDate.now();
		LocalDate d2=LocalDate.of(2000,10,20);
		System.out.println(d1.hashCode()+"    "+d2.hashCode());
		assertNotSame(d1, d2);
	}

	@AfterEach
	public void teardown() {
		System.out.println("StringUtilTest.teardown()");

	}

	@AfterAll
	public static void tearDownOnce() {
		System.out.println("StringUtilTest.tearDownOnce()");
		util = null;
	}
}
