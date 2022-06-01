package Nov_java;

// 1 interface is completly abstract class  that is used to group releted method with empty body
// 2. Like abstract classes, interfaces cannot be used to create object
// 3. Interface methods do not have a body - the body is provided by the "implement" class
// 4. On implementation of an interface, you must override all of its methods
// 5. Interface methods are by default abstract and public
// 6. nterface attributes are by default public, static and final
// 7.An interface cannot contain a constructor (as it cannot be used to create objects)
// 8 imp: Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
// However, it can be achieved with interfaces, because the class can implement multiple interfaces.
// nested interface (interface under class , interface under interface )

interface ParentNew{
	
	final int a=0;
	static int v=0;
	int p=0;
    void  add();
    
    interface underparent{
    	void add();
    }
	
}

interface ChildNew{
	public void add();
}
public class Interface implements ParentNew, ChildNew, ParentNew.underparent {
	
	public void add() {
		System.out.println("Interited method is ");
		}
 public static void main(String [] args) {
	 Interface ic=new Interface();
	 ic.add();
 }
}
