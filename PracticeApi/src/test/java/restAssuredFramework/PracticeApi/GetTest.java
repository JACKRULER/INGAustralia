package restAssuredFramework.PracticeApi;

import static io.restassured.RestAssured.*;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class GetTest {
	
	@Test
	public void testResponseCode()
	{
	//Response resp = RestAssured.get(" http://dummy.restapiexample.com/api/v1/employees");
//	Response resp = get(" http://dummy.restapiexample.com/api/v1/employees");
//	System.out.println("Answer is : " +resp);
//	int code =resp.getStatusCode();
//	System.out.println("Status code is :" + code);
//	Assert.assertEquals(code, 200);
		
		int code = get(" http://dummy.restapiexample.com/api/v1/employees").getStatusCode();
		System.out.println("Status code is :" + code);
	
	
}
	@Test
	public void testStringResponse()
	{
		//Response resp = RestAssured.get(" http://dummy.restapiexample.com/api/v1/employees");
		Response resp = get(" http://dummy.restapiexample.com/api/v1/employees");
		String response = resp.asString();
		System.out.println("Response from the resp" + response);
		
	}


}


