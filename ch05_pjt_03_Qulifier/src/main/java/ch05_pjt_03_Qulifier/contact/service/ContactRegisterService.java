package ch05_pjt_03_Qulifier.contact.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ch05_pjt_03_Qulifier.contact.ContactSet;
import ch05_pjt_03_Qulifier.contact.dao.ContactDao;


public class ContactRegisterService {

	@Autowired(required = false)
//	@Qualifier("qualifierDao")
	private ContactDao contactDao;
	



	public void register(ContactSet contactSet) {
		String name = contactSet.getName();

		if (verify(name)) {
			contactDao.insert(contactSet);
		}
		else {
			System.out.println("이미 값이 있습니다");
		}

	}

	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet == null ? true:false;
	}

//	@Autowired
//	public void setWordDao(ContactDao contactDao) {
//		this.contactDao = contactDao;
//	}



}
