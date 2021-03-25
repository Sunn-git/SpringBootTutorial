package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
	
	@GetMapping
	public List<Student> getStudents() {
		List<Student> list = new ArrayList<Student>();

		list.add(
				new Student(
							1L, 
							"Mariam", 
							"mariam.jamal@gmail.com",
							LocalDate.of(2000, Month.JANUARY, 5),
							21
				)
		);
		
		return list;
	}
	
}
