package Service;

import StudentDao.StudentDao;
import StudentDo.StudentDo;

public class InsertInfo {

	
	private StudentDao studentDao;

	public InsertInfo(StudentDao studentDao) {
	
		this.studentDao = studentDao;
	}
	
	public void insert(StudentDo studentDo) {
		if (verify(studentDo.getId())) {
			studentDao.insert(studentDo);
		}
		else {
			System.out.println("insert구문 오류");
		}
	}
	public boolean verify(String Id) {
		StudentDo student = studentDao.select(Id);
		return student == null?true:false;
	}
	
	
}
