package Service;

import org.springframework.beans.factory.annotation.Autowired;

import InfoDao.InfoDao;
import InfoDo.InfoDo;


public class InfoUpdate {

	
	@Autowired
	private InfoDao infoDao;
	
	public void update(InfoDo infoDo) {
		if (verify(infoDo.getCharts())) {
			infoDao.update(infoDo);
		}
		else {
			System.out.println(infoDo.getCharts()+"번의 자리는 이미 존재합니다");
		}
	}
	
	public boolean verify(String sNum) {
		InfoDo infoDo = infoDao.select(sNum);
		return infoDo != null?true:false;
	}
}
