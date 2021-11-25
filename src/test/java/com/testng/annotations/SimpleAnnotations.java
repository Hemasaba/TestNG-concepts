package com.testng.annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
@BeforeSuite
private void setUp() {
  System.out.println("setup");
}
@BeforeTest
private void browserLaunch() {
System.out.println("BrowserLaunch");
}
@Test
private void searchLaptop() {
System.out.println("searchlaptop");
}
@Test
private void searchWatch() {
System.out.println("searchWatch");
}
@AfterTest
private void browserClose() {
System.out.println("Browserclose");
}
@AfterSuite
private void deleteCookies() {
System.out.println("Delete cookies");
}
}
