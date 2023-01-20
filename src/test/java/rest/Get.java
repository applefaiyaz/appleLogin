package rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class Get {
	
	@Test
	public void rest() {
		
		
		JSONObject request=new JSONObject();
		request.put("Faisal", "linda");
		
		//given().get("https://reqres.in/api/users?page=2").
		given().
		body(request.toJSONString()).when().put("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
	
		
		

		
		
	}

}
