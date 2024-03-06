package Service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import InfoDo.InfoDo;

public class InfoPrintList {
	
	
	@Autowired
	InfoAllSelect infoAllSelect;
	
	public void AllselectInfo() {
		Map<String, InfoDo> AllmovieInfo = infoAllSelect.selectAllList();
		Set<String> keys = AllmovieInfo.keySet();
		Iterator<String> iterator = keys.iterator();
		System.out.println("--------------------");
		System.out.println("모든 영화 리스트 출력하기");
		while (iterator.hasNext()) {
			System.out.println("------------------");
			String key = iterator.next();
			System.out.println("순번 : " + AllmovieInfo.get(key).getCharts() );
			System.out.println("제목 : " + AllmovieInfo.get(key).getTitle() );
			System.out.println("배우들 : " + AllmovieInfo.get(key).getArtists());
			System.out.println("장르 : " + AllmovieInfo.get(key).getGenre() );
			System.out.println("배급사 : " + AllmovieInfo.get(key).getDistributor());
			System.out.println("감독 : " + AllmovieInfo.get(key).getMaster());
			System.out.println("영화 소개 : " + AllmovieInfo.get(key).getInfoMation());
			System.out.println("영화 최초등록일 : " + AllmovieInfo.get(key).getNewDate());
			System.out.println("------------------");
		}
		System.out.println("모든 영화 정보 출력 종료");
		System.out.println("--------------------");
		
	}
}
