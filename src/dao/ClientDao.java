package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import model.JuridicalPerson;
import model.PhysicalPerson;
import model.Contact;

public class ClientDao extends ConnectionFactory {

	JuridicalPerson juridicalPerson = new JuridicalPerson();
	Contact contact = new Contact();
	
	public void createJuridicalPerson(JuridicalPerson juridicalPerson){

		try
		{
		Connection connection = getConnection();
		
		String insertIntoJuridicalClient = "INSERT INTO juridicalClient (nameJuridicalClient, agejuridicalClient,"
				+ "cnpjJuridicalClient, genderjuridicalClient) VALUES (?,?,?,?);";
	
		String insertIntoContact = "INSERT INTO contact (emailContact, phoneContact, typeAddressContact,"
				+ "streetAddressContact, numberAddressContact, cepAddressContact, cityAddressContact,"
				+ "stateAddressContact) VALUE (?,?,?,?,?,?,?,?);";
	
		
		PreparedStatement pstm = connection.prepareStatement(insertIntoJuridicalClient);
		pstm.setString(1, juridicalPerson.getName());
		pstm.setInt(2, juridicalPerson.getAge());
		pstm.setInt(3, juridicalPerson.GetCnpj());
		pstm.setString(4, juridicalPerson.getGender());	
		
		pstm.executeUpdate();
		
		PreparedStatement pstm2 = connection.prepareStatement(insertIntoContact);
		pstm2.setString(1, contact.getEmail());
		pstm2.setInt(2, contact.getPhone());
		pstm2.setString(3, contact.getTypeAddress());
		pstm2.setString(4, contact.getStreetAddress());
		pstm2.setInt(5, contact.getNumberAddress());
		pstm2.setInt(6, contact.getCep());
		pstm2.setString(7, contact.getCity());
		pstm2.setString(8, contact.getState());
		
		pstm2.executeUpdate();
		
		pstm.close();
		pstm2.close();
		
		connection.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void createPhysicalPerson(PhysicalPerson physicalPerson){

		try
		{
		Connection connection = getConnection();
		
		String insertIntoPhysicalPerson = "INSERT INTO physicalClient (namePhysicalClient, agePhysicalClient,"
				+ "cpfPhysicalClient, genderPhysicalClient) VALUES (?,?,?,?);";
	
		String insertIntoContact = "INSERT INTO contact (emailContact, phoneContact, typeAddressContact,"
				+ "streetAddressContact, numberAddressContact, cepAddressContact, cityAddressContact,"
				+ "stateAddressContact) VALUE (?,?,?,?,?,?,?,?);";
	
		
		PreparedStatement pstm = connection.prepareStatement(insertIntoPhysicalPerson);
		pstm.setString(1, physicalPerson.getName());
		pstm.setInt(2, physicalPerson.getAge());
		pstm.setInt(3, physicalPerson.getCpf());
		pstm.setString(4, physicalPerson.getGender());	
		
		pstm.executeUpdate();
		
		PreparedStatement pstm2 = connection.prepareStatement(insertIntoContact);
		pstm2.setString(1, contact.getEmail());
		pstm2.setInt(2, contact.getPhone());
		pstm2.setString(3, contact.getTypeAddress());
		pstm2.setString(4, contact.getStreetAddress());
		pstm2.setInt(5, contact.getNumberAddress());
		pstm2.setInt(6, contact.getCep());
		pstm2.setString(7, contact.getCity());
		pstm2.setString(8, contact.getState());
		
		pstm2.executeUpdate();
		
		pstm.close();
		pstm2.close();
		
		connection.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
