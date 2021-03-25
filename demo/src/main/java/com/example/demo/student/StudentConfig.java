package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student mariam = new Student(
									1L, 
									"Mariam", 
									"mariam.jamal@gmail.com",
									LocalDate.of(2000, Month.JANUARY, 5),
									21
			);
			
			Student jannet = new Student(
									"Janet", 
									"Janet.jamal@gmail.com",
									LocalDate.of(2000, Month.AUGUST, 10),
									21
			);
			
			List<Student> list = new ArrayList<Student>();
			list.add(mariam);
			list.add(jannet);
			repository.saveAll(list);
		};
	}
}
