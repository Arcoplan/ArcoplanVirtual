package model;

public class Contact {
	
	private int phone;
	private String email;
	
	public Contact(int phone, String email) {
		super();
		this.phone = phone;
		this.email = email;
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
}
