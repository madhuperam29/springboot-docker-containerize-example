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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
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
	
	@PostMapping
	public User post(@RequestBody User user)
	{
		
		repository.save(user);
		return user;
		
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id)
	{
		return repository.findById(id).orElse(new  User(1, "Madhu", "abc@abc", 100));
		//return null;
		
	}
	
	@GetMapping("/all")
	public List<User> getUser()
	{
		return repository.findAll();
		//return null;
		
	}

}
