package myProject;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, temp;
	      System.out.println("Enter x:");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      System.out.println("Enter Y value:");
	      y = in.nextInt();
	 
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	 
	      temp = x;
	      x = y;
	      y = temp;
	 
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	}

}
