package ch06_pjt_01.ems.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import ch06_pjt_01.ems.member.Student;
import ch06_pjt_01.ems.member.dao.StudentDAO;

public class PrintStudentInformationService {

	
	StudentAllSelectService allSelectService;


	
	public PrintStudentInformationService(StudentAllSelectService allSelectService) {
		super();
		this.allSelectService = allSelectService;
	}




	public void printStudensInfo() {
		Map<String, Student> allStudents = allSelectService.allSelect();
		Set<String> keys =allStudents.keySet();
		
		Iterator<String> iterator = keys.iterator();
		System.out.println("Students List Start -------");
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			Student student = allStudents.get(key);
			
			System.out.print("sNum : " + student.getsNum() +"\t" );
			System.out.print("sId : " + student.getsId() +"\t" );
			System.out.print("sPw : " + student.getsPw() +"\t" );
			System.out.print("sName : " + student.getsName() +"\t" );
			System.out.print("sAge : " + student.getsAge()  +"\t");
			System.out.print("sGender : " + student.getsGender()  +"\t");
			System.out.println("sMajor : " + student.getsMajor()  );
			
		}
		System.out.println("END-------");
	}
	
	
}
