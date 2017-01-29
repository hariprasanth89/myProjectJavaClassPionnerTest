package level2;

public class Kuppam {

	int c;
	
	void getAdd(){
		int a=10,b=20,z;
		z=a+b;
		System.out.println("getAdd:  a+b "+z);
	}
	void getSubtract(){
		int a=10,b=20,z;
		z=a-b;
		System.out.println("getSubtract: Z"+z);
	}
	
	
	public Kuppam(int x, int y){
		
		int no1=x;
		int no2 =y;
		
		c= no1+no2;
		
//		System.out.println("hariObj"+ c);
//		System.out.println("hariObj1"+c);
		System.out.println("c values "+c);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+c+" ";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kuppam hariObj = new Kuppam(10,15);
		Kuppam hariObj1 = new Kuppam(25, 25);
		System.out.println("hariObj"+hariObj);
		
		
	
		//hariObj.getAdd();
		//hariObj.getSubtract();

	}
	

}
