package view;
import java.util.ArrayList;//from java library
import java.util.Collections;
import java.util.Comparator;

import model.Contact;
import model.Person;

public class MobilePhone implements Comparator<Person> {//start class
	
	static ArrayList<Person> contacts = new ArrayList<>();//creating an array list
	
	public MobilePhone() {}//empty constructor
	
	//********OTHER METHODS********
	public void addPerson(Person person) {
		contacts.add(person);
	}//end addPerson method
	
	public void displayContacts(Contact newCon) {
		System.out.println(contacts.toString());
	}//end displayPerson 
	
	@Override
	public int compare(Person a, Person b) {
		return a.getPersonName().compareTo(b.getPersonName());
	}//end override method

	public void removeContacts(String name) {
		for(int i=0;i<contacts.size();i++) {
			if(name.matches(contacts.get(i).getPersonName())) {
				System.out.println("Name found, contact removed");
				contacts.remove(i);
			}//end if	
		}//end for
	}//end remove contacts method

	public void sortContactNames() {
		Collections.sort(contacts, new MobilePhone());		
	}//end method to sort contact names

}//end class
