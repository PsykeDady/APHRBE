package co.psyke.aphr.integration;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

import co.psyke.aphr.entitites.Employee;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EmployeeAPITest {

	private MockMvc mockMvc;

	public static String writeObject(Object o) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writerWithDefaultPrettyPrinter();
		try {
			return ow.writeValueAsString(o);
		} catch ( JsonProcessingException je){
			return String.format("""
					{
						"error":"%s",
						"stack":"%s"
					}
					""",je.getMessage(),je.getStackTrace().toString().substring(0, 100));
		}
	}

	@Test
	@Order(1)
	void addUsers() throws Exception{
		mockMvc.perform(
			MockMvcRequestBuilders
				.post("/employee")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(writeObject(new Employee(null,"Psyke")))
		).andExpect(MockMvcResultMatchers.status().isOk());
	}


	
}
