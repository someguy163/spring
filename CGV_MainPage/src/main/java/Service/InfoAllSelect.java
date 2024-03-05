package Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import InfoDao.InfoDao;
import InfoDo.InfoDo;

public class InfoAllSelect {

//	모든리스트 조회하기
	
	@Autowired
	private InfoDao infoDao;
	
	public Map<String, InfoDo> selectAllList() {
		return infoDao.selectAll();
	}
	
}
