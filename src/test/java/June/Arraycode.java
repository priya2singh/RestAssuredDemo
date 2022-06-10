package June;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Arraycode {
public static void main(String [] args) {
	

//	int a[]=new int[] {2,3,5,4,2,5};
//	
//	for(int i=0;i<=a.length;i++) {
//		for(int j=i+1;j<=a.length-1;j++) {
//			if(a[i]==a[j]) {
//				System.out.println(a[i]);
//			}
//			
//		}
//	}
	
	
	
//	fibonnice series
//	int a1=0,a2=1,a3;
//	System.out.print(a1+" "+ a2);
//	for(int i=0;i<=10;i++) {
//		a3=a1+a2;
//		System.out.print(" "+a3+" ");
//		a1=a2;
//		a2=a3;
//	}
	
	//Even number in array
//	int a[]= {2,1,3,4,6,8,13,17,18,23,24,99,26};
//	for(int i=0;i<=a.length-1;i++) {
//		if(a[i]%2==0) {
//			System.out.print(" "+ a[i]);
//		}
//	}
//	//Odd number in array
//	int a[]= {2,3,5,6,7,9,13,27};
//	System.out.println("Odd number is: ");
//	for(int i=0;i<=a.length-1;i++) {
//		if(a[i]%2!=0)
//		{
//			System.out.print(" "+a[i]+" ");
//		}
//	}
	
	//Palindrom 
	int i=545;
	int sum=0;
	int rem;
	int temp=i;
	while(i>0) {
	rem=i%10;
	sum=(sum*10)+rem;
	i=i/10;
	}
	
	if(temp==sum) {
		System.out.println("it is palindrom: "+ sum);
	}
	else {
		System.out.println("it is not palindrom: "+ sum);
	}
	
	
	
	
	
	

}
}
