package edu.grinnell.csc207.kelleyan.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoB {

	@Test
	public void test_average() {
		assertEquals("2 and 4 = 3", 3, TwoB.average(2, 4));
		assertEquals("1 and 5 = 3", 3, TwoB.average(1, 5));
		assertEquals("3 and 4 = 3", 3, TwoB.average(3, 4));
		assertEquals("1 and 26 = 13", 13, TwoB.average(1,26));
		assertEquals("Extreme, overflow case max", Integer.MAX_VALUE, TwoB.average(Integer.MAX_VALUE, Integer.MAX_VALUE));
		assertEquals("Extreme, overflow case min", Integer.MIN_VALUE, TwoB.average(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}
}
