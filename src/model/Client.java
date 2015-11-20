package model;

public class Client {
	
	private Contact contact;
	
	private String name;
	private int age;
	private String gender;
		
	public Client(Contact contact, String name, int age, String gender) {
		super();
	    this.contact = contact;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Client(){
	}
	
	public Contact getContact() {
		return contact; 
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
