package edu.grinnell.csc207.kelleyan.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {

	@Test
	public void test_isMultiple() {
		assertEquals("identity case", true, TwoA.isMultiple(7, 1));
		assertEquals("even mult", true, TwoA.isMultiple(24, 2));
		assertEquals("not even mult", false, TwoA.isMultiple(23, 2));
		assertEquals("odd mult", true, TwoA.isMultiple(21, 7));
		assertEquals("not odd mult", false, TwoA.isMultiple(22, 3));
	}
	
	@Test
	public void test_isOdd() {
		assertEquals("simple odd 3", true, TwoA.isOdd(3));
		assertEquals("larger number odd 543689", true, TwoA.isOdd(543689));
		assertEquals("negative number -12345", true, TwoA.isOdd(-12345));
		assertEquals("even number 74356", false, TwoA.isOdd(74356));
	}
	
	@Test
	public void test_oddSumTo() {
		assertEquals("n = 0 = 0", 0, TwoA.oddSumTo(0));
		assertEquals("n = 1 = 0", 0, TwoA.oddSumTo(1));
		assertEquals("n = 2 = 1", 1, TwoA.oddSumTo(2));
		assertEquals("n = 4 = 4", 4, TwoA.oddSumTo(4));
		assertEquals("n = 10 = 25", 25, TwoA.oddSumTo(10));
		// -1 is the error return for a negative number
		assertEquals("n = -5 = -1", -1, TwoA.oddSumTo(-5));
	}
	
	@Test
	public void test_isOddProd() {
		int[] test1 = {1, 2, 3, 4};
		assertEquals("{1,2,3,4} = true", true, TwoA.isOddProd(test1));
		int[] test2 = {2, 3, 4, 5};
		assertEquals("{2,3,4,5} = true", true, TwoA.isOddProd(test2));
		int[] test3 = {2, 4, 6, 8, 10};
		assertEquals("{2,4,6,8,10} = false", false, TwoA.isOddProd(test3));
		int[] test4 = {-1, -3, -4};
		assertEquals("{-1,-3,-4} = true", true, TwoA.isOddProd(test4));
		int [] test5 = {2, 4, 6, 7, 9};
		assertEquals("{2,4,6,7,9} = true", true, TwoA.isOddProd(test5));
	}
	
	@Test
	public void test_allDistinct() {
		int[] test1 = {1};
		assertEquals("{1} = true", true, TwoA.allDistinct(test1));
		int[] test2 = {2, 2};
		assertEquals("{2,2} = false", false, TwoA.allDistinct(test2));
		int[] test3 = {1, 2, 3, 4, 5};
		assertEquals("{1,2,3,4,5} = true", true, TwoA.allDistinct(test3));
		int[] test4 = {2, 4, 6, 8, 10, 8};
		assertEquals("{2,4,6,8,10,8} = false", false, TwoA.allDistinct(test4));
		int[] test5 = {1, 2, 3, 4, 5, 6, 6};
		assertEquals("{1,2,3,4,5,6,6} = false", false, TwoA.allDistinct(test5));
	}
	
	@Test
	public void test_reverseInts() {
		int[] test1 = {1};
		assertArrayEquals("{1} = {1}", test1, TwoA.reverseInts(test1));
		int[] test2 = {1, 2};
		int[] test2b = {2, 1};
		assertArrayEquals("{1,2} = {2,1}", test2b, TwoA.reverseInts(test2));
		int[] test3 = {1, 2, 3, 4, 5, 6};
		int[] test3b = {6, 5, 4, 3, 2, 1};
		assertArrayEquals("{1,2,3,4,5,6} = {6,5,4,3,2,1}", test3b, TwoA.reverseInts(test3));
	}
}







