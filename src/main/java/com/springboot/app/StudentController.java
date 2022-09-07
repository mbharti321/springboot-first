package com.springboot.app;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("manish", "bharti");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Man1", "Bharti1"));
		students.add(new Student("Man2", "Bharti2"));
		students.add(new Student("Man3", "Bharti3"));
		students.add(new Student("Man4", "Bharti4"));
		students.add(new Student("Man5", "Bharti5"));
		students.add(new Student("Man6", "Bharti6"));
		
		return students;
	}
	
	
	//add @pathVariable annotation in order to access URL template path variable in java code
	@GetMapping("/student/{firstName}/{lastName}") //template path variables
	public Student studentPathVariable(@PathVariable("firstName") String fName, 
			@PathVariable("lastName") String lName) {
		return new Student(fName, lName);
	}
	
	//handling query parameter
	// ex: localhost://8080/student/query?firstName=Manish&lastName=Bharti
	// use @RequestParam to map query param with java function parameters
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam(name="firstName") String firstName, 
			@RequestParam(name="lastName") String lastName) {
		
		return new Student(firstName, lastName);
	}
}
