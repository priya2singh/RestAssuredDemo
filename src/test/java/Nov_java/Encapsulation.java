package Nov_java;


//1. binding data and member function into single unite is encapsulation
//2. if component follows data hiding and abstraction then these component said to be encapsulation 
//3. hiding data behind method is concept of encapsulation 

public class Encapsulation {

	private String name;
	
	public String GetName() {
		return name;
	}
	
	public void SetName(String newname) {
		this.name=newname;
	}
	
	public static void main(String [] args) {
		Encapsulation ec=new Encapsulation();
		ec.SetName("Priya");
		System.out.println(ec.GetName());

	}
	
}
