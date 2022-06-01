package Programingpractice;
//Note method overloading is possible for main method and overriding is not possible 


public class Day3program  {

	public static void printtable(int i) {
		//
		if(i==22) {
			return;
		}
		i=i*2;
		//2,6,
		System.out.println(" table 2 is: "+ i);
		
		printtable(i+1);
	}
	public static void main(String [] args) {
		System.out.println("Aman Singh");
	   printtable(1);
		}
	
		
}

