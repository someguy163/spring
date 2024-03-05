package Service;

import org.springframework.beans.factory.annotation.Autowired;

import StudentDao.StudentDao;
import StudentDo.StudentDo;


public class UpdateInfo {
@Autowired
	private StudentDao studentDao;

//	public UpdateInfo(StudentDao studentDao) {
//		this.studentDao = studentDao;
//	}
	
	public void update(StudentDo studentDo) {
		if (veify(studentDo.getId())) {
			studentDao.update(studentDo);
		}
		else {
			System.out.println("Update구문 오류");
		}
	}
	
	public boolean veify(String Id) {
		StudentDo student = studentDao.select(Id);
		return student != null?true:false;
	}

}
