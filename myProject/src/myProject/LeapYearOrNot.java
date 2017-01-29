package myProject;

import java.util.Scanner;

public class LeapYearOrNot {
	
	int year;
	Scanner scan;
	
	//char check(int x, int y) {
	int check(int x, int y) {
		
		System.out.println("Check leap year or not");
 
		System.out.println("\nEnter the year : ");
		scan = new Scanner(System.in);
		
		year = Integer.parseInt(scan.nextLine());
		
		if(year%400 == 0 || year%4 == 0) 
			System.out.println(year + " is a leap year");
		else 
			System.out.println(year + " is not a leap year");
		
		//return 'A';
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeapYearOrNot obj = new LeapYearOrNot();
		
		//int result =0;
		//char x = obj.check(10,20);
		int result =obj.check(10,20);
		System.out.println(result);
		
	}

}
