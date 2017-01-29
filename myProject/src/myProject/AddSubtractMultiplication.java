package myProject;

import java.util.Scanner;

public class AddSubtractMultiplication {

	void results(){
		@SuppressWarnings("resource")
		//This statement will capture the user input
		Scanner scan = new Scanner(System.in);
		
		int a,b,add,subtract,multiplication;
		
		System.out.print("Please Enter a value: ");
		//Captured input would be stored in number a
		 a = scan.nextInt();
	      
		System.out.print("Please Enter b value: ");
		//Captured input would be stored in number b
		b = scan.nextInt();
		
		
		add=a+b;  // Add
		multiplication=a*b;  // multiplication
		subtract=a/b;  // subtract 
		System.out.println("add"+  add);
		System.out.println("subtract"+  subtract);
		System.out.println("multiple"+  multiplication);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		@SuppressWarnings("resource")
//		//This statement will capture the user input
//		Scanner scan = new Scanner(System.in);
//		
//		int a,b,add,subtract,multiplication;
//		
//		System.out.print("Please Enter a value: ");
//		//Captured input would be stored in number a
//		 a = scan.nextInt();
//	      
//		System.out.print("Please Enter b value: ");
//		//Captured input would be stored in number b
//		b = scan.nextInt();
//		
//		
//		add=a+b;  // Add
//		multiplication=a*b;  // multiplication
//		subtract=a/b;  // subtract 
//		System.out.println("add"+  add);
//		System.out.println("subtract"+  subtract);
//		System.out.println("multiple"+  multiplication);
		AddSubtractMultiplication resultsObj = new AddSubtractMultiplication();
				resultsObj.results();
	}

}
