package InfoDao;

import java.util.HashMap;
import java.util.Map;

import InfoDo.InfoDo;

public class InfoDao {

	private Map<String, InfoDo> movieInfos = new HashMap<String , InfoDo>();
	
	public void insert(InfoDo infoDo) {
		movieInfos.put(infoDo.getCharts(), infoDo);
	}
	public InfoDo select(String chartNum) {
		return movieInfos.get(chartNum);
	}
	
	public void update(InfoDo infoDo) {
		movieInfos.put(infoDo.getCharts(), infoDo);
	}
	public void delete(String chartNum) {
		movieInfos.remove(chartNum);
	}
	public Map<String, InfoDo> selectAll() {
		return movieInfos;
	}
	
}
