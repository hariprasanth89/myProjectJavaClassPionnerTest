package level2;

public class Array {
	
	
	void getArray(){
		
		int a[]=new int[5];             //declaration and instantiation  
		a[0]=11;                        //initialization  
		a[1]=12;  
		a[2]=13;  
		a[3]=14;  
		a[4]=15;  
		  
		//printing array  
		for(int i=0;i<a.length;i++)     //length is the property of array  
		System.out.println("Array print out :::"+"\n"+a[i]);
		  
	}
	
	void getReverseOrder(){
		
		int[] myIntArray = {1,2,3,4,5};
		System.out.println("initialArrayLength:"+myIntArray.length);
		
		//for(int i=0; i<=myIntArray.length;i++)
		for(int i = myIntArray.length - 1; i >= 0 ; i--)
			
		{
			//System.out.println("ReverseOrederPrinting:"+i);
			System.out.println("ReverseOrederPrinting:"+myIntArray[i]);
			System.out.println("indexOfReverseOrederPrinting:"+i);
		}
	}
	
	void getEvenNumbers(){   // get the index of 
		 
//		Scanner scan = new Scanner(System.in);
		int[] myIntArray = {1,2,3,4,5,6};
		
		for(int i=0; i<myIntArray.length;i++){
			
			if( myIntArray[i] % 2 == 0){
			//System.out.println("PrintEvenNumbers:"+ myIntArray[i] );
			}
			
		}
	}
	
	
	void getOddNumbers(){    // get the elements 
		
		int[] myIntArray = {1,2,3,4,5};
		
		for(int i=0; i<myIntArray.length;i++){
			
			if(myIntArray[i] % 2 != 0){
			//	System.out.println("PrintOddNumbers:"+myIntArray[i]);	
			}
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Array arrayObj = new Array();
		//arrayObj.getArray();
		arrayObj.getReverseOrder();
		//arrayObj.getEvenNumbers();
		//arrayObj.getOddNumbers();
	}

}
