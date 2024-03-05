package ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactRegisterService {

	@Autowired
	private ContactDao contactDao;
		@Autowired
		public ContactRegisterService(ContactDao contactDao) {
			System.out.println("contactDao : " + contactDao);
			this.contactDao = contactDao;
		}


	//	public ContactRegisterService() {
	//		System.out.println("default 생성자");
	//	}






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
