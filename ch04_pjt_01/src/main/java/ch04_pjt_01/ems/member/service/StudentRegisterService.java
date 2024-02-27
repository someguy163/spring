package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;

public class StudentRegisterService {

	private StudentDAO studentDAO;

	public StudentRegisterService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public void register(Student student) {
		if (verify(student.getsNum())) {
			studentDAO.insert(student);
		}
		else {
			System.out.println("The student has already registered");
		}
	}
	
	public boolean verify(String sNum) {
		Student student = studentDAO.select(sNum);
		return student == null?true:false;
	}
	
	
}
