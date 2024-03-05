package ch04_pjt_01.ems.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch04_pjt_01.ems.member.DBConnectionInfo;
import ch04_pjt_01.ems.member.dao.StudentDAO;
import ch04_pjt_01.ems.member.service.EMSInformaionService;
import ch04_pjt_01.ems.member.service.PrintStudentInformationService;
import ch04_pjt_01.ems.member.service.StudentAllSelectService;
import ch04_pjt_01.ems.member.service.StudentDeleteService;
import ch04_pjt_01.ems.member.service.StudentModifyService;
import ch04_pjt_01.ems.member.service.StudentRegisterService;
import ch04_pjt_01.ems.member.service.StudentSelectService;
import ch04_pjt_01.ems.utils.InitSampleData;

@Configuration
public class AnnotationConfig {
	
	@Bean
public	InitSampleData initSampleData() {
		InitSampleData initSampleData = new InitSampleData();
		
		String sNums[] = {"hbs001","hbs002","hbs003","hbs004","hbs005"};
		String sIds[] = {"rabbit","hippo","raccoon","elephant","lion"};
		String sPws[] = {"96539","64875","15284","48765","28661"};
		String sNames[] = {"agatha","barbara","chris","doris","elva"};
		int sAges[] = {19,22,20,27,19};
		char sGenders[] = {'M','W','W','M','M'};
		String sMajors[]= {"English Literature","Korean Language and Literature","French Language and Literature","Philosophy","History"};
		
		initSampleData.setsNums(sNums);
		initSampleData.setsIds(sIds);
		initSampleData.setsPws(sPws);
		initSampleData.setsNames(sNames);
		initSampleData.setsAges(sAges);
		initSampleData.setsGenders(sGenders);
		initSampleData.setsMajors(sMajors);
		
		return initSampleData; 
	}
	
	@Bean
	public StudentRegisterService studentRegisterService() {
		return new StudentRegisterService();
	}
	
	@Bean
	public StudentDAO studentDAO() {
		return new StudentDAO();
	}
	
	@Bean
	public StudentDeleteService studentDeleteService() {
		return new StudentDeleteService();
	}
	
	@Bean
	public StudentModifyService studentModifyService() {
		return new StudentModifyService();
	}
	
	@Bean
	public StudentSelectService studentSelectService() {
		return new StudentSelectService();
	}
	
	@Bean
	public StudentAllSelectService studentAllSelectService() {
		return new StudentAllSelectService();
	}
	
	@Bean
	public PrintStudentInformationService printStudentInformationService() {
		return new PrintStudentInformationService();
	}
	
	@Bean
	public DBConnectionInfo dev_dbConnectionInfoDev() {
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
		
		dbConnectionInfo.setUrl("000.000.000.000");
		dbConnectionInfo.setUserId("admin");
		dbConnectionInfo.setUserPw("0000");
		
		return dbConnectionInfo;
	}
	
	@Bean
	public DBConnectionInfo real_DbConnectionInfoDev() {
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
		
		dbConnectionInfo.setUrl("111.111.111.111");
		dbConnectionInfo.setUserId("master");
		dbConnectionInfo.setUserPw("1111");
		
		return dbConnectionInfo;
	}
	
	@Bean
	public EMSInformaionService emsInformaionService() {
		
		EMSInformaionService emsInformaionService = new EMSInformaionService();
		emsInformaionService.setInfo("Education Management System program was developed in 2022");
		emsInformaionService.setCopyRight("COPYRIGHT(c) 2022 EMS CO ., LTD . ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION");
		emsInformaionService.setVer("The version is 1.0");
		emsInformaionService.setsYear(2022);
		emsInformaionService.setsMonth(3);
		emsInformaionService.setsDay(1);
		emsInformaionService.seteYear(2022);
		emsInformaionService.seteMonth(4);
		emsInformaionService.seteDay(30);
		
		List<String> devNames = new ArrayList<String>();
		
		devNames.add("Cheney");
		devNames.add("Eloy");
		devNames.add("Jasper");
		devNames.add("Dillon");
		devNames.add("Kian");
		emsInformaionService.setDevelopers(devNames);
		
		Map<String, String> adminstrator = new HashMap<String ,String>();
		
		adminstrator.put("Cheney", "Cheney@naver.com");
		adminstrator.put("Kian", "Kian@naver.com");
		
		emsInformaionService.setAdministrators(adminstrator);
		
		Map<String, DBConnectionInfo> dbInfos = new HashMap<String,DBConnectionInfo>();
		
		dbInfos.put("dev", dev_dbConnectionInfoDev());
		dbInfos.put("real"
				+ ""
				+ "", real_DbConnectionInfoDev());
		emsInformaionService.setDbInfos(dbInfos);
		
		
		return emsInformaionService;
	}
}
