package model;
//this class inherits (Person) class..this is inheritance
public class Contact extends Person{//start class

	public Contact() {}//this is an empty constructor
	
	public Contact(String personName, String personNumber) {//constructor with 2 parameters
		super(personName, personNumber);
	}//end constructor

	@Override
	public String toString() {//overwrite the default toString method
		return "Contact [" +super.toString() + "]";
	}//end toString method

}//end class
