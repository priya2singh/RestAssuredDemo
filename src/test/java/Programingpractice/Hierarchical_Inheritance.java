package Programingpractice;

class A {
	
	public void m1() {
		System.out.println("Class A");
	}}


class B extends A {
	
	public void m1() {
		System.out.println("Class B");
	}}


class C extends A{
	
	public void m1() {
		System.out.println("Class C");
	}}


class D extends A{
	
	public void m1() {
		System.out.println("Class D");
	}}


public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new D();
		a.m1();
	}

}
