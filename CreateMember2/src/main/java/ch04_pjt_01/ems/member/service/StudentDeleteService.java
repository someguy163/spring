package ch04_pjt_01.ems.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;

public class StudentDeleteService {
	@Autowired
	private StudentDAO studentDAO;

//	public StudentDeleteService(StudentDAO studentDAO) {
//	
//		this.studentDAO = studentDAO;
//	}
	
	public void delect(String sNum) {
		if (verify(sNum)) {
			studentDAO.delete(sNum);
		}
		else {
			System.out.println("Student information is available");
		}
	}
	
	public boolean verify(String sNum) {
		Student student = studentDAO.select(sNum);
		return student != null?true:false;
	}
	
	
}
