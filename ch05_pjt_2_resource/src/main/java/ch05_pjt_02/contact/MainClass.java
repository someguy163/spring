package ch05_pjt_02.contact;

import org.springframework.context.support.GenericXmlApplicationContext;

import ch05_pjt_02.contact.Util.InitSampleData;
import ch05_pjt_02.contact.service.ContactRegisterService;
import ch05_pjt_02.contact.service.ContactSearchService;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		
		InitSampleData initSampleData = ctx.getBean("initSampleData",InitSampleData.class);
		
		String names[] = initSampleData.getNames();
		String phoneNumbers[] = initSampleData.getPhoneNumbers();
		
		ContactRegisterService contactRegisterService = ctx.getBean("registerService",ContactRegisterService.class);
		
		for(int i =0; i<names.length; i++) {
			ContactSet contactSet = new ContactSet(names[i], phoneNumbers[i]);
			contactRegisterService.register(contactSet);
		}
		
		ContactSearchService contactSearchService = ctx.getBean("searchService",ContactSearchService.class);
		
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
