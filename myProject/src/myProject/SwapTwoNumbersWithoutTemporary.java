package myProject;

import java.util.Scanner;

public class SwapTwoNumbersWithoutTemporary {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ajay= 10;
		int x, y;
		 System.out.println("ajay:" + ajay );
	      System.out.println("Enter x and y");
	      Scanner ajay1 = new Scanner(System.in);
	 
	      x = ajay1.nextInt();
	      y = ajay1.nextInt();
	 
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	 
	      x = x + y;
	      y = x - y;
	      x = x - y;
	 
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	}
}
