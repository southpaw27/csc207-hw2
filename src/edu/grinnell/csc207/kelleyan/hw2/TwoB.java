package edu.grinnell.csc207.kelleyan.hw2;

public class TwoB {

    /**
     * Compute the average of two integers.  Rounds down if the
     * average is not a whole number.
     * 
     * Thank you to Lea for pointing me back to the Eboards page
     * to look at 9/6's examples of testing situations that
     * led me to finding the error: overflow.
     */
    public static int average(int left, int right) {
    	if(left == right)
    		return left;
        return (left + right) / 2;
    } // average(int,int)
} // class TwoB

