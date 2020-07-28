package maven2;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class test2 {
	
	@Test
	public void Test1 () {
		baseURI = "https://reqres.in";
		given().get("/api/users").
		then().statusCode(200).log().all();	}
	
	
	

}
