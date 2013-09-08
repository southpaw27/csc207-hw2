package edu.grinnell.csc207.kelleyan.hw2;

public class TwoA {
	
	/**
	 * isMultiple takes two parameters, a and b, and
	 *  returns whether or not a is a multiple of b
	 *  
	 * @param a
	 * @param b
	 * 
	 * @return true if a is multiple of b, false otherwise
	 */
	public static boolean isMultiple(int a, int b) {
		if(a % b == 0)
			return true;
		else
			return false;
	}

	/**
	 * isOdd takes one parameter and returns true if it is
	 * odd and false if not
	 * 
	 * works with both positive and negative numbers
	 * 
	 * @param x
	 * 
	 * @return true if x is odd, false if x is even
	 * 
	 */
	public static boolean isOdd(int x) {
		String number = Integer.toString(x);
		String lastnum = number.substring(number.length() - 1);
		String[] vals = {"1", "3", "5", "7", "9"};
		for(int i = 0; i < 5; i++) {
			if (lastnum.equals(vals[i])) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * oddSumTo takes a variable and returns the sum of
	 * all positive odd numbers less than n
	 * 
	 * @param n
	 * 
	 * @return sum of all positive odd numbers less than n
	 */
	public static int oddSumTo(int n) {
		if (n < 0)
			return -1;
		else if (n == 0 || n == 1)
			return 0;
		else {
			int sum = 0;
			for (int x = 1; x < n; x += 2) {
				sum += x;
			}
			return sum;
		}
	}
	
	/**
	 * isOddProd takes an array of integer values and returns
	 * true if any pair of the numbers in the array has a 
	 * product that is odd, otherwise false
	 * 
	 * @param ints[], an array of ints
	 * 
	 * @return true if there exists a pair of numbers from ints[]
	 * whose products are odd, false otherwise
	 */
	public static boolean isOddProd(int[] ints) {
		if(ints.length <= 1)
			return false;
		else {
			int prod;
			for(int x = 0; x <= (ints.length - 2); x++) {
				for (int y = x + 1; y <= (ints.length - 1); y++) {
					prod = ints[x] * ints[y];
					if (isOdd(prod))
						return true;
				}
			}
			return false;
		}
	}
	
	/**
	 * allDistinct takes an array and returns true if no two 
	 * elements are the same, false otherwise
	 * 
	 * @param ints, an array of integers
	 * 
	 * @return true if each element does not equal another, 
	 * false otherwise
	 */
	public static boolean allDistinct(int[] ints) {
		if (ints.length < 2)
			return true;
		else {
			for(int x = 0; x <= (ints.length - 2); x++) {
				for (int y = x + 1; y <= (ints.length - 1); y++) {
					if (ints[x] == ints[y])
						return false;
				}
			}
			return true;
		}
	}
	
	/**
	 * reverseInts takes an array and returns the same array in
	 * reverse order
	 * 
	 * @param ints, an array of ints
	 * 
	 * @return ints in reverse order
	 */
	public static int[] reverseInts(int[] ints) {
		if(ints.length <= 1)
			return ints;
		else {
			for (int x = 0; x < (ints.length / 2); x ++) {
				int temp = ints[ints.length - x - 1];
				ints[ints.length - x - 1] = ints[x];
				ints[x] = temp;
			}
			return ints;
		}
	}
}





