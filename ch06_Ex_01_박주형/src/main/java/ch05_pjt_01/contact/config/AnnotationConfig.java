package ch05_pjt_01.contact.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch05_pjt_01.contact.Util.InitSampleData;
import ch05_pjt_01.contact.dao.ContactDao;
import ch05_pjt_01.contact.service.ContactRegisterService;
import ch05_pjt_01.contact.service.ContactSearchService;

@Configuration
public class AnnotationConfig {

	@Bean
	public InitSampleData initSampleData() {
		
		InitSampleData initSampleData = new InitSampleData();
		String names[] = {"류현진","손흥민","김연경"};
		String phoneNumbers[] = {"010-0000-1111","010-0000-2222","010-0000-3333"};
		initSampleData.setNames(names);
		initSampleData.setPhoneNumbers(phoneNumbers);
		
		return initSampleData; 
	}
	
	@Bean 
	public ContactDao contactDao() {
		return new ContactDao();
	}
	
	@Bean
	public ContactRegisterService contactRegisterService() {
		return new ContactRegisterService(contactDao());
	}
	
	@Bean 
	public ContactSearchService contactSearchService() {
		return new ContactSearchService(contactDao());
	}
	
	
}
