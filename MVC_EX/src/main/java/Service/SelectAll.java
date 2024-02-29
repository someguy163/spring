package Service;

import java.util.Map;

import StudentDao.StudentDao;
import StudentDo.StudentDo;


public class SelectAll {

	private StudentDao studentDao;

	public SelectAll(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	public Map<String, StudentDo> allSelect() {
		return studentDao.allSelect();
	}
	
}
