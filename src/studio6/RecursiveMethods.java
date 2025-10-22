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
			if(n==0){
				return 0;
			}
			else{
				return Math.pow(0.5, n)+geometricSum(n-1);
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
		double bound = 5.0;
		StdDraw.setXscale(-bound, bound);
		StdDraw.setYscale(-bound, bound);
		// FIXME complete the recursive drawing
		if(radius<radiusMinimumDrawingThreshold){
			return;
		}
		else{
			StdDraw.circle(xCenter, yCenter, radius);
			radius = radius/3.0;
			circlesUponCircles(xCenter+radius*3.0, yCenter, radius, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter-radius*3.0, yCenter, radius, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter+radius*3.0, radius, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter-radius*3.0, radius, radiusMinimumDrawingThreshold);
		}
	}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversedHelper(int[] array, int[] reversedArray, int index, int mirroredIndex) {
		if(index>mirroredIndex){
			return reversedArray;
		}
		else{
			reversedArray[index]=array[mirroredIndex];
			reversedArray[mirroredIndex]=array[index];
			return toReversedHelper(array, reversedArray, index+1, mirroredIndex-1);
		}
	}
	public static int[] toReversed(int[] array) {
		int index = 0;	
		int mirroredIndex = array.length-1;
		int[] reversedArray = new int[array.length];
		return toReversedHelper(array, reversedArray, index, mirroredIndex);
		
	
			// FIXME create a helper method that can recursively reverse the given array
			//return new int[0];
		
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
		if(p%q == 0)
		{
			return q;
		}

		else{
			
			return gcd(q,p%q);
		}
		// FIXME compute the gcd of p and q using recursion
		
	}


}