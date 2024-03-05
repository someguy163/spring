package Service;

import org.springframework.beans.factory.annotation.Autowired;

import InfoDao.InfoDao;
import InfoDo.InfoDo;


public class InfoInsert {
	@Autowired
	private InfoDao infodao;
	
	public void insert(InfoDo infoDo) {
		if (verify(infoDo.getCharts())) {
			infodao.insert(infoDo);
		}
		else {
			System.out.println("이미 존재합니다");
		}
	}
	
	public boolean verify(String sNum) {
		InfoDo infoDo = infodao.select(sNum);
		return infoDo == null?true:false;
	}
}
