package model;

public class Environment {

	private String name;
	private String descriptionEnvironment;
	
	public Environment(String name, String descriptionEnvironment) {
		super();
		this.name = name;
		this.descriptionEnvironment = descriptionEnvironment;
	}

	public Environment(){
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescriptionEnvironment(){
		return descriptionEnvironment;
	}
	
	public void setDescriptionEnvironment(String descriptionEnvironment){
		this.descriptionEnvironment = descriptionEnvironment;
	}

}
