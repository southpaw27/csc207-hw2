package edu.grinnell.csc207.kelleyan.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoD_TestTwoC {
/*
 * For all of the tests, the first number is considered
 * true and is the number being compared to.
 */
	@Test
	public void test_ratSum() {
		assertEquals(3.68, TwoC.rat_sum(1.23,2.45), 0.5);
		assertEquals(4.99, TwoC.rat_sum(2.99, 2.00), 0.5);
	} // test_ratSum
	
	@Test
	public void test_ratMult() {
		assertEquals(15.40608, TwoC.rat_mult(3.009, 5.12), 0.00005);
		assertEquals(97.2076, TwoC.rat_mult(10.43, 9.32), .0005);
	} // test_ratMult
	
	@Test
	public void test_ratDiv() {
		assertEquals(10.43, TwoC.rat_div(97.2076, 9.32), .05);
		assertEquals(5.12, TwoC.rat_div(15.40608, 3.009), .05);
	} // test_ratDiv
	
	@Test
	public void test_ratSub() {
		assertEquals(3.35, TwoC.rat_sub(13.45, 10.10), .05);
		assertEquals(21.75346, TwoC.rat_sub(45.432, 23.67854), .00005);
	} // test_ratSub
	
	@Test
	public void test_numerator() {
		assertEquals(0, TwoC.numerator(3.333333));
	} // test_numerator
	
	@Test
	public void test_ratSquare() {
		assertEquals(2.25, TwoC.rat_square(1.5), .05);
		assertEquals(1170.666225, TwoC.rat_square(34.215), .000005);
	} // test_ratSquare
	
	@Test
	public void test_isRat() {
		assertEquals(true, TwoC.isRat(3.12));
	} // test_isRat
	
	@Test
	public void test_roundRat() {
		assertEquals(1, TwoC.round_rat(1.12));
		assertEquals(3, TwoC.round_rat(3.99));
	} // test_roundRat
}
