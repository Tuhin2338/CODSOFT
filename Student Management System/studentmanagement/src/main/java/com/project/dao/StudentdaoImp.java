package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.entities.Student;

@Repository
public class StudentdaoImp implements StudentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveStudent(Student student) {
		int i = (Integer) hibernateTemplate.save(student);
		return i;
	}

	public Student getStudentById(int id) {
		Student student = hibernateTemplate.get(Student.class,id);
		return student;
	}

	public List<Student> getAllStudent() {
		List<Student> list = hibernateTemplate.loadAll(Student.class);
		return list;
	}

	@Transactional
	public void update(Student student) {
		hibernateTemplate.update(student);
		
	}
	
	@Transactional
	public void deleteStudent(int id) {
		Student student = hibernateTemplate.get(Student.class,id);
		hibernateTemplate.delete(student);
		
	}
	
}
