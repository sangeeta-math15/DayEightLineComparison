package com.linecompare;

/**
 * Line Comparison Computation Program
 * 
 * @author CHANDRU
 *
 */
public class LineComparison {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

		// declare variables and assign values to coordinates
		int x1 = 4;
		int y1 = 4;
		int x2 = 1;
		int y2 = 1;
		int x3 = 5;
		int y3 = 3;
		int x4 = 2;
		int y4 = 2;

		// Calculate the distance between x and y coordinates
		int distance = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		// Display the result
		System.out.println("distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")==>" + distance);

		// Calculate the distance between x and y coordinates
		int distance1 = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		// Display the result
		System.out.println("distance between" + "(" + x3 + "," + y3 + ")," + "(" + x4 + "," + y4 + ")==>" + distance1);

		// Convert primitive Data type into objects
		Integer integer = Integer.valueOf(distance);
		Integer integer1 = Integer.valueOf(distance1);

		/**
		 * equal method compares the two given number. If any number is not matched, it
		 * returns false. If all number are matched, it returns true.
		 */
		System.out.println(integer.equals(integer1));

		// compareTo() method compares two Integer objects numerically.
		int result = integer.compareTo(integer1);
		System.out.println(result);

		if (result > 0)
			// value greater than 0 if Integer is numerically greater than the argument
			// Integer.
			System.out.println("distance of first line greater than distance1 of sec line");
		else if (result < 0)
			// a value less than 0 if Integer is numerically less than the argument
			// Integer
			System.out.println("distance of first line less than distance1 of sec line");
		else
			// method returns the value 0 if Integer is equal to the argument Integer
			System.out.println("first line distance is equals to sec line distance1");

	}

}
