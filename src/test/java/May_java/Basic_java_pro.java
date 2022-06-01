package May_java;

import java.util.concurrent.ThreadLocalRandom;

public class Basic_java_pro {

	
	
public static void main(String[] args) {
	
//	1.Fibonacci series in java
//	0,1,1,2,3,5,8,13,29
	
//	int p=0,j=1,k;
//	System.out.print(p+" "+j+" ");
//	for(int i=0;i<=10;i++) {
//		k=p+j;
//		p=j;
//		j=k;
//		System.out.print(k+" ");
//	}
	
//	2. Prime number program in java
	//0 and 1 is non prime number and 2 is only even prime num bcz other even will be divided by 2
	
//	int flag=0;
//	int n=89;
//	int m=n/2;
//	if(n==0||n==1) {
//		System.out.println(n+" is non prime01");
//	}
//	for(int i=2;i<=m;i++) {
//		if(n%i==0) {
//			System.out.println(n+" is non prime");
//			flag=1;
//			break;
//		}}
//		if(flag==0) {
//			System.out.println(n+" is prime number");
//		}
		
//	3. Palindrom number in java
//		int i=454;
//		int temp=i;
//		int sum=0;
//		
//		while(i>0){
//		int r=i%10;
//		sum=(sum*10)+r;
//		i=i/10;
//	}
//		if(temp==sum) {
//		System.out.println(temp+" is palindrom");
//		}
//		else {
//			System.out.println(sum+" not a palindrom");
//		}
	
	
//	4. Factorial number is java
//	int fact=1;
//	int number=5;
//	for(int i=1;i<=number;i++) {
//
//		fact=fact*i;
//		System.out.println(fact);
//	}
//	System.out.println("factorial of number "+ number+" is: "+ fact);
	
	
//	5. Armstrong number in java 
//	1=1^1=1
//	123=1^3+2^3+3^3;
	
//	int i=371;
//	int t1=i;
//	int length=0;
//	while(t1!=0) {
//		t1=t1/10;
//		 length=length+1;
//	}
//	System.out.println(length);
//	int t2=i;
//	int rem;
//	int arm=0;
//	while(t2!=0) {
//	rem=t2%10;
//	int multi=1;
//	for(int j=1;j<=length;j++) {
//		multi=multi*rem;
//	}
//	arm=arm+multi;
//	t2=t2/10;
//	}
//if(i==arm) {
//	System.out.println(i+ " is a armstrong number");
//}
//else {
//	System.out.println(i+ " is not a armstrong number");
//}
	
	
//	6. How to generate random number
//	System.out.println("generating the random number is: "+ Math.random());
//	System.out.println("generating the random number is: "+ Math.random());
//	System.out.println("generating the random number is: "+ Math.random());
//	System.out.println("generating the random number is: "+ Math.random());
//	int min=200;
//	int max=400;
//	double a=Math.random()*(max-min+1)+min;
//	int b=(int)(Math.random()*(max-min+1)+min);
//	System.out.println(a);
//	System.out.println(b);
//	int a=ThreadLocalRandom.current().nextInt(200, 20000);
//	int b=ThreadLocalRandom.current().nextInt();
//	System.out.println(a);
//	System.out.println(b);

	
	
//	7. How to Print Pattern in Java
//	* 
//	* * 
//	* * * 
//	* * * * 
//	int str=1;
//	for(int i=1;i<=4;i++) {
//		for(int j=1;j<=str;j++) {
//			System.out.print("* ");
//		}str++;
//		System.out.println();
//	}
	
//	 or
//	* * * * 
//	* * * 
//	* * 
//	* 
//	int str=4;
//	for(int i=1;i<=4;i++) {
//		for(int j=1;j<=str;j++) {
//			System.out.print("* ");
//		}str--;
//		System.out.println();
//	}
	
	
//	or
//    * 
//  * * 
//* * * 
//* * * *
//	int str=1;
//	int space=3;
//	for(int i=1;i<=4;i++) {
//		for(int j=1;j<=space;j++) {
//			System.out.print("  ");
//		}space--;
//		for(int k=1;k<=str;k++) {
//			System.out.print("* ");
//		}str++;
//		
//		System.out.println();
//	}
//	

//	or
//    *
//   * *
//  * * *
// * * * *
//* * * * *
//* * * * * *
//	int space=6;
//	int str=1;
//	for(int i=1;i<=6;i++) {
//		for(int j=1;j<=space;j++) {
//			System.out.print(" ");
//		}space--;
//		
//		for(int k=1;k<=str;k++) {
//			System.out.print(" *");
//		}str++;
//		System.out.println();
//	}
	
	
//	or
	
//    *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
	
//	int space=6;
//	int str=1;
//	for(int i=1;i<=6;i++) {
//		for(int j=1;j<=space;j++) {
//			System.out.print(" ");
//		}space--;
//		
//		for(int k=1;k<=str;k++) {
//			System.out.print(" *");
//		}str++;
//		System.out.println();
//	}	
//	int space1=2;
//	int str1=5;
//	for(int p=1;p<=5;p++) {
//		for(int q=1;q<=space1;q++) {
//			System.out.print(" ");
//		}space1++;
//		for(int r=1;r<=str1;r++){
//			System.out.print(" *");
//		}str1--;
//		System.out.println();
//	}
	
// or
//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
//	int str=6;
//	for(int i=1;i<=6;i++) {
//		for(int j=1;j<=str;j++) {
//			System.out.print("* ");
//		}str--;
//		System.out.println();
//	}

	
//	or
//	  * * * * * *
//	   * * * * *
//	    * * * *
//	     * * *
//	      * *
//	       *
//	int str=6;
//	int space=1;
//	for(int i=1;i<=6;i++) {
//		for(int j=1;j<=space;j++ ) {
//			System.out.print(" ");
//		}space++;
//		for(int k=1;k<=str;k++) {
//			System.out.print(" *");
//		}str--;
//		System.out.println();
//	}
	
	
//	or
//	 ******
//	  *****
//	   ****
//	    ***
//	     **
//	      *
//	int str=6;
//	int space=1;
//	for(int i=1;i<=6;i++) {
//		for(int j=1;j<=space;j++) {
//			System.out.print(" ");
//		}space++;
//		for(int k=1;k<=str;k++) {
//			System.out.print("*");
//		}str--;
//		System.out.println();
//	}

//	or
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 

//	int str=1;
//	int str1=5;
//	for(int i=1;i<=6;i++) {
//		for(int j=1;j<=str;j++) {
//			System.out.print("* ");
//		}str++;
//		System.out.println();
//	}
//	for(int k=1;k<=6;k++) {
//	for(int l=1;l<=str1;l++) {
//		System.out.print("* ");
//	}str1--;
//	System.out.println();
//}

	
//or
//     *
//    **
//   ***
//  ****
// *****
//******
// *****
//  ****
//   ***
//    **
//     *
//	int str=1;
//	int space=7;
//	for(int i=1;i<7;i++) {
//		for(int j=1;j<=space;j++) {
//			System.out.print(" ");
//		}space--;
//		for(int k=1;k<=str;k++) {
//			System.out.print("*");
//		}str++;
//		System.out.println();
//	}
//	int str1=5;
//	int space1=3;
//	for(int p=1;p<=6;p++) {
//		for(int q=1;q<=space1;q++) {
//			System.out.print(" ");
//		}space1++;
//		for(int r=1;r<=str1;r++) {
//			System.out.print("*");
//		}str1--;
//		System.out.println();
//	}
	
	
//	or
//	 * * * * * * 
//	  * * * * * 
//	   * * * * 
//	    * * * 
//	     * * 
//	      * 
//	      *
//	     * *
//	    * * *
//	   * * * *
//	  * * * * *
//	 * * * * * *
//	int str=6;
//	int space=1;
//	for(int i=1;i<=6;i++) {
//		for(int j=1;j<=space;j++) {
//			System.out.print(" ");
//		}space++;
//		for(int k=1;k<=str;k++) {
//			System.out.print("* ");
//		}str--;
//		System.out.println();
//	}
//	int space1=5;
//	int str1=1;
//	for(int p=1;p<=6;p++) {
//		for(int q=1;q<=space1;q++) {
//			System.out.print(" ");
//		}space1--;
//		for(int r=1;r<=str1;r++) {
//			System.out.print(" *");
//		}str1++;
//		System.out.println();
//	}
	
	
//	or
	int str=4;
	int space=2;
	for(int i=1;i<=8;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=str/2;k++) {
			if((i==1|| k==1)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	
	
	
	
	
	
	
	
	


}}
