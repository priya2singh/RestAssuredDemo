package Nov_java;

//1. if one task is performed in diffrent ways it is polymorphisum  we use overloading and overriding to achive this.
//2. polymorphism is to display massage in diffrent ways 
//3. Compiletime polymorphsm(overloading) it is also static polymorphsm it is achived by function overloading , runtime polymorphsm (overriding)
//4. we can not override final method 
// overriden method have same return type 
// private method can not overriden 




class New{
	public void marry() {
		System.out.println("Marry to priya");
	}
}


public class Polymorphism extends New {
	
	public String bird(String voice)
	{
		return voice;
	}
	

	public int bird(int age) {
		return age;
	}
	
	public void marry() {
		System.out.println("Marry to priyanka");
	}
	public static void main(String [] args) {
		Polymorphism pm=new Polymorphism();
		String x=pm.bird("Chee chee");
		int y=pm.bird(1);	
		System.out.println(x + y);
		pm.marry();
		New m=new New();
		m.marry();
		New m1=new Polymorphism();
		m1.marry();
		
		
	}

}
