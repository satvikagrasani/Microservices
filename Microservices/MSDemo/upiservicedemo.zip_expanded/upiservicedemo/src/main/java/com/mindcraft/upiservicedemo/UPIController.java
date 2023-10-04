package com.mindcraft.upiservicedemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/upi")
public class UPIController {
	
	@Autowired
	RestTemplate template;
	
	@GetMapping(path = "/getBalance", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object >upicheckBalance(){
		//GET: getForObject, POST: postForObject, PUT: putForObject
		Map<String, Object> map = template.getForObject("http://ACCOUNT-SERVICE/api/account/balance", HashMap.class);
		//you will get a JSON like {"balance":60000} -> map
		map.put("name","UPI App");
		return map;
	}
	
}
