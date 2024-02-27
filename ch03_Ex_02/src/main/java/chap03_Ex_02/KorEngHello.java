package chap03_Ex_02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class KorEngHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Scanner sc = new Scanner(System.in);
		
		SayHello korhello = ctx.getBean("korHello",KoreaHello.class);
		SayHello enghello = ctx.getBean("engHello",EngHello.class);
		
		
		System.out.println("select  language! 1. Korea 2. Eng");
		int select = sc.nextInt();
		if (select==1) {
			korhello.sayHello();
		}
		else if (select==2) {
			enghello.sayHello();
		}
		ctx.close();
			
		
	}

}
