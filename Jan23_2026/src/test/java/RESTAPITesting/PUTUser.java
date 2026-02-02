package RESTAPITesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
 
import io.restassured.http.ContentType;
 
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
 
 
 
public class PUTUser {
  @Test
  public void postuser() {
	  baseURI = "https://api.restful-api.dev";
	  JSONObject data=new JSONObject();
	  data.put("year", 2019);
	  data.put("price", 20000.00 );
	  data.put("CPU model", "Intel Core i7");
	  data.put("Hard disk size","512 GB");
	  
	  JSONObject reqbody=new JSONObject();
	  reqbody.put("name", "Apple MacBook Pro 16");
	  reqbody.put("data",data);
	  given()
	  .contentType(ContentType.JSON)
	  .body(reqbody.toString())
	  .when()
	  .put("/objects/ff8081819782e69e019c12413b263049")
	  .then()
	  .statusCode(200)
	  .log().all();
  }
  
  
  
}
