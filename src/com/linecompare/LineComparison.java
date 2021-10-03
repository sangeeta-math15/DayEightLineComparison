package com.linecompare;

/**
 * Line Comparison Computation Program
 * 
 * @author CHANDRU
 *
 */
class LineEqual {
	int x1, x2, x3, x4;
	int y1, y2, y3, y4;

	void insert(int a, int b, int c, int d, int e, int f, int g, int h) {
		x1 = a;
		x2 = b;
		x3 = c;
		x4 = d;
		y1 = e;
		y2 = f;
		y3 = g;
		y4 = h;

	}

	int checkDistanceOne() {
		// Calculate the distance between x and y coordinates
		int distance = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		// Display the result
		System.out.println("distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")==>" + distance);
		return distance;

	}

	int checkDistanceTwo() {
		// Calculate the distance between x and y coordinates
		int distance1 = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		// Display the result
		System.out.println("distance between" + "(" + x3 + "," + y3 + ")," + "(" + x4 + "," + y4 + ")==>" + distance1);
		return distance1;

	}
}

public class LineComparison {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

		LineEqual eq = new LineEqual();
		eq.insert(4, 4, 1, 1, 5, 3, 2, 2);

		Integer integer = eq.checkDistanceOne();
		Integer integer1 = eq.checkDistanceTwo();

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
