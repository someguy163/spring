package ch05_pjt_01.contact;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ch05_pjt_01.contact.Util.InitSampleData;
import ch05_pjt_01.contact.config.AnnotationConfig;
import ch05_pjt_01.contact.service.ContactRegisterService;
import ch05_pjt_01.contact.service.ContactSearchService;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		InitSampleData initSampleData = ctx.getBean("initSampleData",InitSampleData.class);
		
		String names[] = initSampleData.getNames();
		String phoneNumbers[] = initSampleData.getPhoneNumbers();
		
		ContactRegisterService contactRegisterService = ctx.getBean("contactRegisterService",ContactRegisterService.class);
		
		for(int i =0; i<names.length; i++) {
			ContactSet contactSet = new ContactSet(names[i], phoneNumbers[i]);
			contactRegisterService.register(contactSet);
		}
		
		ContactSearchService contactSearchService = ctx.getBean("contactSearchService",ContactSearchService.class);
		
		ContactSet contactSet = contactSearchService.searchContact("류현진");
		System.out.println("name : " + contactSet.getName());
		System.out.println("phone : " + contactSet.getPhoneNumber());
		System.out.println("---------------------");
		
		contactSet = contactSearchService.searchContact("손흥민");
		System.out.println("name : " + contactSet.getName());
		System.out.println("phone : " + contactSet.getPhoneNumber());
		System.out.println("---------------------");
		
		contactSet = contactSearchService.searchContact("김연경");
		System.out.println("name : " + contactSet.getName());
		System.out.println("phone : " + contactSet.getPhoneNumber());
		System.out.println("---------------------");
	}

}
