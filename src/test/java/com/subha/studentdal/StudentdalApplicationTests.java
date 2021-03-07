package com.subha.studentdal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.subha.studentdal.entities.StudentModel;
import com.subha.studentdal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	@Autowired
	StudentRepository stdRepo;

	@Test
	public void testCreateStudent() {
		StudentModel student = new StudentModel();
		student.setName("Srikant");
		student.setCourse("Networking");
		student.setSfee(30d);
		
		stdRepo.save(student);
	}
	
	@Test
	public void testFindStudent() {
		Optional<StudentModel> Student = stdRepo.findById(1l);
		System.out.println(Student);
	}
	
	@Test
	public void testUdateStudent() {
		StudentModel student = stdRepo.findById(1l).get();
		student.setSfee(300l);
		stdRepo.save(student);
	}
	
	@Test
	public void testDeleteStudent() {
		StudentModel student = stdRepo.findById(1l).get();
		stdRepo.delete(student);
	}
}
