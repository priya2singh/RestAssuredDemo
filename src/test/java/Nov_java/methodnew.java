package Nov_java;

//1. Method is block of code it is only run when it is called
//2. if we pass data it is parameterize method
// 3. we use method to reuse the code
// 4. When a parameter is passed to the method, it is called an argument. So, from the example above: a and name is a parameter, while 1582, priya a are arguments.
// 5. method overloading multiple method with same name but different parameter 
// 6. Recursion is a technique of making funtion call itself 

public class methodnew {
	void m1() {
		System.out.println("first  method preeti");
	}
	 void m2() {
		System.out.println("second method is static");
	}
	 // parameterize method
	 void m3(int a, String name) {
		 System.out.println("roll no.: "+ a+ "  Name is : "+ name);		 
	 }
	//Return type we can use primitive data type (like int char etc..)
	 int add(int x, int y) {
		 return x+y;
	 }
	 
	 //method overloading
	 int addme(int a) {
		 System.out.println();
		 return a;
	 }
	 int addme(int b, int c) {
		 return b+c;
	 }
	 
	public static void main(String[] args) {
	methodnew mn=new methodnew();
	mn.m1();
	mn.m2();
	mn.m3(1582, "Priya Singh");
	mn.m3(1581, "Preeti Singh");
	System.out.println(mn.add(4, 4));
	System.out.println(mn.addme(4));
	System.out.println(mn.addme(4, 4));


	}
}
