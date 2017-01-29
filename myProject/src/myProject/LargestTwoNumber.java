package myProject;

import java.util.Scanner;

public class LargestTwoNumber {
	
	int num1,num2;
	public int largestNUmber(int a, int b) {
		
		num1 = a;
		num2 = b;
		
		if(a>b)
			 return num1;
		else
			 return num2;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		System.out.println("Enter the values of a");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("enter the values of b");
		int b = scan.nextInt();
		LargestTwoNumber objLarger = new LargestTwoNumber();	
		int result = objLarger.largestNUmber(a, b);
		System.out.println("Result: Bigest Values is "+result);
		
/*		int a, b, big;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        a = scan.nextInt();
        b = scan.nextInt();
		
        if(a>b)
        {
            big = a;
        }
        else
        {
            big = b;
        }
		
        System.out.print("Largest of Two Number is " +big);*/
	}

}
