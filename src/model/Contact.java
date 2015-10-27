package model;

public class Contact {
	
	private int phone;
	private String email;
	private String typeAddress;
	private String streetAddress;
	private int numberAddress;
	private int cep;
	private String city;
	private String state;
	
	public Contact(int phone, String email, String typeAddress, String streetAddress, int numberAddress, int cep,
			String city, String state) {
		super();
		this.phone = phone;
		this.email = email;
		this.typeAddress = typeAddress;
		this.streetAddress = streetAddress;
		this.numberAddress = numberAddress;
		this.cep = cep;
		this.city = city;
		this.state = state;
	}
	
	public Contact(){
	}
	
	public int getPhone() {
		return phone; 
	}
	public void setPhone(int phone) {
		this.phone = phone; 
	}
	public String getEmail() {
		return email; 
	}
	public void setEmail(String email) {
		this.email = email; 
	}
	public String getTypeAddress() {
		return typeAddress;
	}
	public void setTypeAddress(String typeAddress) {
		this.typeAddress = typeAddress;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public int getNumberAddress() {
		return numberAddress;
	}
	public void setNumberAddress(int numberAddress) {
		this.numberAddress = numberAddress;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
