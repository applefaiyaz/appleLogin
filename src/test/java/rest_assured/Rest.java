package rest_assured;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.apache.http.entity.mime.content.ContentBody;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Rest {
	
	@Test
	public void rest_assured() {
		
	Response res=RestAssured.given().baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body("{\n"
			+ "    \"name\": \"Sameer\",\n"
			+ "    \"job\": \"Ali\"\n"
			+ "}").post();
	System.out.println(res.getStatusCode());
	
		
	}

}
