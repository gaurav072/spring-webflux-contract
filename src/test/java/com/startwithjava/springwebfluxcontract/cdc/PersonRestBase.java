package com.startwithjava.springwebfluxcontract.cdc;
import com.startwithjava.springwebfluxcontract.SpringWebfluxContractApplication;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT,classes = SpringWebfluxContractApplication.class)
public abstract class PersonRestBase {
	@LocalServerPort
	int port;

	@Before
	public void setup() {
		RestAssured.baseURI = "http://localhost:" + this.port;
	}
	
}
