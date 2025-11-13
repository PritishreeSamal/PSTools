package com.ps.service;

import java.sql.Date;
import java.time.LocalDate;

public class StringUtil {
	public static boolean isPallendrome(String str) {
		if (str == null || str.equalsIgnoreCase("") || str.length() == 0)
			throw new IllegalArgumentException("Invalid Inputss");
		String rev = new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}

	public LocalDate createDate(int year, int month, int day) {
		if (year < 1900 || month <= 0 || day <= 0)
			return null;
		else
			return LocalDate.of(year, month, day);
	}
	public int showLength(String str) {
		return str.length();
	}
	
}
