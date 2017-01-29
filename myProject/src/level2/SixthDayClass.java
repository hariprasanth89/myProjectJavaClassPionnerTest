package level2;

import java.util.Scanner;

public class SixthDayClass {

	void addingNumbers() {
		System.out.println("Enter the the values");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		int c = a * a;

		System.out.println("c" + c);
		
		
		if(c%a == 2){
			System.out.println("isPrimeNumber"+c);
		}
		else {
				System.out.println("isNotPrimeNUmber"+c);
			}
		
	}
  public SixthDayClass(int a, int b){
	  			
	  
	  
   	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SixthDayClass objSq = new SixthDayClass();
//		objSq.addingNumbers();
		SixthDayClass objAdd = new SixthDayClass(10,10);
		System.out.println();
	}

}
