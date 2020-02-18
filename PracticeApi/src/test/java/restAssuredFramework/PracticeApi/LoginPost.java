package restAssuredFramework.PracticeApi;

import static io.restassured.RestAssured.*;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class LoginPost {

	static String ROOT_URI;
	Response res;
	String json;
	JsonPath jsonpath;
	Object tokenResponse;
	
	

	public void getPostUrl() {

		RestAssured.baseURI = "http:/"
				+ "localhost:8080";
		RestAssured.basePath = "/auth/login";

	}

	
	public void postAPI() {

		res = given().auth().basic("test","1234").contentType(ContentType.JSON).when().post();
		

	}
	
	public void validateResponse()
	{
		json = res.asString();
		jsonpath = new JsonPath(json);
		tokenResponse= jsonpath.get("token");
		
		Assert.assertEquals(200, res.getStatusCode());
	  //  res.then().body("employee_name",equals("Tiger Nixon"));
		System.out.println(tokenResponse);
		System.out.println("asdsfsd");
	}

}
