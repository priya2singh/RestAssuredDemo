package FeatureFile;

import File.payload;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

public class Reusablemethod {

	public static JsonPath rawtojson(String Responce) {
		 JsonPath js=new JsonPath(Responce);
		 return js;
	
	}
	
	
public static void main(String [] args) {
	
		JsonPath js=new JsonPath(payload.Courseprice());

		//1. Print No of courses returned by API
		System.out.println("Print No of courses returned by API");
		int count=js.getInt("courses.size()");
		System.out.println(count);
		
		//2. Print Purchase Amount
		System.out.println("Print Purchase Amount");
		int amount= js.getInt("dashboard.purchaseAmount");
		System.out.println(amount);
		
		//3. Print Title of the first course
		System.out.println("Print Title of the first course");
		String title=js.getString("courses.title[0]");
		System.out.println(title);

		//4. Print All course titles and their respective Prices
		System.out.println("Print All course titles and their respective Prices ");
		for(int i=0; i<count;i++) {
			String title1=js.getString("courses["+i+"].title");
			System.out.println(title1);
			String Price=js.getString("courses["+i+"].price");
			System.out.println(Price);
		}
		
		
		//5. Print no of copies sold by RPA Course
		System.out.println("Print no of copies sold by RPA Course");
		for(int i=0;i<count;i++) {
			String title2=js.getString("courses["+i+"].title");
			if(title2.equalsIgnoreCase("RPA")) {
				String Copiessold=js.getString("courses["+i+"].copies");
				System.out.println(Copiessold);
				break;
			}		
		}
		
//		String Copiessold=js.getString("courses.copies[2]");
//		System.out.println(Copiessold);

		//6. Verify if Sum of all Course prices matches with Purchase Amount
		System.out.println("Verify if Sum of all Course prices matches with Purchase Amount");
		int sum=0;
		for(int i=0;i<count;i++) {
			int Price=js.getInt("courses["+i+"].price");
			System.out.println(Price);
			int Copie=js.getInt("courses["+i+"].copies");
			System.out.println(Copie);
			 sum= sum+ Price*Copie;
		}
		System.out.println(sum);
		Assert.assertEquals(sum, amount);
	}
}
