package StudentDo;

import java.sql.Date;

public class StudentDo {
	
	private String Id;
	private String Pw;
	private String phone;
	private String eMail;
	private Date JoinDate;
	private Date lastDate;
	
	
	public StudentDo(String id, String pw, String phone, String eMail, Date joinDate, Date lastDate) {
		Id = id;
		Pw = pw;
		this.phone = phone;
		this.eMail = eMail;
		JoinDate = joinDate;
		this.lastDate = lastDate;
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


	public Date getJoinDate() {
		return JoinDate;
	}


	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}


	public Date getLastDate() {
		return lastDate;
	}


	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}
	
	
	
	
	

}
