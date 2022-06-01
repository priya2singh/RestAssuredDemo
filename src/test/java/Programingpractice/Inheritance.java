package Programingpractice;

// class C can't access class A  member directoly if method name is same for all the classes 
// Multilevel Inheritance 
class A{
	int x=10;
	public  void m1() {
		System.out.println("Class A");
	}
}

class B extends A{
	public  void m1() {
		super.m1();
		System.out.println("Class B");
	}
}

class c extends B{
	
	public  void m1() {
		super.m1();
//		super.x=2;
		System.out.println("Class C");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	c c1=new c();
	c1.m1();
		
	}

}
