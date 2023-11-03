package com.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.entities.Student;

@Repository
public interface StudentDao {
	public int saveStudent(Student student);
	public Student getStudentById(int id);
	public List<Student> getAllStudent();
	public void update(Student student);
	public void deleteStudent(int id);
}
