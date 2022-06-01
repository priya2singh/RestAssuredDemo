package Nov_java;


public class Recursionnum {
	
// print number from 5 to 1 using recursion
	 public static void printnum(int n) {
		 if(n==0) {
			 return;
		 }
		 System.out.println(n);
		 printnum(n-1);
		 
	 }
	 // print a number from 1 to 5 using recursion
	 public static void printnum1(int n) {
		 if(n==6) {
			 return;
		 }
		 System.out.println(n);
		 printnum1(n+1);
		 
	 }
	 
	 
	 // print first of n natural number 
	 
	 public static void printsum(int i, int n, int sum) {
		 if(i==n+1) {
			 System.out.println(sum);
			 return;
		 }
		 sum= sum+i;
		 printsum(i+1, n, sum);
		 
	 }
	 
	 
	 public static int calculatefactorial(int n) {
		 if(n==1 || n==0) {
			 return 1;   
		 }
		 
		 int n_1=calculatefactorial(n-1);
		 
		 int factn=n*n_1;
		 return factn;
	 }
	 
	 public static void main(String [] args) {
		 printnum(5);
		 System.out.println("PRIYA SINGH NEW METHOD START");
		 printnum1(1);
		 
		 System.out.println("NEW PRINT SUM METHOD CALL");
		 printsum(1,4,0);
		 
		 System.out.println("NEW PRINT SUM METHOD CALL");
		int value= calculatefactorial(5);
		System.out.println(value);

		 
	 }


}