package ch03_pjt_02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TransportaionWalk transportaionWalk = new TransportaionWalk();
//		transportaionWalk.move();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TransportationWalk transportaionWalk = ctx.getBean("tWalk",TransportationWalk.class);
		transportaionWalk.move();
		
		ctx.close();
	}

}
