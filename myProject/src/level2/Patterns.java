package level2;

public class Patterns {
	
	void patternsForward(){    // method 1 way
		
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				//System.out.print(k+1);
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
	}
	
	void secoundWay() {
		int i, j, k;
		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void thirdWay() {
		int i, j;
		for (i = 1; i <= 6; i++) {
			for (j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void fourthWay() {
		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patterns objPartterns = new Patterns();
		objPartterns.patternsForward();
		//objPartterns.secoundWay();
		//objPartterns.thirdWay();
		objPartterns.fourthWay();
		

	}

}
