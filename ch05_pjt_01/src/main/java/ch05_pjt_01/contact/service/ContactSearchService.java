package ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactSearchService {

	@Autowired
	private ContactDao contactDao;
//
//	@Autowired
//	public ContactSearchService(ContactDao contactDao) {
//		System.out.println("contactDao : " + contactDao);
//		this.contactDao = contactDao;
//	}
	
	
	
//	public ContactSearchService() {
//		this.contactDao = contactDao;
//		System.out.println("default 생성자");
//	}



	public ContactSet searchContact(String name) {
		if (verify(name)) {
			return contactDao.select(name);
		}
		else {
			System.out.println("select 문오류");
		}
		return null;
	}
	
	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet != null ? true:false;
	}
	
//	@Autowired
//	public void setContactDao(ContactDao contactDao) {
//		this.contactDao = contactDao;
//	}
}