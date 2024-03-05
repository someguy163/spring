package MainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import BeanConfig.AnnotationConfig;
import InfoDo.InfoDo;
import InsertSampleData.InsertSampleData;
import Service.InfoInsert;
import Service.InfoPrintList;
import Service.InfoSelect;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		InsertSampleData insertSampleData = ctx.getBean("insertSampleData",InsertSampleData.class);
		String charts[] =  insertSampleData.getCharts();
		String titles[] = insertSampleData.getTitles();
		String artists[] = insertSampleData.getArtists();
		String genres[] = insertSampleData.getGenres();
		String distributors[] = insertSampleData.getDistributors();
		String masters[] = insertSampleData.getMasters();
		String infomations[] = insertSampleData.getInfomations();
		
		InfoInsert infoInsert = ctx.getBean("infoInsert",InfoInsert.class);
		
		for(int i =0; i<charts.length; i++) {
			infoInsert.insert(new InfoDo(charts[i],titles[i],artists[i],genres[i],distributors[i],masters[i],infomations[i]));
			
		}
		InfoPrintList infoPrintList = ctx.getBean("infoPrintList",InfoPrintList.class);
		infoPrintList.AllselectInfo();
		
//		새로운 영화 등록
		infoInsert.insert(new InfoDo("7", "AAA", "BBB", "CCC", "DDD", "EEE", "FFF"));
		infoPrintList.AllselectInfo();
		
		System.out.println("특정 고유번호로 영화 검색");
		InfoSelect infoSelect = ctx.getBean("infoSelect",InfoSelect.class);
		InfoDo selectMovie = infoSelect.select("1");
		System.out.println("순번 : " +selectMovie.getCharts());
		System.out.println("제목 : " +selectMovie.getTitle());
		System.out.println("배우들 : " +selectMovie.getArtists());
		System.out.println("장르 : " +selectMovie.getGenre());
		System.out.println("배급사 : " +selectMovie.getDistributor());
		System.out.println("감독 : " +selectMovie.getMaster());
		System.out.println("영화 소개 : " +selectMovie.getInfoMation());
	}

}
