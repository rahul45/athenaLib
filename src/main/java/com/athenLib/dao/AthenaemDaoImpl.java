package com.athenLib.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.athenLib.model.Student;
import com.athenLib.utils.ObjectFactory;

public class AthenaemDaoImpl implements AthenaemDao {

	public String addStudent(Student student) throws SQLException {
		String response = null;
		try {
			response = ObjectFactory.getStudentJDBCTemplate().add(student);
		} catch (Exception e) {
			e.printStackTrace();
			response = "Not added in DB";
		}
		return response;
	}

	public List<Student> searchStudent(String stdId, String name, long contactNo) {
		List<Student> students = ObjectFactory.getStudentJDBCTemplate().getStudent(stdId, String.valueOf(contactNo)); 
		return students;
	}

	public List<Student> getallStudent() {
		List<Student> students = null;
		try {
			students = ObjectFactory.getStudentJDBCTemplate().listStudents();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}

	public List<Student> pendingFeeList() {
		return null;
	}

	public void update(int stdId, String name, long contactNo) {

	}

	public String delete(int stdId) {
		return null;
	}

	public String getAuthenticate() {
		return null;
	}

}
