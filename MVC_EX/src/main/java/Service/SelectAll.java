package Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import StudentDao.StudentDao;
import StudentDo.StudentDo;


public class SelectAll {
@Autowired
	private StudentDao studentDao;

//	public SelectAll(StudentDao studentDao) {
//		this.studentDao = studentDao;
//	}
	public Map<String, StudentDo> allSelect() {
		return studentDao.allSelect();
	}
	
}
