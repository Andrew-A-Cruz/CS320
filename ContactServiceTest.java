package com.example.firstProject;

//import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.junit.jupiter.api.Assertions.*;
//import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest 
{
	//Testing for updates of firstName lastName phoneNumber and address
	@Test
	@Order(1)
	@DisplayName("Test to Update First Name.")
	public void testUpdateFirstName() {
	ContactService service = new ContactService();
	service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
	service.updateFirstName( "0" , "Sven");
	service.displayContactList();
	assertEquals("Sven",service.getContact("0").getFirstName(), "First name was not updated.");
	}
	
	@Test
	@Order(2)
	@DisplayName("Test to Update Last Name.")
	public void testUpdatelastName() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
		service.updateLastName( "1" , "Cruz");
		service.displayContactList();
		assertEquals("Cruz",service.getContact("1").getLastName(), "Last name was not updated.");
	}
	@Test
	@Order(3)
	@DisplayName("Test to Update Number.")
	public void testUpdateNumber() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
		service.updateNumber( "2" , "1234567890");
		service.displayContactList();
		assertEquals("1234567890",service.getContact("2").getNumber(), "Phone number name was not updated.");
	}
	@Test
	@Order(4)
	@DisplayName("Test to Update Address.")
	public void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
		service.updateAddress( "3" , "221 Baker Street");
		service.displayContactList();
		assertEquals("221 Baker Street",service.getContact("3").getAddress(), "Address name was not updated.");
	}
	@Test
	@Order(5)
	@DisplayName("Test to Delete Contact.")
	public void testDeleteContact() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
		service.deleteContact("4");
		service.displayContactList();
		assertEquals(null,service.getContact("4"), "Contact wasn't deleted.");

	// Now it's your turn to finish creating the code 
	}
}