package model;

import java.util.Date;

public class Appliance extends Product {
	
	private String brand;
	private String color;
	private String applianceClass;

	public Appliance(String name, double value, String description, Date manufacturingDate,
					 String brand, String color, String applianceClass) {
		
		super(name, value, description, manufacturingDate);
		this.brand = brand;
		this.color = color;
		this.applianceClass = applianceClass;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getApplianceClass() {
		return applianceClass;
	}

	public void setApplianceClass(String applianceClass) {
		this.applianceClass = applianceClass;
	}
	
	public void printProduct(){
		System.out.println("Nome: " + getName());
	}
	

}
