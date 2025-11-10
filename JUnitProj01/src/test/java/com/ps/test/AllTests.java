package com.ps.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;



@Suite
//@SelectClasses({ ArithmeticOperationTest.class, StringUtilTest.class })
@SelectPackages("com.ps.test")
public class AllTests {

}
