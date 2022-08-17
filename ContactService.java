package com.example.firstProject;
/*
 * Andrew Cruz
 * 7/13/2022
 * CS320
 */

//Description: This is the contact service. It maintains a list of contacts and has capabilities
//for adding and deleting contacts, as well as updating first name, last name, phone number, and address.

import java.util.ArrayList;

public class ContactService {
	// Start with an ArrayList of contacts to hold the list of contacts
	ArrayList<Contact> contactList = new ArrayList<Contact>();

	// Display the full list of contacts to the console for error checking.
	public void displayContactList() {
		for (int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
			System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
		}
	}

	// Adds a new contact using the Contact constructor, then assign the new contact
	// to the list.
	public void addContact(String firstName, String lastName, String number, String address) {
		// Create the new contact
		Contact contact = new Contact(firstName, lastName, number, address);
		contactList.add(contact);
	}

	public void deleteContact(String contactID) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactID.equals(contactList.get(i).getContactID())) {
				contactList.remove(i);
			}
		}
	}

	public Contact getContact(String contactID) {
		for (int i =0; i < contactList.size(); i++) {
				System.out.println(contactList.get(i).getContactID());
			if (contactID.equals(contactList.get(i).getContactID())){
				return contactList.get(i);
			}
		}
		return null;
	}

	public void updateFirstName(String contactID, String firstName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactID.equals(contactList.get(i).getContactID())) {
				contactList.get(i).setFirstName(firstName);
			}
		}
	}

	public void updateLastName(String contactID, String lastName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactID.equals(contactList.get(i).getContactID())) {
				contactList.get(i).setLastName(lastName);
			}
		}
	}

	public void updateNumber(String contactID, String Number) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactID.equals(contactList.get(i).getContactID())) {
				contactList.get(i).setNumber(Number);
			}
		}

	}

	public void updateAddress(String contactID, String address) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactID.equals(contactList.get(i).getContactID())) {
				contactList.get(i).setAddress(address);
			}
		}

	}

}
// Now it's your turn to finish creating the code
