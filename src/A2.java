import java.util.*;
class Student {
	Student(int id,String name)
	{
		int id1=id;
		String name1=name;
		System.out.println("2-par");
	}
	void m2(int a)
	{
		System.out.println("1-pare");
	}
	
}
class engStudent extends Student{
	engStudent(int id,String name)
	{
		super(id,name);
		int id1=id;
		String name1=name;
		System.out.println("child");
		
		
	}
	void m1()
	{
		System.out.println("0-child");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		engStudent s=new engStudent(1,"aa");
		Student s1=new Student(2,"bb");
		s1.m2(10);
		s.m1();

	}

}
