package myProject;

import java.util.Scanner;

public class EligibleToVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int a;
        System.out.print("Please Your Age for Eligible criteria : ");
        a = in.nextInt();
        
		//int a=22;//take input age
	    if(a>=18)//condition for eligble to vote
	    {
	     System.out.println("eligble to Vote");
	    }
	    else
	    {
	     System.out.println("not eligble to Vote");
	    }
	}

}
