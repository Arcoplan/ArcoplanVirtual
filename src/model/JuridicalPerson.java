package model;

public class JuridicalPerson extends Client{

	private int cnpj;
	
	public JuridicalPerson(int cnpj){
		super();
		this.cnpj = cnpj;
	}
	
	public JuridicalPerson(Contact contact, String name, int age, char gender){
		super(contact, name, age, gender);
	}
	
	public int GetCnpj() {
		return cnpj;
	}
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
}
