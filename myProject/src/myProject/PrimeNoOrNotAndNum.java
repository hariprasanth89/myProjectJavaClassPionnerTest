package myProject;

import java.util.Scanner;

public class PrimeNoOrNotAndNum {
	void checkPrime(){
		int num, i, count=0;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
	}
	
	void methods2() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      int i =0;
	      int num =0;
	      //Empty String
	      String  primeNumbers = "";
	      System.out.println("Enter the value of n:");
	      int n = scanner.nextInt();
	      for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num, i, count=0;
//        Scanner scan = new Scanner(System.in);
//		
//        System.out.print("Enter a Number : ");
//        num = scan.nextInt();
//		
//        for(i=2; i<num; i++)
//        {
//            if(num%i == 0)
//            {
//                count++;
//                break;
//            }
//        }
//        if(count == 0)
//        {
//            System.out.print("This is a Prime Number");
//        }
//        else
//        {
//            System.out.print("This is not a Prime Number");
//        }
        PrimeNoOrNotAndNum obj1 = new PrimeNoOrNotAndNum();
        //obj1.checkPrime();
        obj1.methods2();
 	}

}
