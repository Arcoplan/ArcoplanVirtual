package model;

import java.util.Date;

public class Product {

	private String name;
	private double value;
	private String description;
	private Date manufacturingDate;
	private String id;
	
	public Product(String name, double value, String description, Date manufacturingDate) {
		super();
		this.name = name;
		this.value = value;
		this.description = description;
		this.manufacturingDate = manufacturingDate;
	}

	public Product(){
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}
	
	
}
