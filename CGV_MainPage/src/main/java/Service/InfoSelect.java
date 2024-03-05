package Service;

import org.springframework.beans.factory.annotation.Autowired;

import InfoDao.InfoDao;
import InfoDo.InfoDo;


public class InfoSelect {

	@Autowired
	private InfoDao infoDao;

	public InfoDo select(String chartNum) {
		if (verify(chartNum)) {
			return infoDao.select(chartNum);
		}
		else {
			System.out.println(chartNum+"번의 영화가 존재하지 않습니다");
		}
		return null;
	}
	private boolean verify(String sNum) {
		InfoDo infoDo = infoDao.select(sNum);
		return infoDo !=null ? true : false;
	}
}
