package level2;

import java.util.Scanner;

public class PalindromeOrNot {
	
 void getPolindrome(){
	 System.out.print("Enter Number: ");
     Scanner read = new Scanner(System.in);
     int num = read.nextInt();
     int n = num;
     //reversing number
     int rev=0,rmd; 
     while(num > 0) 
     { 
       rmd = num % 10; 
       rev = rev * 10 + rmd; 
       num = num / 10; 
     } 
     if(rev == n) 
       System.out.println(n+" is a Palindrome Number!"); 
     else 
       System.out.println(n+" is not a Palindrome Number!");
 }
 
 void getPolindromeSecoundMtd(){
	 String original, reverse = "";
     Scanner in = new Scanner(System.in);

     System.out.println("Enter a string to check if it is a palindrome");
     original = in.nextLine();

     int length = original.length();

     for ( int i = length - 1; i >= 0; i-- )
        reverse = reverse + original.charAt(i);

     if (original.equals(reverse))
        System.out.println("Entered string is a palindrome.");
     else
        System.out.println("Entered string is not a palindrome.");

 	}
 
 void getPolindrome3rd(){
	 String inputString;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input a string");
	    inputString = in.nextLine();
	 
	    int length  = inputString.length();
	    int i, begin, end, middle;
	 
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	 
	    for (i = begin; i <= middle; i++) {
	      if (inputString.charAt(begin) == inputString.charAt(end)) {
	        begin++;
	        end--;
	      }
	      else {
	        break;
	      }
	    }
	    if (i == middle + 1) {
	      System.out.println("Palindrome");
	    }
	    else {
	      System.out.println("Not a palindrome");
	    } 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeOrNot getPolidromeObj = new PalindromeOrNot();
		getPolidromeObj.getPolindrome();
		getPolidromeObj.getPolindromeSecoundMtd();
		getPolidromeObj.getPolindrome3rd();
	}

}
