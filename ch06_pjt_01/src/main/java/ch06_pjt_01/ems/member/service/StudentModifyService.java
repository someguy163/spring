package ch06_pjt_01.ems.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch06_pjt_01.ems.member.Student;
import ch06_pjt_01.ems.member.dao.StudentDAO;

public class StudentModifyService {

@Autowired
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
