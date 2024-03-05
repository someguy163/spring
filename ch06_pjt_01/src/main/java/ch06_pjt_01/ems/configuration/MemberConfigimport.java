package ch06_pjt_01.ems.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

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
@Import
({MemberConfig2.class , MemberConfig1.class})
public class MemberConfigimport {
	


	@Autowired
	DBConnectionInfo dev_dbConnectionInfoDev;
	@Autowired
	DBConnectionInfo real_DbConnectionInfoDev;

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
		dbInfos.put("dev", dev_dbConnectionInfoDev);
		dbInfos.put("real", real_DbConnectionInfoDev);
		emsInformaionService.setDbInfos(dbInfos);

		return emsInformaionService;

	}



}
