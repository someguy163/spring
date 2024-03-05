package ch06_pjt_01.ems.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.member.DBConnectionInfo;
import ch06_pjt_01.ems.member.dao.StudentDAO;
import ch06_pjt_01.ems.member.service.EMSInformaionService;
import ch06_pjt_01.ems.member.service.PrintStudentInformationService;
import ch06_pjt_01.ems.member.service.StudentAllSelectService;
import ch06_pjt_01.ems.member.service.StudentDeleteService;
import ch06_pjt_01.ems.member.service.StudentModifyService;
import ch06_pjt_01.ems.member.service.StudentRegisterService;
import ch06_pjt_01.ems.member.service.StudentSelectService;
import ch06_pjt_01.ems.utils.InitSampleData;

@Configuration
public class MemberConfig {
	
	@Bean
	public InitSampleData initSampleData() {
		InitSampleData initSampleData = new InitSampleData();
		String sNums[] = {"hbs001","hbs002","hbs003","hbs004","hbs005"};
		String sIds[] = {"rabbit","hippo","raccoon","elephant","lion"};
		String sPwds[] = {"p0001","p0002","p0003","p0004","p0005"};
		String sNames[] = {"agatha","barbra","chris","doris","elva"};
		int sAges[] = {19,22,20,27,19};
		char sGenders[] = {'M','W','W','M','m'};
		String sMajors[] = {"English","Korean","French","Philosphy","History"};
		initSampleData.setsNums(sNums);
		initSampleData.setsIds(sIds);
		initSampleData.setsPws(sPwds);
		initSampleData.setsNames(sNames);
		initSampleData.setsAges(sAges);
		initSampleData.setsGenders(sGenders);
		initSampleData.setsMajors(sMajors);
		
		return initSampleData;
	}


	@Bean
	public StudentDAO studentDAO() {
		return new StudentDAO();
	}

	@Bean
	public StudentRegisterService studentRegisterService() {
		return new StudentRegisterService(studentDAO());
	}

	@Bean
	public StudentDeleteService studentDeleteService() {
		return new StudentDeleteService(studentDAO());
	}
	
	@Bean
	public StudentAllSelectService studentAllSelectService() {
		return new StudentAllSelectService(studentDAO());
	}
	
	@Bean 
	public StudentSelectService studentSelectService() {
		return new StudentSelectService(studentDAO());
	}
	
	@Bean
	public PrintStudentInformationService printStudentInformationService() {
		return new PrintStudentInformationService(studentAllSelectService());
	}
	@Bean
	public StudentModifyService studentModifyService() {
		return new StudentModifyService(studentDAO());
	}
	@Bean
	public DBConnectionInfo dev_dbConnectionInfoDev() {
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
		dbConnectionInfo.setUrl("000.000.000.000");
		dbConnectionInfo.setUserId("admin");
		dbConnectionInfo.setUserPw("0000");
		return  dbConnectionInfo;
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
		emsInformaionService.seteDay(4);
		emsInformaionService.seteDay(30);
		
		List<String> develpoers = new ArrayList<String>();
		develpoers.add("Cheney");
		develpoers.add("Eloy");
		develpoers.add("Jasper");
		develpoers.add("Dillon");
		develpoers.add("Kian");
		emsInformaionService.setDevelopers(develpoers);
		
		Map<String, String> admintstrator = new HashMap<String, String>();
		admintstrator.put("Cheney", "cheney@springPjt.org");
		admintstrator.put("Jasper", "cheney@springPjt.org");
		
		emsInformaionService.setAdministrators(admintstrator);
		
		Map<String , DBConnectionInfo> dbInfos = new HashMap<String,DBConnectionInfo>();
		dbInfos.put("dev", dev_dbConnectionInfoDev());
		dbInfos.put("real", real_DbConnectionInfoDev());
		emsInformaionService.setDbInfos(dbInfos);
		
		return emsInformaionService;
		
	}



}
