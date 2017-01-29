package myProject;

import java.util.Scanner;

public class FactorialOfAGivenNumber {
	
	
	
	void getResult1(){
		
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the number:");
	      //Stored the entered value in variable
	      int num = scanner.nextInt();
	      //Called the user defined function fact
	      int factorial = fact(num);
	      System.out.println("Factorial of entered number is: "+factorial);
	   }
	   static int fact(int n)
	   {
	       int output;
	       if(n==1){
	         return 1;
	       }
	       //Recursion: Function calling itself!!
	       output = fact(n-1)* n;
	       return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactorialOfAGivenNumber getResultObj = new FactorialOfAGivenNumber();
		
		getResultObj.getResult1();
		
		
		

	}

}
