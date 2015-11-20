package model;

import java.util.Date;

public class Furniture extends Product {
	
	private String color;
	private double height;
	private double width;
	private double depth;
	
	public Furniture(String name, double value, String description, Date manufacturingDate, 
					 String color, double height, double width, double depth ) {
		
		super(name, value, description, manufacturingDate);
		this.color = color;
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getDepth()
	{
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void printProduct(){
		System.out.println("Nome: " + getName());
	}
	

}
