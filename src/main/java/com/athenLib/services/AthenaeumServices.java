package com.athenLib.services;

import java.util.List;

import com.athenLib.model.Student;

public interface AthenaeumServices {
	public String addStudent(Student student);
	public List<Student> searchStudent(String stdId,String name,long contactNo);
	public List<Student> getallStudent();
	public List<Student> pendingFeeList();
	public void update(int stdId,String name,long contactNo);
	public String delete(int stdId);
}
