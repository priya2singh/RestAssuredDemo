package Nov_java;

//1. static is use for memory management
// 2. if we make any variable static then it will be not for particular object it will be same for all the object 
// 3. if we want to initialize static variable then we can use static block 
// 4. if we want to initialize 



class emp{
	int id;
	String name;
	String department;
	  static String Company;
	
	public emp(){
		id=123;
		name="Preeti";
		department="Makeup";
		System.out.println(name+" : "+id+ " : "+ department + " : ");
		
	}
	
	
	static {
		System.out.println(Company="Eteam");
	}
	
	public void print() {
		
	System.out.println(id+ " : "+ name +" : "+ department +" : "+ Company);
}}

public class Statickeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emp ep= new emp();
		ep.id=555;
		ep.name="Priya";
		ep.department="Testing";
		ep.Company="360 logica";
//		ep.print();
		
		emp ep1= new emp();
		ep1.id=557;
		ep1.name="Harsh";
		ep1.department="Testing";
		ep1.Company="Saksoft";
		ep.print();
		ep1.print();
		

	}

}
