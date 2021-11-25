package com.testng.annotations;

import org.testng.annotations.Test;

public class PriorityTest {
@Test(priority = 2)
	private void searchWatch() {
    System.out.println("search watch");
}
@Test(priority =5)
private void searchLaptop() {
 System.out.println("search laptop");
}
@Test(priority = 3)
private void searchMobile() {
System.out.println("searchtv");
}
@Test(priority = 4)
private void searchAirpods() {
System.out.println("searchairpods");
}
@Test
private void searchTable() {
System.out.println("search table");
}
}
