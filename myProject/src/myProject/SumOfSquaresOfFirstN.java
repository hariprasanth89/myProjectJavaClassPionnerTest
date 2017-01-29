package myProject;

import java.util.Scanner;

public class SumOfSquaresOfFirstN {
	
	void getSquares(){
		
		Scanner sc = new Scanner(System.in);
		 
	      System.out.print("Enter Integer: ");
	      int n = sc.nextInt();
	      System.out.println("You entered: " + n);
	 
	      int sum = 1;
	 
	      for (int x=2;x<=n;x++) {
	        sum = sum + (x*x);
	      }
	      System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfSquaresOfFirstN values= new SumOfSquaresOfFirstN();
		
		values.getSquares();
	}

}
