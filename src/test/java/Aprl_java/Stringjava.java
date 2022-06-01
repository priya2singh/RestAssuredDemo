package Aprl_java;

import java.net.Socket;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class Stringjava {

//	public void str1(String str) {
//		for(int i=0;i<str.length();i++) {
//			System.out.print(str.charAt(i));
//			System.out.print(" ");
//		}
//		
//	}
	
	
//	static void printPermutn(String str, String ans)
//    {
// 
//        // If string is empty
//        if (str.length() == 0) {
//            System.out.print(ans + " ");
//            return;
//        }
// 
//        for (int i = 0; i < str.length(); i++) {
// 
//            // ith character of str
//            char ch = str.charAt(i);
// 
//            // Rest of the string after excluding
//            // the ith character
//            String ros = str.substring(0, i) +
//                         str.substring(i + 1);
//            System.out.println("*** "+ros);
//             // Recursive call
////            printPermutn(ros, ans + ch);
//        }
//    }
	
	public static void main(String[] args) {
//		//1. How to Convert Char to String in Java?
//		// Using toString() method of Character class
//		char c='P';
//		String s=Character.toString(c);
//		System.out.println("Converting char to string using tostring method: "+s);
//		
//		//OR 
//		// Using String.valueOf() method of String class
//		String s1=String.valueOf(c);
//		System.out.println("Conver char to string using valueof method: "+ s1);
//		
//		//OR
//		// Using Concatenation in Strings
//		String s2=""+c;
//		System.out.println("Conver char to string using cancatination: "+s2);
		
		
////	2. Java Program to Add Characters to a String
//		// Add char At the End
//		
//		String name="PRIYA";
//		char l='S';
//		String fullname=name+l;
//		System.out.println("Adding char to string at end: "+ fullname);
//		
//		//Add char at the beginning 
//		String fullname1=l+name;
//		System.out.println("Adding char to string at first: "+ fullname1);
		
		
//		3. Java Program to Convert String to Float Value
//		This can be done by two methods as listed below:
//			Using parseFloat() Method 
//			Using valueOf() Method 
//		
//		String s="100";
//		Float f=Float.parseFloat(s);
//		System.out.println("Converting String into float value: "+ f);
//		
//		//OR Value of method
//		Float f1=Float.valueOf(s);
//		System.out.println("Converting string into float value is: "+ f1);
	
		
////	4. Java Program to Print a New Line in String
////	Using System.lineSeparator() method
//		String newline=System.lineSeparator();
//		System.out.println("PRiya"+newline+"Singh");
//		
////		OR Using System.lineSeparator() method
//		System.out.println("PRiya"+'\n'+"PReeti");
//	
//	   // Printing new line using new line
//     // Character "%n" with the printf() method
//		System.out.printf("PReeti%nSingh");
//		
		
////	5. IMP** Java Program to Convert String to String Array
////	Using str.split() method
//		String str="Geeks for geeks";
//		String strArray[]=str.split(" ");
//		System.out.println("String is: "+ str);
//		System.out.println("String array: "+"[");
//		for(int i=0;i<strArray.length;i++) {
//			System.out.print(strArray[i]);
//		}
//		System.out.println("]");
		
		
////	6. Java Program to Iterate Over Characters in String
//		String str="GeeksforGeeks";
//		for(int i=0;i<str.length();i++) {
//		System.out.print(str.charAt(i));
//		System.out.print(" ");
//		        }
//		System.out.println(str.length());
		
		
////	7. Java Program to Replace Multiple Characters in a String
//		String str=new String("Welcome to the Geeks for Geeks");
//		System.out.println("After replacing all e with P");
//		System.out.println(str.replace('e','P'));
		
////	8.Iterate Over the Characters of a String in Java
//		Stringjava sj=new Stringjava();
//		sj.str1("Priyasinghsultanpur");
		
//		
////	9.Java Program to Check Whether the String Consists of Special Characters
//		String str="PRiya";
//		String str1="PRiya";
//		String str2="Singh";
//		System.out.println(str.equals(str1));
//		System.out.println(str==str1);
//		System.out.println(str==str2);
		
		
//		10.How to remove a particular character from a string?
//		String str="Priyasinghiiiiiii";
//		System.out.println(str.substring(0,3));
//		System.out.println(str.substring(2));
//		//By adding both string we can remove aprticular char from string 
//		System.out.println(str.substring(0,2)+str.substring(3));
//		
		
//	Q11. How can you remove all the white spaces in a string?
//		
//		String str="     Priya      ";
//		System.out.println(str);
//		System.out.print(str.trim());
//		System.out.println("Singh");
		
//		//OR
//		String str="     Sultanpur Uttar   Pradesh  ";
////		where \\s is a single space in unicode
//		str=str.replaceAll("\\s", "");
//		System.out.println(str);
		
		
//		11. What is the difference between equals() method and == operator?
//		String str="Priya";
//		String str1=new String("Priya");
//		System.out.println(str==str1);
//		System.out.println(str.equals(str1));
//	
//		System.out.println("______1 *******_______");
//		String str2="Priya";
//	    System.out.println(str==str2);
//	    System.out.println(str.equals(str2));
//	    System.out.println("______2 *******_______");
//		String str3=new String("Priya");
//		System.out.println(str1==str3);
//		System.out.println(str1.equals(str3));
		
		
//		12) How to reverse String in java?
//		String str="Priya";
//		String nstr="";
//		System.out.println(str);
//		for(int i=0;i<str.length();i++) 
//		{
//		 char ch = str.charAt(i);
//		 nstr=ch+nstr;
//			}
//		System.out.println(nstr);
		
		
//		13) Write a java program to capitalize each word in string?
//		String str="priyu singh";
//		System.out.println(str.toUpperCase());
		
//		14) How to check Palindrome String in java?
//		String str= "abba";
//		char ch;
//		String nstr="";
//		System.out.println(str);
//		for(int i=0;i<str.length();i++) {
//			ch=str.charAt(i);
//			nstr=ch+nstr;
//		}
//		if(str.equals(nstr)) {
//			System.out.println("String is palindrom: "+ nstr);
//		}
//		else {
//			System.out.println("String is not palindrom");
//		}
		
		
//	15) Write a java program to reverse each word in string?
//		String str="JAVA CODE GeeKs for Geeks";
//		String rev=" ";
//		String [] word=str.split(" ");
//		for(String words:word) {
//			String reverseword=" ";
//			for(int i=words.length()-1;i>=0;i--) {
//			reverseword = reverseword + words.charAt(i);
//			}
//			rev=rev+ reverseword;
//		}
//	    System.out.println(rev);
	    
	    
//	  16. How to swap two strings without using the third variable?
//	    String str1="PRIYA";
//	    String str2="SINGH";
//	    System.out.println("st1 is: "+ str1+ " Str2 is: "+ str2);
//	    str1=str1+str2;
//	    System.out.println(str1);
//	    str2=str1.substring(0, str1.length()-str2.length());
//	    str1=str1.substring(str2.length());
//	    System.out.println("Str1 is: "+str1+ " str2 is: "+str2);
//	    
	    
//	   15 Write a java program to tOGGLE each word in string?
//		input: this is javatpoint
//		output: tHIS iS jAVATPOINT
		
//	    String str="priya singh sultanpur uttar pradesh";
//	    String toggle="";
//	    String[] words=str.split("\\s");
//	    for(String w:words)
//	    {
//	    	String first=w.substring(0, 1);
//	    	String last=w.substring(1);
//	    	 toggle=first.toLowerCase()+last.toUpperCase()+" ";
//	    	 System.out.print(toggle);
//	    }
	    
//		16) Write a java program reverse tOGGLE each word in string?
//	    this is javatpoint
//		sIHT sI tNIOPTAVAJ
	    
//		String str="priya singh";
//		String rev="";
//		String first;
//		String last;
//		String []words=str.split("\\s");
//		for(String w:words) {
//			StringBuilder sb=new StringBuilder(w);
//			sb.reverse();
//		   first=sb.substring(0, 1);
//		   last=sb.substring(1);
//		   rev=first.toLowerCase()+last.toUpperCase()+" ";
////		   System.out.println(" ********* "+ first);
//		   System.out.print(rev);
//	   }
		
		
//		17) Java Program to find duplicate characters in a String
//		
//		String str="priyasinghahp";
//		for(int i=0;i<=str.length()-1;i++) {
//			char first=str.charAt(i);
//			for(int j=i+1;j<=str.length()-1;j++) {
//				char second=str.charAt(j);
//				if(first==second) {
//					System.out.println("duplicate char is: "+ first);
//				}
//				
//			}
//		}
		
		
		
//		18.) How to find the maximum occurring character in a given String?
		String str="priyasiniighsultanpur";
	
		int[] arr= new int[256];
		for(int i=0;i<=str.length()-1;i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		int max=-1;
		char ch=' ';
		
		for(int i=0;i<str.length()-1;i++) {
			if(max<arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				ch=str.charAt(i);
			}
		}
		
	System.out.println( "maxmium repeated char is: "+ ch);
		int min=1;
		char ch1=' ';
		for(int i=0;i<str.length()-1;i++) {
			if(min==arr[str.charAt(i)]) {
				min=arr[str.charAt(i)];
				ch1=str.charAt(i);
				System.out.println("minimum character is: "+ ch1);
			}
		}	
		System.out.println(" minimum repeated character is: "+ ch1);
		
//			}
		
	
//	19. write a program to print all permutation of a string ?
//		String str="abc";
//		printPermutn(str,"");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////		17) Java Program to find single time present characters in a String
//		
//		String str = "PriyaSingh";
//		char [] ch =str.toCharArray();
//		
//		for(int i=0;i<=str.length()-1;i++) 
//		{  
//			boolean single=true;
//		char first=str.charAt(i);
//		for(int j=i+1;j<=str.length()-1;j++)
//		{
//			char second=str.charAt(j);
//			if(first==second) {
//				System.out.print(first);
//			}
//		}}
//		System.out.println("Single time present strings are: " );
		
		
		
		
		
		
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
////	12. Write a program to print all permutations of String in Java.
//		String str="abc";
//		for(int i=0;i<str.length();i++) {
//		
//		}
		
	}
		
		
	
}
