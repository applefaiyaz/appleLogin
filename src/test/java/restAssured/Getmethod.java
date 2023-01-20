package restAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

public class Getmethod{
	
	//@Test(priority=1)
	public void getRequest() {
		
		//https://reqres.in/api/users/page=2&id=5
		given().
		pathParams("myPath","users")
		.queryParams("page",2)
		.queryParams("id",5)
		.when()
		.get("https://reqres.in/api/{myPath}")
		.then().statusCode(200).log().all();
		
		
	}
	
	
	@Test(priority=2)
	public void getCookies() {
		
		Response res=when().get("https://www.google.com/");
		
		
		//This will Get cookies value but no key
		
		//String cookiesValue=res.getCookie("AEC");
		//System.out.println("This is the Google Cookies =========>"+cookiesValue);
		
		//In-order to generate Key 
		
		Map<String,String>lsCookies=res.getCookies();
		
		// with this for loop we can iterate key and as well as cookies value
		
		for(String k:lsCookies.keySet()) {
			
			String pairofCookies=res.getCookie(k);
			System.out.println(k+"       "+pairofCookies);
		}
	}
	
	
}
