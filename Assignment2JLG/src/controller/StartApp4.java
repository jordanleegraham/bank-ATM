package controller;
/*
 *  This is my second OOP assignment for level 6. For this assignment I have
 *  Been asked to create a Java application in which simulates a mobile phone
 *  Contacts Application with specific capabilities. The capabilities are to include..
 *  Add contact names and mobile phone numbers. Be able to remove these
 *  contact names and numbers. The application must sort any names/contacts
 *  added alphabetically. Finally I must be able to print any of the contacts added
 *  to a text file.
 *  This program will display a use of the OOP concept of 'inheritance'.
 */
/*
 * this class contains the main method this is the entry point/ the start/engine 
 * for the application
 */

import java.util.Scanner;//importing from java lib classes
import model.Contact;//my own lib of classes
import view.MobilePhone;
public class StartApp4 {//start class
	
	static MobilePhone phone = new MobilePhone();//making ref to other file (MobilePhone) + creating an object of (MobilePhone)
	static Contact con = new Contact();//making ref to other file (Contact) + creating an object of (Contact)
	static Scanner input = new Scanner(System.in);//scanner to take in user input
	
	public static void main(String args []) {//begin main
		
		while(true) {//while loop to give user options
			System.out.println("Please Choose From One Of The Following");
			System.out.println("1.Add New Contact");
			System.out.println("2.Remove Contact");
			System.out.println("3.Sort Contacts (alphabetically");
			System.out.println("4.Print to Text File");
			System.out.println("5.Display All Contacts");
			System.out.println("6.Shutdown");
			String option = input.next();
			switch(option) {
				case "1": addContact(); break;
				case "2": removeContact(); break;
				case "3": sortContacts(); break;
				case "4": break;
				case "5": phone.displayContacts(con); break;
				case "6": System.exit(0);break;
			}//end switch
		}//end while loop
		
	}//end main

	private static void addContact() {
		System.out.println("Enter Name: ");
		con.setPersonName(input.next());//take user input set input as name
		System.out.println("Enter Number: ");
		con.setPersonNumber(input.next());//take user input set input as number
		System.out.print(con.toString());//testing a print out
		
		phone.addPerson(con);//build array list
		phone.displayContacts(con);//show the array list		
	}//end addContact method
	
	private static void removeContact() {
		
	}//end remove contact method
	
	private static void sortContacts() {
		
	}//end sort contact method
	
}//end class
