package com.example.demo.student;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table
public class Student {
	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1	
	)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
	)
	
	
	//fields
	private Long id;
	private String name;
	private String email;
	private LocalDate dob;
	@Transient //DB에 저장될 필요가 없는 값. dob로 계산가능하다.
	private Integer age;
	
	
	//constructors
	public Student() {
		super();
	}
	
	public Student(Long id, 
			String name, 
			String email, 
			LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	
	public Student(String name, 
			String email, 
			LocalDate dob) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	
	
	
	// getters & setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return Period.between(dob, LocalDate.now()).getYears();
		//나이를 이렇게 설정해주면 만나이로 계산된다.(생일이 지나야 +1 됨)
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id
					+ ", name=" + name
					+ ", email=" + email
					+ ", dob=" + dob
					+ ", age=" + age + "]";
	}
	
	
}
