package myProject;

import java.util.Scanner;

public class PrintReverseOfAGivenNumber {
	
//	public int reverseNumber(int number){
//        
//        int reverse = 0;
//        while(number != 0){
//            reverse = (reverse*10)+(number%10);
//            number = number/10;
//        }
//        return reverse;
//    }
	
//	public static int reverse(int n) {
//	       int result = 0;
//	       int rem;
//	       while (n > 0) {
//	           rem = n % 10;
//	           n = n / 10;
//	           result = result * 10 + rem;
//	       }
//	       return result;
//	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		
		int n, reverse = 0;
		 
	      System.out.println("Enter the number to reverse");
	      Scanner in = new Scanner(System.in);
	      n = in.nextInt();
	 
	      while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	 
	      System.out.println("Reverse of entered number is "+reverse);
	      
//	      PrintReverseOfAGivenNumber objectMemory = new PrintReverseOfAGivenNumber();
//	        System.out.println("Result: "+objectMemory.reverseNumber(17868));
	      
//	       Scanner s = new Scanner(System.in);
//	       System.out.print("Enter the number to be reversed : ");
//	       int input = s.nextInt();
//	       int result = reverse(input);
//	       System.out.println("The reversed number is " + result);
		
	}
//	public static void main(String[] args) 
//    {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter a number: ");
//        int num = scanner.nextInt();
//        
//        System.out.println("Please enter a string: ");
//        String str = scanner.next();
//
//        RevNumString rns = new RevNumString();
//        int revNum = rns.reverse(num);
//        String revStr = rns.reverse(str);
//        
//        System.out.printf("\n The reverse of number %d is %d ", num, revNum);
//        System.out.printf("\n The reverse of string '%s' is '%s' ", str, revStr);
//    }
//    
//    // Method to return the reverse of a number
//    public int reverse(int num) {
//        int revNum = 0;
//        while (num > 0) {
//            int rem = num % 10;
//            revNum = (revNum * 10) + rem;
//            num = num / 10;
//        }
//        return revNum;
//    }
//    
//    // Method to return the reverse of a string
//    public String reverse(String str) {
//        StringBuilder revStr = new StringBuilder();
//        for (int i = str.length()-1; i >= 0; i--) {
//            revStr.append(str.charAt(i));
//        }
//        return revStr.toString();
//    }

}
