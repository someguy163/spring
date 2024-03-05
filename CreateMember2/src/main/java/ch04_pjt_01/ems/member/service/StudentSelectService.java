package ch04_pjt_01.ems.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;

public class StudentSelectService {

	@Autowired
	private StudentDAO studentDAO;

//	public StudentSelectService(StudentDAO studentDAO) {
//		this.studentDAO = studentDAO;
//	}
	
	public Student select(String sNum) {
		if (verify(sNum)) {
			return studentDAO.select(sNum);
		}
		else {
			System.out.println("Student information is available");
		}
		return null;
	}

	private boolean verify(String sNum) {
		Student student = studentDAO.select(sNum);
		return student !=null ? true : false;
	}
	
	
	
}
