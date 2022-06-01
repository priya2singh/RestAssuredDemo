package Programingpractice;

//write a program to print 2 table 
public class numberseries {
	public static void printnum(int n) {
		
		//Print number using recursion 5 4 3 2 1
		if(n==0) {// base case 
			return;
		}
		System.out.println(n);
		printnum (n-1);// recursion 
	}

	
public static void main(String [] args) {
//	for(int i=1;i<=5;i++) {
//		int b=2*i;
//		System.out.println(b);	}	

	numberseries num=new numberseries();
	num.printnum(5);
	
	for(int i=1; i<=3;i++) {
	for(int j=1; j<=i; j++) {
		System.out.print("*");
	}
	System.out.println(" ");
}
}}

