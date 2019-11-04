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

import model.Contact;//my own lib of classes
public class StartApp1 {//start class
	
	static Contact con = new Contact();//making ref to other file (Contact) + creating an object of (Contact)

	public static void main(String args []) {//begin main
		
		System.out.print(con.toString());//testing a print out
	}//end main

}//end class
