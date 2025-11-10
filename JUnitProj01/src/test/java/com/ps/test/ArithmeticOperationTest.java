package com.ps.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.MethodName;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.ps.service.ArithmeticOperation;

@DisplayName("ArithmeticOperationTest")
//@TestMethodOrder(OrderAnnotation.class)
//@TestMethodOrder(MethodName.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.DisplayName.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.MethodName.class)
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.Random.class)
public class ArithmeticOperationTest {

	private static ArithmeticOperation ops;

	@BeforeAll
	public static void setUpOnce() {
		System.out.println("ArithmeticOperationTest.setUpOnce()");
		ops = new ArithmeticOperation();
	}

	@BeforeEach
	public void setUp() {
		System.out.println("ArithmeticOperationTest.setUp()");
	}

	@Test
	@DisplayName("test1Sum With +ves")
//	@Tag("dev")
//	@Tag("test")
	@Order(10)
	public void testSumWithPositives() {
		System.out.println("ArithmeticOperationTest.testSumWithPositive()");
		double a = 100.0;
		double b = 200.0;
		double expected = 300.0;
		double actual = ops.sum(a, b);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("test2Sum With -ves")
//	@Tag("dev")
//	@Tag("test")
	@Order(1)
	public void testSumWithNegative() {
		System.out.println("ArithmeticOperationTest.testSumWithNegative()");
		double a = -100.0;
		double b = -200.0;
		double expected = -300.0;
		double actual = ops.sum(a, b);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("test3Sum With mixed value")
//	@Tag("dev")
//	@Tag("test")
	@Order(15)
	public void testSumWithMixed() {
		System.out.println("ArithmeticOperationTest.testSumWithMixed()");
		double a = -100.0;
		double b = 200.0;
		double expected = 100.0;
		double actual = ops.sum(a, b);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("test4Sum With zeros")
//	@Tag("dev")
//	@Tag("test")
	@Order(-13)
	public void testSumWithZero() {
		System.out.println("ArithmeticOperationTest.testSumWithZero()");
		double a = 0.0;
		double b = 0.0;
		double expected = 0.0;
		double actual = ops.sum(a, b);
		assertEquals(expected, actual);
	}

	@Test
//	@Disabled
	@DisplayName("test5Sum With high values")
//	@Tag("prod")
	@Order(100)
	public void testSumWithHighValues() {
		System.out.println("ArithmeticOperationTest.testSumWithHighValues()");
		double a = 11111111111111.0;
		double b = 22222222222222.0;
		double expected = 33333333333333.0;
		double actual = ops.sum(a, b);
		assertEquals(expected, actual, 0.5, "Testing with High Values");
	}

	@Test
	@DisplayName("test6Sum With timeout")
//	@Tag("dev")
//	@Tag("test")
	@Order(0)
	public void testSumForTimeout() {
		System.out.println("ArithmeticOperationTest.testSumForTimeout()");
		assertTimeout(Duration.ofMillis(3000), () -> ops.sum(100.0, 200.0));
	}

	@AfterEach
	public void tearDown() {
		System.out.println("ArithmeticOperationTest.tearDown()");
	}

	@AfterAll
	public static void tearDownOnce() {
		System.out.println("ArithmeticOperationTest.tearDownOnce()");
		ops = null;
	}
}
