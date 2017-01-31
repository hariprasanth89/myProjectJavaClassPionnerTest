package level1Project;

import java.sql.SQLException;

public class Student {
	
	int x;
	String name;
	
	void f1(){
		int y=9;
		
		System.out.println("Student.f1()"+y);
	}
			
	
	public int add(int x,int y) {
		
		int a=x; 
		int b=y;
		int c =a+b;
		return c;
	}
	
	public int multiple(Student s) {
		
		int c =0;
		s.add(5, 5);
		return c;
	}
	
	
	public Student methods1() {
		
		Student student1 = new Student();
		return student1;
	}
	
	
	
	public boolean save() throws SQLException{
	
		return false;
	}
	
	
	
	
	public static void main(String[] args) throws SQLException {
		
		Student student = new Student();
		//student.add(10, 5);
		student.f1();
		
		student.save();
		
		String string = new String("hari");
		String str1 = string.substring(2);
		
		System.out.println(str1);
		
		
		
		//Student student2 = new Student();
		Student s = student.methods1();
		System.out.println(s);
		
		
	}
	

}
