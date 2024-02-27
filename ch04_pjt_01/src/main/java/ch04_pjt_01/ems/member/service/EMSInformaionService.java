package ch04_pjt_01.ems.member.service;

import java.lang.ProcessHandle.Info;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch04_pjt_01.ems.member.DBConnectionInfo;

public class EMSInformaionService {

	private String info;
	private String copyRight;
	private String ver;
	private int sYear;
	private int sMonth;
	private int sDay;
	private int eYear;
	private int eMonth;
	private int eDay;
	
	private List<String> developers;
	private Map<String, String> administrators;
	private Map<String, DBConnectionInfo> dbInfo;
	
	public EMSInformaionService(String info, String copyRight, String ver, int sYear, int sMonth, int sDay, int eYear,
			int eMonth, int eDay, List<String> developers, Map<String, String> administrators,
			Map<String, DBConnectionInfo> dbInfo) {
		this.info = info;
		this.copyRight = copyRight;
		this.ver = ver;
		this.sYear = sYear;
		this.sMonth = sMonth;
		this.sDay = sDay;
		this.eYear = eYear;
		this.eMonth = eMonth;
		this.eDay = eDay;
		this.developers = developers;
		this.administrators = administrators;
		this.dbInfo = dbInfo;
	}
	
	public void printEMSInformation() {
		System.out.println("EMS INFORMATION START______");
		
		String devPeriod = sYear + " / " + sMonth + " / " + sDay + " / " + eYear + " / " + eMonth + " / " + eDay;
		System.out.println(info + "("+devPeriod+")");
		System.out.println(copyRight);
		System.out.println(ver);
		System.out.println("Developers : " + developers);
		System.out.println("Administartor : " + administrators);
		printDBInfo();
		System.out.println("END________________________");
	}
	
	private void printDBInfo() {
		Set<String> keys = dbInfo.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			String key =iterator.next();
			DBConnectionInfo info = dbInfo.get(key);
			System.out.println("[ "+ key +" DB]");
			System.out.println("url : " + info.getUrl());
			System.out.println("userID : " + info.getUserId());
			System.out.println("userPW : " + info.getUserPw());
			
		}
		
	}
	
	
	
	
}
