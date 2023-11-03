package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.dao.StudentDao;
import com.project.entities.Student;

@Controller
public class HomeController {
	
	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping("/home")
	public String home(Model model) {
		List<Student> list = studentDao.getAllStudent();
		model.addAttribute("stdlist",list);
		return "home";
	}
	
	@RequestMapping("/addstudent")
	public String addstudent() {
		return "addstudent";
	} 
	
	@RequestMapping(path="/createstd",method=RequestMethod.POST)
	public String createstudent(@ModelAttribute Student std,HttpSession session) {
		System.out.println(std);
		int i =  studentDao.saveStudent(std);
		session.setAttribute("msg", "Register Sucessfully!!");
		return "redirect:/addstudent";
	} 
	
	@RequestMapping(path="/edit_std/{id}")
	public String editStudent(@PathVariable int id, Model model) {
		Student student = studentDao.getStudentById(id);
		model.addAttribute("std", student);
		return "edit_std";
	}
	
	@RequestMapping(path="/updatestd",method=RequestMethod.POST)
	public String updateStuddent(@ModelAttribute Student student,HttpSession session){
		studentDao.update(student);
		session.setAttribute("msg","Student's details update sucessfull!!");
		return "redirect:/home";
	}
	
	@RequestMapping(path="/delete_std/{id}")
	public String deleteStudent(@PathVariable int id, HttpSession session) {
		studentDao.deleteStudent(id);
		session.setAttribute("msg", "Student delete sucessfully");
		return "redirect:/home";
	}
}












