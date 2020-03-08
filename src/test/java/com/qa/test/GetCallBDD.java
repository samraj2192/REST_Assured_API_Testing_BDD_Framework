package com.qa.test;

import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCallBDD {

	@Test
	public void testNumberOfCircuits_2017() {
//		given().
//		when().
//		then().
//		assert().
		
		given().
		
		when().get("https://ergast.com/api/f1/2018/circuits.json").
		
		then().
		
		assertThat().
		
		body("MRData.CircuitTable.Circuits.circuitId", hasSize(21)).
		
		and().
		
		header("Content-Length", equalTo("4739"));
				
	}

}
