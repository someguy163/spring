package chap03_Ex_01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Hello hello = ctx.getBean("hello2",Hello.class);
		hello.hello();
		ctx.close();
	}

}
