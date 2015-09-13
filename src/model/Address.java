package model;

public class Address {

	private String type;
	private String street;
	private int number;
	private int cep;
	
	public Address(String type, String street, int number, int cep) {
		super();
		this.type = type;
		this.street = street;
		this.number = number;
		this.cep = cep;
	}
	public Address(){
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
}
