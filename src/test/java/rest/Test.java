package rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test {
	
	@org.testng.annotations.Test
	public void test_01() {
		//specific base uri
		RestAssured.baseURI="https://www.bbc.co.uk/weather";
		//send request
		RequestSpecification request=RestAssured.given();
		//Response request
		Response response=request.request(Method.GET,"/ig4");
	String body=	response.getBody().toString();
	System.out.println("This is the actual resposne"+" "+body);
	int a=response.getStatusCode();
	System.out.println(a);
		
	}
	

}
