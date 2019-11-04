package model;

public class Person {//start class
	private String personName;//private so its not visible/secure..maybe secure
	private String personNumber;
	
	//***************CONSTRUCTORS***************
	public Person() {}//empty constructor
	
	public Person(String personName, String personNumber) {//constructor with parameters
		super();
		this.personName = personName;
		this.personNumber = personNumber;
	}//end constructor
	
	//***************GET/SET METHODS***************
	public String getPersonName() {//get method for person name
		return personName;
	}//end get
	public void setPersonName(String personName) {//set method for person name
		this.personName = personName;
	}//end set
	
	public String getPersonNumber() {//get method for person number
		return personNumber;
	}//end get method
	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}//end set method
	
	//***************OTHER METHODS***************
	@Override
	public String toString() {
		return "Contact [Name: " + getPersonName() + ", Number: " + getPersonNumber() + "]";
	}//end toString method

}//end class
