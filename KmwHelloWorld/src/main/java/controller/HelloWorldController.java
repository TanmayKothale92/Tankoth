package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	@RequestMapping(value="/Welcome",method = RequestMethod.GET)
	public String hello(){
		return "Hello world!!!";
		
	}

}
