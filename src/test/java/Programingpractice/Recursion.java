package Programingpractice;

public class Recursion {
	
	// Write a program to print  1 to 5 number 
	public static void printnum(int n) {
		
		// is case me base case 6 hoga jaise hi n ko 6 milega wo return ho jayega
		if(n==6) 
		{
			return;
		}
		
		System.out.println(n);
		printnum(n+1);
	}
	
	
	//Write a program to print sum of fist n natural number 
	//	1+2+3+4+5+6
	public static void printsum(int n, int sum)
	{
		if(n==7) {
			System.out.println(sum + " sum Of N is");
			return;
		}
	    sum=n+sum;
	    printsum(n+1,sum);    
		
	}
	
	
	// write a program to print factorial n!
	//3!= 3*2*1
	
		public static int factorial(int n) {
		if(n==0 || n==1) {
		return 1;
		}
		int fact1=factorial(n-1);;
		int fact=n*fact1;
		 return fact;
	}
	
	// print fibonaci series till nth term
	// 0,1,1,2,3,5,8
	public static void fibonacci(int i, int j, int n) {
		
		if( i==n) {
			return;
		}
//		System.out.println(i+ " "+ j);
		int k=i+j;
		System.out.println("value of fibonacci is : "+ k);
		fibonacci(j, k, n); 
		
	}
	
	// Print x^n (stack height)
	public static int power(int x, int n) {
		 if(n==0) {
			 return 1;
		 }
		 if(x==0) {
			 return 0;
		 }
		int powernm1=power(x,n-1);
		 int pr=x*powernm1;
		 return pr;
	}
	
	public static void main(String[] args) {
		
		Recursion rc=new Recursion();
		// 1. print 1 to 5 number 
		rc.printnum(1);
		
		//2. sum of nth number
		rc.printsum(1, 0);
		
		//3. factorial number
		int ans=factorial(5);
		System.out.println("Factorial of n is: "+ ans);
		int i=0, j=1;
		
		//4. fibonacci series
		System.out.println("value of fibonacci is : "+i);
		System.out.println("value of fibonacci is : "+j);
		rc.fibonacci(i, j, 8);
		
		//5. printpower value
		int result=power(2,4);
		System.out.println(" x power n is : "+result);
		
		
		

	}

}
