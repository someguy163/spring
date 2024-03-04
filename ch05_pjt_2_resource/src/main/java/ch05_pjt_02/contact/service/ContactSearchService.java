package ch05_pjt_02.contact.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_02.contact.ContactSet;
import ch05_pjt_02.contact.dao.ContactDao;

public class ContactSearchService {

	@Resource
	private ContactDao contactDao;




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