package InfoDo;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InfoDo {

//	charts 는 고유 영화 인덱스번호
	private	String charts;
	private String title;
	private	String artists;
	private String genre;
	private String distributor;
	private String master;
	private String infoMation;
	private String newDate;
	
	public InfoDo(String charts, String title, String artists, String genre, String distributor, String master,
			String infoMation, String newDate) {
		this.charts = charts;
		this.title = title;
		this.artists = artists;
		this.genre = genre;
		this.distributor = distributor;
		this.master = master;
		this.infoMation = infoMation;
		this.newDate = newDate;
	}
	public String getCharts() {
		return charts;
	}
	public void setCharts(String charts) {
		this.charts = charts;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtists() {
		return artists;
	}
	public void setArtists(String artists) {
		this.artists = artists;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDistributor() {
		return distributor;
	}
	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public String getInfoMation() {
		return infoMation;
	}
	public void setInfoMation(String infoMation) {
		this.infoMation = infoMation;
	}
	public String getNewDate() {
		return newDate;
	}
	public void setNewDate(String newDate) {
		this.newDate = newDate;
	}
	


	









}
