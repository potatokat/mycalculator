package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	@Test
	public void testNfactorialof0() { // getting factorial of 0
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(0); // generate actual result
		assertEquals("0!=1", 1, actual, 0.0);
	}
	
	@Test
	public void testNfactorialof1() { // getting factorial of 1
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(1); // generate actual result
		assertEquals("1!=1", 1, actual, 0.0);
	}
	
	@Test
	public void testNfactorialof5() { // getting factorial of 5
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(5); // generate actual result
		assertEquals("5!=24", 24, actual, 0.0);
	}
	
	@Test
	public void testNfactorialofNeg7() { // getting factorial of -7
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(-7); // generate actual result
		assertEquals("-7!=-1", -1, actual, 0.0);
	}
	
	@Test
	public void testNfactorialof100000() { // getting factorial of 100000
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(100000); // generate actual result
		assertEquals("100000!=-1", -1, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch6() { //search 6 in an array without 6
		MyCalculator mc = new MyCalculator();
		int[] a = {1, 2, 3, 4, 5};
		float actual = mc.binarySearch(a, 6); // generate actual result
		assertEquals("search6=1", 1, actual, 0.0);
	}
	
	@Test
	public void testBinarySearchEmpty() { //search in an empty array
		MyCalculator mc = new MyCalculator();
		int[] a = {};
		float actual = mc.binarySearch(a, 1); // generate actual result
		assertEquals("search1=-1", -1, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch11() { // search 11 in array that contains 11
		MyCalculator mc = new MyCalculator();
		int[] a = {9, 10, 11, 12, 13};
		float actual = mc.binarySearch(a, 11); // generate actual result
		assertEquals("search11=2", 2, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch2() { // search a number in an array that contains same number
		MyCalculator mc = new MyCalculator();
		int[] a = {2, 2, 2, 2, 2, 2};
		float actual = mc.binarySearch(a, 2); // generate actual result
		assertEquals("search2=2", 2, actual, 0.0);
	}
	
}
