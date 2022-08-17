package com.example.firstProject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
public class ContactTest {
	//Testing character limits and null of all variables
	
	//static testing contact for these tests
	static Contact testContact = new Contact("Andrew","Cruz","1234567890","221 Baker Street");

	@Test
	@Order(1)
	@DisplayName("Testing Contact First Name")
	void testFirstName() {
		testContact.setFirstName("Andrew1234567");
		assertEquals("Andrew1234",testContact.getFirstName(),"10 Character limit failed.");
		testContact.setFirstName("");
		assertEquals("NULL",testContact.getFirstName(),"Failed to null");
		
	}
	@Test
	@Order(2)
	@DisplayName("Testing Contact First Name")
	void testLastName() {
		testContact.setLastName("Cruz1234567890");
		assertEquals("Cruz123456",testContact.getLastName(),"10 Character limit failed.");
		testContact.setLastName("");
		assertEquals("NULL",testContact.getLastName(),"Failed to null");
	}
	@Test
	@Order(3)
	@DisplayName("Testing Contact First Name")
	void testNumber() {
		testContact.setNumber("12345678901234");
		assertEquals("5555555555",testContact.getNumber(),"10 Character limit failed.");
		testContact.setNumber(null);
		assertEquals("5555555555",testContact.getNumber(),"Failed to null");
	}
	@Test
	@Order(4)
	@DisplayName("Testing Contact First Name")
	void testAddress() {
		testContact.setAddress("666-4366 Lacinia Avenue Idaho Falls Ohio 19253");
		assertEquals("666-4366 Lacinia Avenue Idaho ",testContact.getAddress(),"10 Character limit failed.");
		testContact.setAddress(null);
		assertEquals("NULL",testContact.getAddress(),"Failed to null");
	}
}
