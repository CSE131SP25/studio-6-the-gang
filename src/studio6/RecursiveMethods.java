package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n==1) { 
			return .5;
		} else if (n==0) {
			return 0;
		}
		else {
			return Math.pow(0.5,n) + geometricSum(n-1);
			
		}
			// FIXME compute the geometric sum for the first n terms recursively
		
	}

	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		if (radius <= radiusMinimumDrawingThreshold) {
			
		} else {
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter + radius, yCenter, radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter - radius, yCenter, radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter + radius, radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter - radius, radius/3.0, radiusMinimumDrawingThreshold);
		}
		// FIXME complete the recursive drawing
	}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
		 public static int[] toReversed(int[] array) {
		        int[] reversed = new int[array.length]; // Create a new array to store the reversed values
		        toReversedHelper(array, reversed, 0, array.length - 1); // Call helper method
		        return reversed;
		    }

		    /**
		     * Helper method to recursively reverse the array
		     * 
		     * @param original the original array
		     * @param reversed the array that stores reversed values
		     * @param left the index moving from start
		     * @param right the index moving from end
		     */
		    private static void toReversedHelper(int[] original, int[] reversed, int left, int right) {
		        if (left >= original.length) return; // Base case: Stop when index exceeds array length
		        reversed[right] = original[left]; // Swap elements
		        toReversedHelper(original, reversed, left + 1, right - 1); // Recursive call
	}

	/**
    * This method uses recursion to compute the greatest common divisor
     * for the two input values
     * 
     * @param p first operand
     * @param q second operand
     * @return greatest common divisor of p and q
     */
    public static int gcd(int p, int q) {
        if (q == 0) return p; // Base case: If q is 0, return p
        return gcd(q, p % q); // Recursive step: Call gcd with (q, p % q)
    }

}
