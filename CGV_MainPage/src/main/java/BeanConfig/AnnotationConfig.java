package BeanConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import InfoDao.InfoDao;
import InfoDo.InfoDo;
import InsertSampleData.InsertSampleData;
import Service.InfoAllSelect;
import Service.InfoDelete;
import Service.InfoInsert;
import Service.InfoPrintList;
import Service.InfoSelect;
import Service.InfoUpdate;

@Configuration
public class AnnotationConfig {

	@Bean
	public InfoDao infoDao() {
		return new InfoDao();
	}
	@Bean
	public InsertSampleData insertSampleData() {
		
		InsertSampleData insertSampleData = new InsertSampleData();
		
		String charts[] = {"1","2","3","4","5","6"};
		String title[] = {"노량","서울의 봄" ,"아이언맨" , "아쿠아맨" ,"기생충","짱구"};
		String artists[] = 
			{"이순신 , 일본인 , 자랑스런 한국인","전두환 , 노태우 ..등등","아이언맨 , 캡틴아메라카..","주인공과 여러물고기들","기생충 가족들","짱구네 가족과 , 짱구 친구들"};
		String genres[] = {"역사","역사","히어로","히어로","모름","애니"};
		String distributors[] = {"MIT","MIT","MIT","MIT","MIT","MIT"};
		String masters[]= {"A감독","B감독","C감독","D감독","E감독","F감독"};
		String infomations[] = {"이 영화는 이순신장군님에 대한 내용입니다",
				"전두환씨의 쓰레기같은 업적입니다",
				"아이언맨이 세상을 구하는 내용입니다",
				"물속의 물고기들과 친구가 되는 내용입니다",
				"한 가족이 부잣집에서 같이 기생하는 내용입니다",
				"흔한 짱구 극장판입니다"};
		insertSampleData.setCharts(charts);
		insertSampleData.setTitles(title);
		insertSampleData.setArtists(artists);
		insertSampleData.setGenres(genres);
		insertSampleData.setDistributors(distributors);
		insertSampleData.setMasters(masters);
		insertSampleData.setInfomations(infomations);
		return insertSampleData;
	}
	
	@Bean
	public InfoAllSelect infoAllSelect() {
		return new InfoAllSelect();
	}
	@Bean
	public InfoDelete infoDelete() {
		return new InfoDelete();
	}
	@Bean
	public InfoInsert infoInsert() {
		return new InfoInsert();
	}
	@Bean
	public InfoPrintList infoPrintList() {
		return new InfoPrintList();
	}
	
	@Bean
	public InfoSelect infoSelect() {
		return new InfoSelect();
	}
	@Bean 
	public InfoUpdate infoUpdate() {
		return new InfoUpdate();
	}

	
}
