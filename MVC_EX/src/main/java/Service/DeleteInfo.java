package Service;

import org.springframework.beans.factory.annotation.Autowired;

import StudentDao.StudentDao;
import StudentDo.StudentDo;


public class DeleteInfo {
	
	@Autowired
	private StudentDao studentDao;

//	public DeleteInfo(StudentDao studentDao) {
//	
//		this.studentDao = studentDao;
//	}
	
	public void delete(String Id) {
		if (verify(Id)) {
			studentDao.delete(Id);
		}
		else {
			System.out.println("Delete문 오류");
		}
	}
	
	public boolean verify(String sNum) {
		StudentDo student = studentDao.select(sNum);
		return student != null?true:false;
	}
}
