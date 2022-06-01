package Nov_java;


//1. Inheritance it is a mechanism in java in which one class allows to inherit the feature(fields and method ) of another class
// 2.  when child class inherit all the properties of parent class using extends keyword
//2. extends is keyword in java 
//3. type of inheritance 1. signle 2. multilevel 3. herarichal inheritance 4. 

class Employee extends Inheritance{
	String name;
	int id;
	String Companyname;
	
	 public Employee(String name, int id, String Companyname){
		super();
		this.name=name;
		this.id=id;
		this.Companyname=Companyname;
		
		System.out.println("Name of employee is : "+ name+ "Id is : "+ id+ "Comapany name is : "+ Companyname);
	
		
	}
	
		
		public static void main(String [] args) {
			Inheritance ie=new Inheritance();
		}
	
}


class Child extends Inheritance{
	
	public Child() {
		super();
		System.out.println("Child class acess super class");
	}
}


public class Inheritance  {

	public Inheritance(){
		super();
		System.out.println("Priya Singh");
	}

	public static void main (String [] args) {
	new Employee("Priya", 555, "360 logica");
	new Inheritance();
	new Child();
	}
	
	

	
	
}
