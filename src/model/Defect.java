package model;

import java.util.Date;

public class Defect {

	private int type;
	private Date date;
	private String description;
	
	public Defect(int type, Date date, String description) {
		super();
		this.type = type;
		this.date = date;
		this.description = description;
	}
	
	public Defect(){
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
