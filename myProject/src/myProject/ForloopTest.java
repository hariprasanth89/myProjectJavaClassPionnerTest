package myProject;


public class ForloopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
//		   for(int x=10;x>0;x--){
//			   System.out.println(x);
//		   }
//		   
//		   for(int y=0;y<10;y++){
//			   System.out.println(y);
//		   }
		 
//		   for(int z=0;z%2==0;z++){
//			   System.out.println(z);
//		   }
//		   
		   //System.out.println("Input your number and press enter:"+z);
//		   int number=0;
//		   int numbers=10;
//		   
//		   while(number<10){
//			   System.out.println(number);
//			   number++;
//		   }
//		   while(numbers>0){
//			   System.out.println(numbers);
//			   numbers--;
//		   }
//		   while (number%2==0) {
//			   System.out.println(number);
//			   number++;
//			
//		}

//		int x=12;
//		
//		do {
//				System.out.println(x);
//				x++;
//		} while (x<10);
//	
//		System.out.println(x);
//	
		
		int num = 20, count;

		for (int i = 1; i <= num; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     //break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }
		  }
		
		
		
		
		
	}

}
