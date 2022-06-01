package Nov_java;

//1. we can not create an object of abstract
//2. using abstract keyword we declare the class and method name 
//3. if we write abstract method then we will not defined that method 
// 3. 

abstract class Parent{
	
	public Parent(){
		System.out.println("Constructor present");
	}
	abstract void Name();
	public void Companyname() {
		System.out.println("Saksoft");
	}
}

class NewClass extends Parent{
	void Name() {
		System.out.println("My name is Priya Singh");
	}
}

public class Abstract {
public static void main(String [] args) {
	NewClass ch=new NewClass();
	ch.Name();
	ch.Companyname();
}
	
	
}
