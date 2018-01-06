package test.algos.binarysearch;

import java.util.Scanner;

public class NormalVsBinarySqrt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long x = scanner.nextInt();

		long startTime = System.nanoTime();

		long sqrt = 0;

		if (x == 0 || x == 1)
			sqrt = x;
		else {
			for (int i = 1; i < (x / 2); i++) {
				if (i * i == x) {
					sqrt = i;
					break;
				} else if (i * i > x) {
					System.out.println("sqrt among " + (i - 1) + " & " + i);
					sqrt = (i - 1);
					break;
				}
			}
		}

		System.out.println(sqrt);

		System.out.println("Time Consumed = ("
				+ (System.nanoTime() - startTime) + ") Nano Seconds");
		
		System.out.println("####################################################################");

		// Using Binary Search
		
		startTime = System.nanoTime();

		long start = 1;
		long end = x;
		long binSqrt = 0;

		if (x == 0 || x == 1)
			binSqrt = x;
		else {

			while (start <= end) {

				long mid = (start + end) / 2;

				if (mid * mid == x) {
					binSqrt = mid;
					break;
				}

				if (mid * mid > x) {
					end = mid - 1;
				} else {
					binSqrt = mid;
					start = mid + 1;
				}

			}
		}

		System.out.println("Binary Search sqrt: "+binSqrt);
		System.out.println("Binary search time Consumed = ("
				+ (System.nanoTime()- startTime) + ") Nano Seconds");

	}

}
