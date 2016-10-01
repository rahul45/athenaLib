package com.athenLib.services;

import java.sql.SQLException;
import java.util.List;

import com.athenLib.model.Student;
import com.athenLib.utils.AthenaemConstant.SHIFT;
import com.athenLib.utils.ObjectFactory;

public class AthenaeumServicesImpl implements AthenaeumServices {

	public String addStudent(Student student) {
		String response = null;
		try {
			response = ObjectFactory.getAthenaemDao().addStudent(student);
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	public List<Student> searchStudent(String stdId, String name, long contactNo) {
		List<Student> students = null;
		try {
			students = ObjectFactory.getAthenaemDao().searchStudent(stdId, null, contactNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

	public List<Student> getallStudent() {
		List<Student> students = null;
		try {
			students = ObjectFactory.getAthenaemDao().getallStudent();
		} catch (Exception e) {
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

	/* Test case for this particular application */
	public static void main(String[] args) {

		AthenaeumServices athenaeumServices = new AthenaeumServicesImpl();
		// System.out.println("Response:::" +
		// athenaeumServices.addStudent(getStudent()));
		/*for (Student s : athenaeumServices.getallStudent()) {
			System.out.println(s.toString());
		}*/
		for (Student s : athenaeumServices.searchStudent("ATH01", null,0)) {
			System.out.println(s.toString());
		}
	}

	private static Student getStudent() {
		Student s = new Student();
		s.setSerialId("AT01");
		s.setContactNumber("7710052962");
		s.setFirstName("Rahul");
		s.setLastName("Singh");
		s.setExpirationDate(null);
		s.setFatherName("Surendra");
		s.setSeatNumber(12);
		s.setFeeDeposit(true);
		s.setSlot(SHIFT.EVENING);
		s.setTypeOfProofId("voter");
		return s;
	}

}
