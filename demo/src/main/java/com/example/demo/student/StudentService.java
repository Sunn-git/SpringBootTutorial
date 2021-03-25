package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
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
