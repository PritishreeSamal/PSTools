package com.ps.service;

public class ArithmeticOperation {

	public double sum(double a, double b) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a + b;
	}
}
