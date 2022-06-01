package Aprl_java;

import java.util.Arrays;

public class Arrayclass {
	

	public static void main(String[] args) {
		
//		//1. how to short array element
//		int temp;
//		int a[]= {5,2,6,3,7,8,1};
//		for(int i=0;i<a.length;i++) 
//		{
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]>a[j]) {
//				temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//				}			
//		}
//		System.out.print(" "+a[i]);
//		}
		
	//2. How to sort an array in decreesing order
//		int tpm;
//		int n[]= {5,3,2,7,8,4,1};
//		System.out.println();
//		for(int i=0;i<n.length;i++) {
//			for(int j=i+1;j<n.length;j++) {
//				if(n[i]<n[j]) {
//					tpm=n[i];
//					n[i]=n[j];
//					n[j]=tpm;
//				
//				}
//			}
//			System.out.print(" "+n[i]);
//		}
		
		
//3. find the largest number from array
//		int tmp;
//		int a[]= {3,5,66,77,888};
//		int Size=a.length;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1; j<a.length;j++) {
//				if(a[i]>a[j]) {
//					tmp=a[i];
//					a[i]=a[j];
//					a[j]=tmp;
//				}
//			}
//		}
//		System.out.println(a[Size-1]);
		
//	}

	//4. Find the lowest number from array	
//	int tmp;
//	int a[]= {3,5,66,77,888,2};
//	for(int i=0;i<a.length;i++) {
//		for(int j=i+1; j<a.length;j++) {
//			if(a[i]>a[j]) {
//				tmp=a[i];
//				a[i]=a[j];
//				a[j]=tmp;
//			}
//		}
//	}
//	System.out.println(a[0]);
//	
//}
	
	//5. Move all the negative element in one side of array
//	int tmp;
//	int a[]= {-3,-5,66,77,888,-2};
//	for(int i=0;i<a.length;i++) {
//		for(int j=i+1; j<a.length;j++) {
//			if(a[i]>a[j]) {
//				tmp=a[i];
//				a[i]=a[j];
//				a[j]=tmp;
//			}
//			
//		}
//		System.out.print(a[i]+ " ");
//	}
	
	
		//6. Use Sort method 
//		int a[]= {2,6,3,88,1};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println(a.length);
		
		
		// 7. Find the middle number in array
//		int a[]= {3,5,6,10,6,7};
//		int m=a.length/2;
//		System.out.println(a[m]);
		
		
//		//Original array
//        int arr[] = {12, 22, 34, 22, 54, 6, 52, 8, 9, 34, 54, 68,10,20,30,40};
//        // Printing the array
//        System.out.println("The array elements are : "+Arrays.toString(arr));
//        int startIndex = 0, lastIndex = arr.length - 1;
//        // Setting the mid index
//        int midIndex = startIndex + (lastIndex-startIndex)/2;
//        System.out.println("The mid index is "+midIndex+" and the element at mid is "+arr[midIndex]);
//		
//		//Anonymus array  means array without refrence 
//		System.out.println(new int[] {11,2,3,5}.length);
		
		//8. Find a duplicate element in array?
//		int a[]= {5,6,7,6,5};
//		for(int i=0;i<=a.length;i++) {
//			
//		
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j]) {
//					System.out.print(a[i]+" ");
//			}
//		}}
//		
		
	//9. Find a prime number in array 
	//The number which have 2 factor 1 and a number itself is a prime number;
//		int[] array = {6,48,47,7 , 98,51,87,99,2,0,1,191,157,0,1};
//
//	    // loop through the numbers one by one
//	    for (int i = 0; i < array.length; i++) {
//	        boolean isPrime = true;
//	        if (array[i] == 1)
//	            isPrime = false;
//	        else {
//	            // check to see if the numbers are prime
//	            for (int j = 2; j <= array[i] / 2; j++) {
//	                if (array[i] % j == 0) {
//	                    isPrime = false;
//	                    break;
//	                }
//	            }
//	        }
//	        // print the number
//	        if (isPrime){
//	            if (array[i] == 0){}
//	            else {
//	                System.out.print(array[i] + " , ");
//	            }
//	    }}
//	    System.out.println(" Are the prime number in the array ");	

		
		
		//10.Find number is prime
//		int n=11,temp=0;
//		for(int i=2;i<=n-1;i++) {
//			if(n%i==0) {
//				temp=temp+1;
//			}
//		}
//		if(temp>0) {
//			System.out.println("Number is non prime");
//		}
//		else {
//			System.out.println("prime number");
//		}

		//11.Find Prime number in array
//		int a[]= {11,12,2,5,6};
//		int temp=0;
//		for( int i=0;i<a.length;i++) {
//			if(a[i]==1) {
//				temp=temp+1;
//			}
//			else {
//				for(int j=2;j<=a[i]-1;j++) {
//					if(a[i]%j==0) {
//						temp=temp+1;
//					}
//				}
//				if(temp==1) {
//				}
//				else {
//					System.out.println(a[i]+ " Number is prime");
//				}}	
//			}
		
		  //12.initializing array without passing values  
		  //int a[]= new int[5];
		
		 //13.declaration of an array  
		 //int [] numbers;  
		
		 //initializing array after declaration  
		 // numbers = new int[]{22,33,44,55,66};  
		
		//14.****** Merge 2 shorted array****
//		int a[]= {2,5,6,3};
//		int b[] = {2,3,5,8,9,2};
//		int a_length=a.length;
//		int b_length=b.length;
//		int c_length=a_length+b_length;
//		int c[]=new int[c_length];
//		
//		for(int i=0;i<a_length;i++) {
//			c[i]=a[i];
//		}
//		for(int i=0;i<b_length;i++) {
//			c[a_length+i]=b[i];
//		}
//		for(int i=0;i<c_length;i++) {
//			System.out.print(" "+ c[i]);
//		}
//		
//		System.out.println(" ");
//		System.out.println(c_length+" "+a_length+" "+b_length);
		
		
//		OR
//		String s[]= {"Priya","Singh"};
//		String p[]= {"360","Logica","Noida","GaurCity"};
//		int s_length=s.length;
//		int p_length=p.length;
//		int q_length= s_length + p_length;
//		String q[]=new String[q_length];
//		for(int i=0;i<s_length;i++) {
//			q[i]=s[i];
//		}
//		for(int i=0;i<p_length;i++) {
//			q[s_length+i]=p[i];
//		}
//		for(int i=0;i<q_length;i++) {
//			System.out.print(" "+q[i]);
//		}
		
		
//		15.How to reverse the first half of array 
//		int a[]= {5,3,10,1,6,8,9,2};
//		int a_length=a.length/2;
//		int b[]=new int[a_length];
//		for(int i=0;i<a_length;i++) {
//			b[i]=a[a_length-i-1];
//		}
//		for(int i=0;i<a_length;i++) {
//			System.out.print(b[i]+" ");
//		}
//			System.out.println();
//		for(int i=0;i<a_length;i++) {
//			a[i]=b[i];
//			System.out.print(a[i]);
//		}
//			System.out.println();
//		for(int i=0;i<a.length;i++) {
//			System.out.print(" "+a[i]);
//		}
		
		//16. Find duplicate element in array
////		String a[]= {"Priya","Singh","Priya"};
//		int a[]= {1,2,4,5,1,2,5};
////		char a[]= {'a','b','c','d','a','b'};
//				for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.print(a[i]+" ");
//				}
//			}
//		}
		
		
		//17.What is median in array, define the logic and write the code?
	/* calculate the median first we need to sort the list in ascending or descending order. 
	 If the number of elements are even, then the median will the average of two numbers
	 in the middle. But the number is odd then the middle element of the array after sorting 
	 will be considered as the median
		*/
//		int a[]= {1,2,3,4,5};
//		if(a.length%2 !=0) {
//			System.out.println("Median of an array is"+ a[a.length/2]);
//			
//		}
		
		
		//Prime number  and non prime numbers 
//		int a[]= {1,2,3,4,5,7,11,44,79};
//		for(int i=0;i<a.length;i++) {
//			boolean isprime=true;
//			if(a[i]==1) {
//				isprime=false;	
//			}
//			else {
//				for(int j=2;j<a[i]-1;j++) {
//					if(a[i]%j==0) {
//					isprime=false;
//					break;
//					}
//				}}
//				if(isprime) {
//					if(a[i]==0) {}
//					else {
//						System.out.print(" "+ a[i]);
//				}	
//			}
//				else {
////					System.out.print(a[i]+ " ");
//				}
//		}
		
		
	//17. find first duplicate element from an array
//		int a[] = {1,2,3,6,8,3,6,8};
//		for(int i=0;i<a.length-1;i++) {
//			int temp=0;
//			for(int j=i+1;j<a.length;j++) {
//				
//				if(a[i]==a[j] && i!=j) {
//					System.out.print(a[i]+ " ");
//					temp=temp+1;
//					break;
//				}
//			}
//			if(temp>0) {
//				break;
//			}
//		}
		
		
		
//18. find the element which appears once in array where every others element appears 
		//twice in array
		int a[]= {2,3,5,6,7,11,2,3,77};
		int rev=a[0];
        int[] array = new int[78];  
        for(int i=0;i<10;i++) {
        	array[i]=0;
        }
        
        for(int i=0;i<a.length;i++) {
        	array[a[i]]=array[a[i]]+1;
        }
        for(int i=0;i<a.length;i++) {
        	if(array[a[i]]==1) {
    		System.out.println("Single repeted element is : "+a[i] +" "+ array[a[i]]+ " ");}

        	
        }
		
		
//	int a[]= {2,3,4,5,4,3,2,6,7};
//	int b[]=new int[8];
//	for(int i=0;i<a.length;i++) {
//	b[a[i]]=b[a[i]]+1;	
//	}
//	for(int i=0;i<=a.length;i++) {
//		if(b[a[i]]==1) {
//			System.out.println(a[i]+" Single repeated elements: "+ b[a[i]]);
//		}
//	}
	
		
	//18. Find out the mean mode median and range of an array 
//		int a[]={1,2,3,6,4,5};
//		double sum=0;
//		int n=a.length;
//		double m;
//		//Find out mean of array
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//			}
//		
//		System.out.println("sum of array "+ sum+ " length of array: "+ a.length);
//		double mean=sum/a.length;
//		System.out.println("mean of this array is: "+ mean);
//	
//		//find out median of an array
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//			if(n%2!=0) {
//				int odd=n/2;
//			System.out.println(" odd Median is: "+a[odd]);
//				}
//		if(n%2==0) {
//			double even= ((a[(n/2)-1])+(a[n/2]))/2;
//			System.out.println("even Median is: "+even);
//
//		}
//		//find out mode of an array	
//		
//		//Find out the range 
//		int range=a[n-1]-a[0];
//		System.out.println("Range is: "+ range);
		
		
		
		
		
		
		
		
		
		
	}}



