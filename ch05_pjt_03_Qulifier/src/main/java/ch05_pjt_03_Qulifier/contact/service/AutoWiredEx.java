package ch05_pjt_03_Qulifier.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWiredEx {


	@Autowired
	public AutoWiredEx(@Qualifier("qualifierBean") FirstBean fBean , SecondBean sBean) {
		System.out.println("fBean : " + fBean);
		System.out.println("sBean : " + sBean);
	}

	@Autowired
	public void autoWiredEx(ThirdBean tBean , @Qualifier("qualifierBean") FourthBean fBean) {
		System.out.println("fBean : " + tBean);
		System.out.println("sBean : " + fBean);
	}

}
