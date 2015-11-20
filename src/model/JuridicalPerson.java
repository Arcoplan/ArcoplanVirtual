package model;

public class JuridicalPerson extends Client{

	private int cnpj;
	
	public JuridicalPerson(){
		super();
	}
	
	public JuridicalPerson(Contact contact, String name, int age, String gender){
		super(contact, name, age, gender);
	}
	
	public int GetCnpj() {
		return cnpj;
	}
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
}
