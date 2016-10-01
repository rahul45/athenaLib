package com.athenLib.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.athenLib.model.Student;

public class StudentJDBCTemplate {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	// Add Student
	public String add(Student student) {
		String SQL = "insert into Student(std_id,firstname,lastname,father_name,contact_number,type_of_proof_id,"
				+ "shift_slot,is_fee_deposit," + "date_of_joining,fee_expire_date,"
				+ "seat_number) values (?,?,?,?,?,?,?,?,?,?,?)";

		String source = "2008-04-05";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = null;
		try {
			date = format.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jdbcTemplateObject.update(SQL, student.getSerialId(), student.getFirstName(), student.getLastName(),
				student.getFatherName(), student.getContactNumber(), student.getTypeOfProofId(),
				student.getSlot().name(), student.isFeeDeposit(), date, student.getExpirationDate(),
				student.getSeatNumber());

		System.out.println("Created Record Name = " + student.getFirstName() + " Serial id = " + student.getSerialId());
		return "Created Record Name = " + student.getFirstName() + " Serial id = " + student.getSerialId();
	}/*
		 * create table student(std_id varchar(20) not null primary key,
		 * firstname varchar(50) not null, lastname varchar(50) , father_name
		 * varchar(50), contact_number varchar(10) not null, type_of_proof_id
		 * varchar(40), shift_slot varchar(25) not null, is_fee_deposit boolean
		 * default false, date_of_joining date not null, fee_expire_date date,
		 * seat_number int not null
		 */

	public List<Student> getStudent(String stdId,String contact) {
		List<Student> students=null;
		if(stdId != null){
		String SQL = "select * from athenaeum_db.student where  std_id = ?";
		students = jdbcTemplateObject.query(SQL, new Object[]{stdId}, new StudentMapper());
		return students;
		}
		String SQL = "select * from Student where  contact_number = ?";
		students = jdbcTemplateObject.query(SQL, new Object[]{contact}, new StudentMapper());
		return students;
	}

	public List<Student> listStudents() throws SQLException {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}

	public void delete(Integer id) {
		String SQL = "delete from Student where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	public void update(Integer id, Integer age) {
		String SQL = "update Student set age = ? where id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);
		return;
	}

}
