package Nov_java;

public class factorialmethod {

	public static int factorial(int n) {
		int fact=1;
		for(int i= n; i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String [] args) {
		int facvalue=factorial(5);
		System.out.println(facvalue);
		
	}
}
