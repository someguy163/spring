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
public class MemberConfig1 {
	
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



}
