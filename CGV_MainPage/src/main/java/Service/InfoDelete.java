package Service;



import org.springframework.beans.factory.annotation.Autowired;

import InfoDao.InfoDao;
import InfoDo.InfoDo;


public class InfoDelete {
	@Autowired
	private InfoDao infoDao;

	public void delete(String chartNum) {
		if (verify(chartNum)) {
			infoDao.delete(chartNum);
		}
		else {
			System.out.println(chartNum +"번의 영화가 존재하지 않습니다 ");
		}
	}

	
	public boolean verify(String sNum) {
		InfoDo infoDo = infoDao.select(sNum);
		return infoDo != null?true:false;
	}
}
