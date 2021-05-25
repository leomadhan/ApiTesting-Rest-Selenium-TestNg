import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Request {
	
	@Test
	public void getSpacexLaunchDetails() {
		//base URL
		RestAssured.baseURI="https://api.spacexdata.com/v4/launches/latest";
		
		//Request object
		RequestSpecification httpreuqest=RestAssured.given();
		
		//Response object
		Response response=httpreuqest.request(Method.GET);
		
		//Print response		
		String responseBody=response.getBody().asString();
		System.out.println("Response body:"+responseBody);
		
		int responseStatusCode=response.getStatusCode();
		System.out.println("Response Status code:"+responseStatusCode);
		Assert.assertEquals(responseStatusCode, 200);
		
		String responseStatusLine=response.getStatusLine();
		System.out.println("Response Status line:"+responseStatusLine);
		Assert.assertEquals(responseStatusLine, "HTTP/1.1 200 OK");
	}

}
