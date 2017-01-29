package level2;

import java.util.Scanner;

public class GcdOfTwoNumbers {
	
		public void getGcdMethods(){
			Scanner scan = new Scanner(System.in);
            System.out.print("Enter the First no : ");
            int n1=scan.nextInt();
            System.out.print("Enter the Second no : ");
            int n2=scan.nextInt();
            int r;
             
            while(n2 != 0)
            {
                r = n1 % n2;
                n1 = n2;
                n2 = r;
            }
            System.out.print("GCD = "+n1);
		}
		
		public void getGcdSeoundMethods(){
			
			Scanner scan = new Scanner(System.in);
            System.out.print("Enter the First no : ");
            int n1=scan.nextInt();
            System.out.print("Enter the Second no : ");
            int n2=scan.nextInt();
             
            while(n1 != n2)
            {
                if(n1 > n2)
                    n1 = n1-n2;
                else
                    n2 = n2-n1;
            }
            System.out.print("GCD = "+n1);
		}
		
		public void getQuotientRemainder(){
			
			int remainder,quotient,a,b,values,total,dividend,divisor;
			
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter dividend: ");
			dividend = scan.nextInt();
			System.out.println("Enter divisor: ");
			divisor = scan.nextInt();
			
			remainder = dividend/divisor;
			quotient = dividend%divisor;
			//while(remainder != 0 || quotient != 0){
			
			if(remainder != 0){
				//remainder+=1;
				System.out.println("Remainder : "+ remainder);
			}
			if (quotient != 0) {
				System.out.println("Quotient : "+ quotient);
			}
		//}
			
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			GcdOfTwoNumbers getResultsObj = new GcdOfTwoNumbers();
			//getResultsObj.getGcdMethods();
			//getResultsObj.getGcdSeoundMethods();
			getResultsObj.getQuotientRemainder();
			
	}

}
