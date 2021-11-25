package com.example.demo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/users")
@Api(value="userManagement", description="Operations pertaining to users in User Management Store")
public class Controller {
	
	@Autowired
	Repository repository;
	
	@Bean
	RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	@PostConstruct
	public void init()
	{
		User user1 = new  User(1, "Madhu", "abc@abc", 100);
		repository.save(user1);
		//User user1 = new 
	}
	
	//@PostMapping
	@RequestMapping( method = RequestMethod.POST)
	 @ApiOperation(value = "Add a User")
	public User post(@RequestBody User user)
	{
		
		repository.save(user);
		return user;
		
	}
	

	@RequestMapping(value = "/user/{id}", method= RequestMethod.GET)
	@ApiOperation(value = "Get a User", response = User.class)
	public User getUser(@PathVariable int id)
	{
		return repository.findById(id).orElse(new  User(1, "Madhu", "abc@abc", 100));
		//return null;
		
	}
	
	@RequestMapping(value = "/all", method= RequestMethod.GET)
	@ApiOperation(value = "View a list of available Users", response = Iterable.class)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	public List<User> getUser()
	{
		return repository.findAll();
		//return null;
		
	}

}
