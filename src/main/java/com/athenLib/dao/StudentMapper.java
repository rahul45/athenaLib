package com.athenLib.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.athenLib.model.Student;
import com.athenLib.utils.AthenaemConstant.SHIFT;

public class StudentMapper implements RowMapper<Student> {
	 public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Student student = new Student();
	      student.setSerialId(rs.getString("std_id"));
	      student.setFirstName(rs.getString("firstname"));
	      student.setLastName(rs.getString("lastname"));
	      student.setFatherName(rs.getString("father_name"));
	      student.setDateOfJoining(rs.getDate("date_of_joining"));
	      student.setExpirationDate(rs.getDate("fee_expire_date"));
	      student.setFeeDeposit(rs.getBoolean("is_fee_deposit"));
	      student.setSeatNumber(rs.getInt("seat_number"));
	      student.setTypeOfProofId(rs.getString("type_of_proof_id"));
	      student.setContactNumber(rs.getString("contact_number"));
	      return student;
	   }
}
/*
create table student(std_id varchar(20) not null primary key,
firstname varchar(50) not null,
lastname varchar(50) ,
father_name varchar(50),
contact_number varchar(10) not null,
type_of_proof_id varchar(40),
shift_slot varchar(25) not null,
is_fee_deposit boolean default false,
date_of_joining date not null,
fee_expire_date date,
seat_number int not null*/