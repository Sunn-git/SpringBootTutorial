package com.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository 
	extends JpaRepository<Student, Long>{ 
	// jpa를 사용하기 위한 인터페이스. id(PK)가 long이므로 이와같이 설정한다.
	
	@Query("SELECT s FROM Student s WHERE s.email= ?1")
	Optional<Student> findStudentByEmail(String email);
}
