package ch04_pjt_01.ems.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch04_pjt_01.ems.member.Student;

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
			
			System.out.println("sNum : " + student.getsNum() );
			System.out.println("sId : " + student.getsId() );
			System.out.println("sPw : " + student.getsPw() );
			System.out.println("sName : " + student.getsName() );
			System.out.println("sAge : " + student.getsAge() );
			System.out.println("sGender : " + student.getsGender() );
			System.out.println("sMajor : " + student.getsMajor() );
			
		}
		System.out.println("END-------");
	}
	
	
}
