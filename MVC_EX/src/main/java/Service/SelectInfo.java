package Service;

import StudentDao.StudentDao;
import StudentDo.StudentDo;


public class SelectInfo {

	
	private StudentDao studentDao;

	public SelectInfo(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	
	public StudentDo select(String ID) {
		if (verify(ID)) {
			return studentDao.select(ID);
		}
		else {
			System.out.println("select 구문 오류");
		}
		return null;
		
	}
	
	private boolean verify(String iD) {
		StudentDo student = studentDao.select(iD);
		return student !=null ? true : false;
	}
	
}
