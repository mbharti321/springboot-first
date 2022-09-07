package com.springboot.app;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//@Controller    // in order to make this hello world class as spring MVC class
//@ResponseBody  // for json resonse from API, 
//			  // it uses HTTP message converter to convert return value to HTTP response body
@RestController //substitute for both the above import
public class HelloWorldController {
	// GET HTTP method
	
	
	@GetMapping("/") //in order to map this function to get method
	public String welcome() {
		return "Welcome to first springboot app!";
	}
//	localhost://8080/hello-world
	@GetMapping("/hello-world")
	public String helloWorldGreetings() {
		return "Hello world! how are you?";
	}
}
