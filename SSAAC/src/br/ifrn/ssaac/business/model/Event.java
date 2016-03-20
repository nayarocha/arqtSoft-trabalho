package br.ifrn.ssaac.business.model;

public class Event {
	private long id;
	private String nameEvent;
	private String date;
	private int status;
	
	public Event(){
		super();
	}
	
	public Event(String nameEvent, String date, int status){
		super();
		this.nameEvent = nameEvent;
		this.date = date;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameEvent() {
		return nameEvent;
	}

	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
