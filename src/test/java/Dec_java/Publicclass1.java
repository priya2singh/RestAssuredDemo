package Dec_java;

import Nov_java.Publicclass;

public class Publicclass1  extends Publicclass{

	public void M2(){
		System.out.println("M2 method ");
		}
	
	public static void main(String [] args)
	{
		Publicclass pc=new Publicclass();
		pc.M1();
		Publicclass1 pc3=new Publicclass1();
	     pc3.M12();// access protected method which is acessible from child class of ouside package 
		
		Publicclass1 pc1=new Publicclass1();
		pc1.M2();
		
		NewMethod1 nm=new NewMethod1();
		nm.fun();
	   nm.fun2();
		
		}
	}
