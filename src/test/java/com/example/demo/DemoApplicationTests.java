package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {
//	public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

	@LocalServerPort
	int randonServerPort;
	
	@Autowired
	WebApplicationContext webapp;
	
	@Autowired
	RestTemplate restTemplate;
	
	 private MockMvc mockMvc;
	 
	 @BeforeEach
	 public void seup()
	 {
		 mockMvc = MockMvcBuilders.webAppContextSetup(webapp).build();
	 }
	
	/*
	 * @MockBean Object object;
	 */
	
	//Mockito.when(kmsHelper.encrypt(argumentMatchers.any())).thenReturn("xxx";)
	
	@Test
	public void testSuccessPost() throws Exception
	{
		User user = new User(1, "madhu","abc@abc",100);
		String baseUrl = "http://localhost:"+ randonServerPort+"/users";
		ResponseEntity<User> userRes = restTemplate.postForEntity(baseUrl, user, User.class);
		User userFinal = userRes.getBody();
		assertEquals(user.getUserName(), userFinal.getUserName());
		
		mockMvc.perform(post("/users").contentType(MediaType.APPLICATION_JSON)
        .content(asJsonString(user))).andExpect(MockMvcResultMatchers.jsonPath("$.id").exists());
		
	}

	private String asJsonString(User user) throws JsonProcessingException {
		// TODO Auto-generated method stub
		ObjectMapper obj = new ObjectMapper();
		return obj.writeValueAsString(user);
	}
	
	

}
