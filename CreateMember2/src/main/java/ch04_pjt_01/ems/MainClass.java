package ch04_pjt_01.ems;

import javax.print.event.PrintJobAttributeEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ch04_pjt_01.ems.configuration.AnnotationConfig;
import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.service.EMSInformaionService;
import ch04_pjt_01.ems.member.service.PrintStudentInformationService;
import ch04_pjt_01.ems.member.service.StudentDeleteService;
import ch04_pjt_01.ems.member.service.StudentModifyService;
import ch04_pjt_01.ems.member.service.StudentRegisterService;
import ch04_pjt_01.ems.member.service.StudentSelectService;
import ch04_pjt_01.ems.utils.InitSampleData;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx1.xml","classpath:appCtx2.xml","classpath:appCtx3.xml");
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml"
//				+ ""
//				+ "");
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);

		InitSampleData initSampleData = ctx.getBean("initSampleData",InitSampleData.class);
		String sNums[] = initSampleData.getsNums();
		String sIds[] = initSampleData.getsIds();
		String sPws[] = initSampleData.getsPws();
		String sNames[] = initSampleData.getsNames();
		int sAges[] = initSampleData.getsAges();
		char sGenders[] = initSampleData.getsGenders();
		String sMajors[] = initSampleData.getsMajors();

		//		데이터 베이스에 샘플 데이터 등록

		StudentRegisterService registerService = ctx.getBean("studentRegisterService",StudentRegisterService.class);

		for(int i=0; i<sNums.length; i++) {
			registerService.register(new Student(sNums[i], sIds[i], sPws[i], sNames[i], sAges[i], sGenders[i], sMajors[i]));
		}
		PrintStudentInformationService printStudentInformationService = ctx.getBean("printStudentInformationService",PrintStudentInformationService.class);
//		printStudentInformationService.printStudensInfo();

		//		학생등록
		registerService = ctx.getBean("studentRegisterService",StudentRegisterService.class);
		registerService.register(new Student("hbs006", "dear", "p0006", "melissa", 26, 'w', "Music"));
		
		printStudentInformationService.printStudensInfo();
		
		StudentSelectService selectService = ctx.getBean("studentSelectService",StudentSelectService.class);
		Student selectedStudent = selectService.select("hbs006");
		
		System.out.println("SELECT STUDENT START");
		
		System.out.print("sNum : " + selectedStudent.getsNum() +"\t" );
		System.out.print("sId : " + selectedStudent.getsId() +"\t" );
		System.out.print("sPw : " + selectedStudent.getsPw() +"\t" );
		System.out.print("sName : " + selectedStudent.getsName() +"\t" );
		System.out.print("sAge : " + selectedStudent.getsAge()  +"\t");
		System.out.print("sGender : " + selectedStudent.getsGender()  +"\t");
		System.out.println("sMajor : " + selectedStudent.getsMajor()  );
		System.out.println("SELECT STUDENT START END");
		System.out.println("--------------------");
		
		
		System.out.println("--------학생수정--------");
//		학생수정
		StudentModifyService studentModifyService = ctx.getBean("studentModifyService",StudentModifyService.class);
		studentModifyService.modify(new Student("hbs006", "pig", "p0066", "melissa", 27, 'w', "Computer"));
		printStudentInformationService.printStudensInfo();
		System.out.println("--------------------");
//		학생삭제
		System.out.println("--------학생삭제--------");
		StudentDeleteService studentDeleteService = ctx.getBean("studentDeleteService",StudentDeleteService.class);
		studentDeleteService.delect("hbs005");
		printStudentInformationService.printStudensInfo();
		System.out.println("--------------------");
//		시스템 정보
		System.out.println("--------시스템정보--------");
		EMSInformaionService emsInformaionService = ctx.getBean("emsInformaionService",EMSInformaionService.class);
		emsInformaionService.printEMSInformation();
		System.out.println("--------------------");
	}



}
