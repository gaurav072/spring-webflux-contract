package com.startwithjava.springwebfluxcontract.cdc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class PersonRestBase {

	@Before
	public void setup() {
		RestAssured.baseURI = "http://localhost:9500";
	}
	
}
