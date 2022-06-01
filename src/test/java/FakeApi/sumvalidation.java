package FakeApi;

import org.testng.annotations.Test;

import File.payload;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

public class sumvalidation {
	@Test
	public void sumverify()
{
		
		JsonPath js=new JsonPath(payload.Courseprice());
		int count=js.getInt("courses.size()");
		System.out.println(count);
		System.out.println("Print Purchase Amount");
		int amount= js.getInt("dashboard.purchaseAmount");
		System.out.println(amount);
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
