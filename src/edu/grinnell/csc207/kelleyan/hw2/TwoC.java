package edu.grinnell.csc207.kelleyan.hw2;

public class TwoC {
	/**
	 * This class contains methods for dealing with
	 * rational numbers.
	 * 
	 * As a reminder, a rational number is any number
	 * that is finite, meaning either has terminating 
	 * decimals or a repeating pattern, or no decimals
	 * and is a whole number. They can be represented
	 * as a numerator over a denominator.
	 * 
	 */

	
	/**
	 * rat_sum takes two rational numbers and adds them
	 * together
	 * 
	 * an Observer/Constructor
	 * 
	 * @param x, a rational number
	 * @param y, a rational number
	 * 
	 * @return the sum of x and y
	 */
	public static double rat_sum(double x, double y) {
		return x + y;
	} // rat_sum
	
	/**
	 * rat_mult takes two rational numbers and multiplies 
	 * them together
	 * 
	 * an Observer/Constructor
	 * 
	 * @param x, a rational number
	 * @param y, a rational number
	 * 
	 * @return the product of x and y
	 * 
	 * idea taken from assignment 2, part c by Sam Rebelsky 
	 * for CSC207.
	 */
	public static double rat_mult(double x, double y) {
		return x * y;
	} // rat_mult
	
	/**
	 * rat_div takes two rational numbers and divides the
	 * first by the second
	 * 
	 * an Observer/Constructor
	 * 
	 * @param x, a rational number
	 * @param y, a rational number
	 * 
	 * @return the quotient of x and y
	 */
	public static double rat_div(double x, double y) {
		return x / y;
	} // rat_div
	
	/**
	 * rat_sub takes two rational number and subtracts 
	 * the second from the first
	 * 
	 * an Observer/Constructor
	 * 
	 * @param x, a rational number
	 * @param y, a rational number
	 * 
	 * @return difference between x and y
	 */
	public static double rat_sub(double x, double y) {
		return x - y;
	} // rat_sub
	
	/**
	 * numerator takes a rational number and finds the
	 * numerator of the fraction that created said number
	 * 
	 * an Observer
	 * 
	 * @param x, a rational number
	 * 
	 * @return, the numerator of the parent fraction of x
	 * 
	 * idea taken from assignment 2, part c by Sam Rebelsky 
	 * for CSC207.
	 * 
	 * set to 0 until the correct code is written
	 */
	public static int numerator(double x) {
		return 0;  // STUB
	} // numerator
	
	/**
	 * rat_square takes a rational number and squares it
	 * 
	 * an Observer/Constructor
	 * 
	 * @param x, a rational number
	 * 
	 * @return the square of x
	 */
	public static double rat_square(double x) {
		return x * x;
	} // rat_square
	
	/**
	 * isRat takes a number and determines whether or not
	 * it is rational
	 * 
	 * an Observer
	 * 
	 * @param x, a number
	 * 
	 * @return true if x is rational, false otherwise
	 * 
	 * set to true until the correct code is written
	 */
	public static boolean isRat(double x) {
		return true; // STUB
	} // isRat
	
	/**
	 * round_rat takes a rational number and returns an
	 * integer rounded down
	 * 
	 * a Mutator
	 * 
	 * @param x, a rational number
	 * 
	 * @return an integer rounded down
	 */
	public static int round_rat(double x) {
		return (int) x;
	} // round_rat
	
} // class TwoC






