package level2;

public class ArrayPassingAndReturn {

//	public int arrayPassing(){
//		
//		int [ ]  number = new int [ 10];   // instantiate the array
//        int i;
//        int sum=0;
//		return 0;
//		
//	}
	
	public static int add(int x, int y) {
		int z=0;
		z=x+y;
		return z;
	}
	
	public static String string(String x, String y) {
		String z;
		z=x+y;
		return z;
	}
	
	public static void dispayArray(int arr[]) {
		for (int x:arr){
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayPassingAndReturn arrayObj = new ArrayPassingAndReturn();
		//arrayObj.arrayPassing();
		//arrayObj.add();
		
		int a[]={34,56,78};
		dispayArray(a);
		
		int Result =0;
		System.out.println(Result);
		Result = add(20,30);
		System.out.println(Result);
		
		String Result1 = "hariTesting For array Passing String";
		System.out.println(Result1);
		Result1 = string("testing String hari","prasanth");
		System.out.println(Result1);
		
	}
	
	
}
