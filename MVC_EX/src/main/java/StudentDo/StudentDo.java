package StudentDo;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentDo {

	private String Id;
	private String Pw;
	private String phone;
	private String eMail;
	private String JoinDate;
	private String lastDate;
	
	
	public StudentDo(String id, String pw, String phone, String eMail, String joinDate, String lastDate) {
		this.Id = id;
		this.Pw = pw;
		this.phone = phone;
		this.eMail = eMail;
		this.JoinDate = nowDate();
		this.lastDate = nowDate();
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPw() {
		return Pw;
	}
	public void setPw(String pw) {
		Pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getJoinDate() {
		return JoinDate;
	}
	public void setJoinDate(String joinDate) {
		JoinDate = joinDate;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public static String nowDate() {
		
		// 현재 날짜 구하기
		LocalDate now = LocalDate.now();
		// 포맷 정의
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		// 포맷 적용
		String formatedNow = now.format(formatter);         
				
		return formatedNow;
	}
	








}
