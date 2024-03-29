package ch05_pjt_03_Qulifier.contact.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ch05_pjt_03_Qulifier.contact.ContactSet;
import ch05_pjt_03_Qulifier.contact.dao.ContactDao;

public class ContactSearchService {

	@Autowired(required = false)
//	@Qualifier("qualifierDao")
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