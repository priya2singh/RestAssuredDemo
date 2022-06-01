package Programingpractice;

import io.restassured.RestAssured;

// Write a program to print fibonicee series
// 0,1,1,2,3,5,8
public class Day2 {

	public static void main(String[] args) {
	int a=0;
	int b=1;
	int c;
	System.out.print(a+" "+b+ " ");
	for(int i=0;i<6;i++) {
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}

	}

}
