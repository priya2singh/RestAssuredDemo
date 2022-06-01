package Nov_java;

// 1. constructor in java it is for allocating memory 
// 2. constructor name should be same as class name 
// 3. it has no return type 
// 4. constructor will call automatically when we create an object 
// 5.  purpose of constructor is to perform initialization of an object or initialization of an instance variable of of an object.



public class ConstructorKeyword {

	
	String name;
	int roll;
	public ConstructorKeyword(String name, int roll){
		this.name=name;
		this.roll=roll;
//		System.out.println("Name is : "+name+ " Roll no is : "+ roll);
	}
	
	public ConstructorKeyword() {
		
	}
	
	public static void main(String [] args ) {
		ConstructorKeyword ck=new ConstructorKeyword("Priya Singh", 555);
		System.out.println("name: "+ ck.name + " roll: "+ ck.roll);

		ConstructorKeyword ck1=new ConstructorKeyword("Preeti Singh", 545);
		ConstructorKeyword c=new ConstructorKeyword();
		c.name="Harsh";
		c.roll=555;
		System.out.println("name: "+ c.name + " roll: "+ c.roll);
		

		
	}
}
