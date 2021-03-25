package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository 
	extends JpaRepository<Student, Long>{ 
	// jpa를 사용하기 위한 인터페이스. id(PK)가 long이므로 이와같이 설정한다.
}
