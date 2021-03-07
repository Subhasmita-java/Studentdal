package com.subha.studentdal.repos;

import org.springframework.data.repository.CrudRepository;

import com.subha.studentdal.entities.StudentModel;

public interface StudentRepository extends CrudRepository<StudentModel, Long> {

}
