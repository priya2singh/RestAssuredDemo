package Nov_java;


//1. Final keyword is applied to variable method, class 
//1. by using final keyword we can restrict the user to not change the variable value once it assigned
// 3. final method can not be overridden 
// 4. final class can not have subclass (can not be extends)
public class FinalKeyword {
	
	 final void m1() {
			System.out.println("PRIYA SINGH FINAL CLASS");
		}
	
	public static void main(String [] args) {
	
		final int x=5;
		System.out.println(x);
		FinalKeyword fk=new FinalKeyword();
		fk.m1();
		}
}

//class subclass extends FinalKeyword{
//	 final void m1() {
//			System.out.println("PREETI SINGH FINAL CLASS");
//		}
//}
//	class test{
//		public static void main(String [] args) {
//			
//			final int x=5;
//			System.out.println(x);
//		}
//	}

