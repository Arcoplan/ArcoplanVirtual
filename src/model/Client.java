package model;

public class Client {
	
	//private Contact contact;
	
	private String name;
	private int age;
	private char gender;
		
	public Client(Contact contact, String name, int age, char gender) {
		super();
	//	this.contact = contact;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Client(){
	}
	
	// private Contact getContact() {
	//	return contact; 
	//}
	//private Contact setContact(Contact contact) {
	//	this.contact = contact;
	//}
	
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
