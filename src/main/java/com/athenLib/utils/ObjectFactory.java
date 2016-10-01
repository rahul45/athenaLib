package com.athenLib.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.athenLib.dao.AthenaemDao;
import com.athenLib.dao.AthenaemDaoImpl;
import com.athenLib.dao.StudentJDBCTemplate;

public class ObjectFactory {
	@Autowired
	private static AthenaemDao athenaemDao;

	public static AthenaemDao getAthenaemDao() {
		return new AthenaemDaoImpl();
	}

	public static StudentJDBCTemplate getStudentJDBCTemplate() {
		final ApplicationContext context = new ClassPathXmlApplicationContext("athenaeumJdbc.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentTempl");
		return studentJDBCTemplate;
	}
}
