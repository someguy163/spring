package ch04_pjt_01.ems.member.service;

import java.util.Map;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;

public class StudentAllSelectService {

	private StudentDAO studentDAO;

	public StudentAllSelectService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Map<String , Student> allSelect() {
		return studentDAO.getStudentDB();
	}
	
}
