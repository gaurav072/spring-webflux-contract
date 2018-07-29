package contracts.person.rest;

import org.springframework.cloud.contract.spec.Contract
Contract.make {
	description "Get Person Object"
	request {
	  method GET()
	  url value("/person/")
	  headers {
		contentType(applicationJson())
		header('''Accept''', '''application/json''')
    }
  }
  response {
    status 200
    bodyMatchers{
      jsonPath('$.id', byType())
      jsonPath('$.name', byType())

    }
    headers { contentType(applicationJson()) }
    body (''' {
	  "id": 1,
	  "name": "Raj"
  }''')
  }
}