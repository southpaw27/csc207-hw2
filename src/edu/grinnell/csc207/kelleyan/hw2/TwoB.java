package edu.grinnell.csc207.kelleyan.hw2;

public class TwoB {

    /**
     * Compute the average of two integers.  Rounds down if the
     * average is not a whole number.
     * 
     * Thank you to Lea for pointing me back to the Eboards page
     * to look at 9/6's examples of testing situations that
     * led me to finding the error: overflow.
     * 
     * Note: thanks to a conversation I had with Mira Hall in the
     * turkey and mash potato line this evening, I noticed an
     * error in my previous correction of the code. I forgot to
     * take into account the fact that adding (int.max - 1) and 
     * int.max is still an overflow and therefore the 2 must be
     * distributed over the ints. Before I just had if the two
     * numbers were the same, return that number. This only works
     * when the same number added together overflows the buffer.
     * Now it's fixed.
     */
    public static int average(int left, int right) {
    	/*
    	 * Slightly odd type casting allows for the division
    	 * to be doubles and the final sum to be turned back
    	 * into an int, what the average is supposed to return
    	 */
        return (int) ((double) left/2 + (double) right/2);
    } // average(int,int)
} // class TwoB

