package com.athenLib.dao;

import java.sql.SQLException;
import java.util.List;

import com.athenLib.model.Student;

public interface AthenaemDao {
	public String addStudent(Student student) throws SQLException;
	public List<Student> searchStudent(String stdId,String name,long contactNo);
	public List<Student> getallStudent();
	public List<Student> pendingFeeList();
	public void update(int stdId,String name,long contactNo);
	public String delete(int stdId);
	
	public String getAuthenticate();
}
