package myProject;

import java.util.Scanner;

public class exampleRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int number=0;
		      int reversenum =0;
		      System.out.println("Input your number and press enter: ");
		      //This statement will capture the user input
		      @SuppressWarnings("resource")
			   Scanner in = new Scanner(System.in);
		      //Captured input would be stored in number num
		      number = in.nextInt();
		      
		      // while loop statement
		      
		      while (number!=0) {
		    	  reversenum = reversenum * 10;
		    	  System.out.println(" \n TEsting line by line execute reversenum ::"+reversenum);
		          reversenum = reversenum + number%10;
		          System.out.println(" \n Secound line by line execute reversenum ::"+reversenum+"\n");
		          number = number/10;
		          System.out.println(" \n  Number  line by line execute reversenum ::"+number);
				
		      }
		      /* for loop: No initialization part as num is already
		       * initialized and no increment/decrement part as logic
		       * num = num/10 already decrements the value of num
		       */
		      // for loop statement execute 
		      
//		      for( ;number != 0; )
//		      {
//		          reversenum = reversenum * 10;
//		          reversenum = reversenum + number%10;
//		          number = number/10;
//		      }

		      System.out.println("Reverse of specified number is: "+reversenum);
	}

}
