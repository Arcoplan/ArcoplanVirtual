package model;

public class Catalog {

	private int id;
	private String numberOfEnvironment;
	
	public Catalog(int id, String numberOfEnvironment) {
		super();
		this.id = id;
		this.numberOfEnvironment = numberOfEnvironment;
	}
	
	public Catalog(){
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumberOfEnvironment() {
		return numberOfEnvironment;
	}

	public void setNumberOfEnvironment(String numberOfEnvironment) {
		this.numberOfEnvironment = numberOfEnvironment;
	}
	
	
}
