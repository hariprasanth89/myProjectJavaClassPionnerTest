package level2;

import java.util.Scanner;

public class FibonacciSeries {
	
	public void WithoutUsingRecursion() {
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}
	
	//public void UsingRecursion() {
		static int n1=0,n2=1,n3=0;    
		 static void printFibonacci(int count){    
		    if(count>0){    
		         n3 = n1 + n2;    
		         n1 = n2;    
		         n2 = n3;    
		         System.out.print(" "+n3);   
		         printFibonacci(count-1);    
		     }    
		// }    
		
	}
		 
		 
		 public void getPrintAnotherMethods() {
			 int terms, last = 1, secondLast = 0, current, i;
			 
		        Scanner in = new Scanner(System.in);
		        System.out.println("Enter number of terms in Fibonacci Series");
		        terms = in.nextInt();
		 
		        /*
		         *  Nth term = (N-1)th thrm + (N-2)th term;
		         */
		        for(i = 0; i < terms; i++){
		            if(i < 2){
		                current = i;
		            } else {
		                current = last + secondLast;
		                secondLast = last;
		                last = current;
		            }
		            System.out.print(current + " ");
		        }			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		int count=10;    
//		  System.out.print(n1+" "+n2);//printing 0 and 1    
//		  printFibonacci(count-2);//n-2 because 2 numbers are already printed  
		  
		  
		  FibonacciSeries getFibonacciSerObj = new FibonacciSeries();
		 // getFibonacciSerObj.WithoutUsingRecursion();
		  getFibonacciSerObj.getPrintAnotherMethods();
	}

}
