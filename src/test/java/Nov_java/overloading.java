package Nov_java;

//1. Rule 1. What happens when method signature is the same and the return type is different?
//Ans. The compiler will give an error as the return value alone is not sufficient for the compiler to figure out which function it has to call.

public class overloading {

	
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(int a, int b) {
		return a+b;
	}
	
	public static void main(String [] args) {
		overloading ol=new overloading();
//		ol.add(1, 0);
		System.out.println(ol.add(1, 0));
	}
}
