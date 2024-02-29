package main;

import java.sql.Date;
import java.util.Iterator;

import org.springframework.context.support.GenericXmlApplicationContext;

import SampleData.SampleData;
import Service.AllStudentPrint;
import Service.InsertInfo;
import StudentDo.StudentDo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		SampleData sampleData = ctx.getBean("SampleData",SampleData.class);
		String Ids[]= sampleData.getIds();
		String Pwds[] = sampleData.getPws();
		String phones[] = sampleData.getPhones();
		String emails[] = sampleData.geteMails();
		Date joinDate[] = sampleData.getJoinDates();
		Date lasDate[] = sampleData.getLastDates();
		
		InsertInfo intserInfo = ctx.getBean("insertInfo",InsertInfo.class);
		
		for(int i =0; i<Ids.length; i++) {
			intserInfo.insert(new StudentDo(Ids[i], Pwds[i], phones[i], emails[i], joinDate[i], lasDate[i]));
			
			AllStudentPrint allStudentPrint = ctx.getBean("allSelectInfo",AllStudentPrint.class);
			allStudentPrint.AllStudentInfo();
		}
	}

}
