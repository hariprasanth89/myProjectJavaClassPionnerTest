package myProject;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

	// main method begins execution of this class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z;
		System.out.println("Enter three integers ");
		Scanner in = new Scanner(System.in);

		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();

		if (x > y && x > z)
			System.out.println("First number is largest.");
		
		else if (y > x && y > z)
			System.out.println("Second number is largest.");
		else if (z > x && z > y)
			System.out.println("Third number is largest.");
		else
			System.out.println("Entered numbers are not distinct.");

		// another way
		// int a, b, c, d;
		// Scanner s = new Scanner(System.in);
		// System.out.println("Enter all three numbers:");
		// a = s.nextInt();
		// b = s.nextInt();
		// c = s.nextInt();
		// d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		// System.out.println("Largest Number:"+d);

		// 2nd way

		// int a1, b1, c1, big;
		// Scanner scan = new Scanner(System.in);
		//
		// System.out.print("Enter Three Numbers : ");
		// a1 = scan.nextInt();
		// b1 = scan.nextInt();
		// c1 = scan.nextInt();
		//
		// // let a is the largest
		//
		// big = a1;
		//
		// if(big<b1)
		// {
		// if(b1>c1)
		// {
		// big = b1;
		// }
		// else
		// {
		// big = c1;
		// }
		// }
		// else if(big<c1)
		// {
		// if(c1>b1)
		// {
		// big = c1;
		// }
		// else
		// {
		// big = b1;
		// }
		// }
		// else
		// {
		// big = a1;
		// }
		//
		// System.out.print("Largest Number is " +big);

	} // end method main

} // end class
