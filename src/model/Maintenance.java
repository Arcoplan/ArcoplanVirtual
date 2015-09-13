package model;

import java.util.Date;

public class Maintenance {
	
	private Date date;
	private String local;
	private double value;
	
	public Maintenance(Date date, String local, double value) {
		super();
		this.date = date;
		this.local = local;
		this.value = value;
	}
	
	public Maintenance(){
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
}
