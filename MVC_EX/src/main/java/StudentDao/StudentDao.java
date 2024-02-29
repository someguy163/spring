package StudentDao;

import java.util.HashMap;
import java.util.Map;

import StudentDo.StudentDo;

public class StudentDao {

	
	private Map<String, StudentDo> studentInfo = new HashMap<String , StudentDo>();
	
	public StudentDo select(String iD) {
		return studentInfo.get(iD);
	}
	public void insert(StudentDo studentDo) {
		studentInfo.put(studentDo.getId(), studentDo);
	}
	public void delete(String Id) {
		studentInfo.remove(Id);
	}
	public void update(StudentDo studentDo) {
		studentInfo.put(studentDo.getId(), studentDo);
	}
	public Map<String , StudentDo> allSelect() {
		return studentInfo;
	}
	
}
