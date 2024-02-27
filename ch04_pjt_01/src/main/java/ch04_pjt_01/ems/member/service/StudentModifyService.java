package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;

public class StudentModifyService {

	
	private StudentDAO studentDAO;

	public StudentModifyService(StudentDAO studentDAO) {
	
		this.studentDAO = studentDAO;
	}
	
	public void modify(Student student) {
		if (verify(student.getsNum())) {
			studentDAO.update(student);
		}
		else {
			System.out.println("Student inforation is available");
		}
	}
	
	public boolean verify(String sNum) {
		Student student = studentDAO.select(sNum);
		return student != null?true:false;
		
	}
	
	
}
