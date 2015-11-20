package model;

public class PhysicalPerson extends Client{
	
	private int cpf;

	public PhysicalPerson(int cpf) {
		super();
		this.cpf = cpf;
	}

	public PhysicalPerson(Contact contact, String name, int age, char gender) {
		super(contact, name, age, gender);
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}	
}
