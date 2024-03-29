package Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import StudentDo.StudentDo;

public class AllStudentPrint {

	@Autowired
	SelectAll selectAll;

//	public AllStudentPrint(SelectAll selectAll) {
//		this.selectAll = selectAll;
//	}

	public void AllStudentInfo() {
		Map<String, StudentDo> allstudent = selectAll.allSelect();
		Set<String> Keys = allstudent.keySet();
		Iterator<String> iterator = Keys.iterator();
		
		System.out.println("학생 출력");
		
		while (iterator.hasNext()) {
			String keys = iterator.next();
			StudentDo studentDo = allstudent.get(keys);
			
			System.out.print("Id : " + studentDo.getId() + "\t");
			System.out.print("pwd : " + studentDo.getPw() + "\t");
			System.out.print("phones : " + studentDo.getPhone() + "\t");
			System.out.print("eMail : " + studentDo.geteMail() + "\t");
			System.out.print("joinDates : " + studentDo.getJoinDate() + "\t");
			System.out.println("lastDates : " + studentDo.getLastDate() + "\t");
		}
		System.out.println("모든 회원 출력 종료");
	}

}
