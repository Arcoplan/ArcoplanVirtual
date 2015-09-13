package model;

public class Service {

	private String type;
	
	public Service(String type) {
		super();
		this.type = type;
	}
	
	public Service(){
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
