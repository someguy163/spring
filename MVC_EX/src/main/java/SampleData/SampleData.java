package SampleData;

import java.sql.Date;

public class SampleData {

	
	private String[] Ids;
	private String[] Pws;
	private String[] phones;
	private String[] eMails;
	private Date[] JoinDates;
	private Date[] lastDates;
	public String[] getIds() {
		return Ids;
	}
	public void setIds(String[] ids) {
		Ids = ids;
	}
	public String[] getPws() {
		return Pws;
	}
	public void setPws(String[] pws) {
		Pws = pws;
	}
	public String[] getPhones() {
		return phones;
	}
	public void setPhones(String[] phones) {
		this.phones = phones;
	}
	public String[] geteMails() {
		return eMails;
	}
	public void seteMails(String[] eMails) {
		this.eMails = eMails;
	}
	public Date[] getJoinDates() {
		return JoinDates;
	}
	public void setJoinDates(Date[] joinDates) {
		JoinDates = joinDates;
	}
	public Date[] getLastDates() {
		return lastDates;
	}
	public void setLastDates(Date[] lastDates) {
		this.lastDates = lastDates;
	}
	
	
	
}
