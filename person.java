package com.stephonlawson.objects;

public class person {
      String firstName; 
      String lastName;
      String courseFocus; 
      int age = 26; 
      
	// constructor 
      public person() {
    	  firstName = "";
    	  lastName = "";
    	  courseFocus = "";
      }
      
      // overloaded constructor (parameter is defined) 
      public person(String first, String last, String focus) {
    	  firstName = first; 
    	  lastName = last;
    	  courseFocus = focus; 
      }
      
      // getter method (getter method)
      public String getFirstName(){
      return firstName;    	  
      }
      
      // setter method (first name)
      public void setFirstName(String newFirstName){
    	  firstName = newFirstName; 
      }
      
      // setter method (last name)
      public void setLastName(String newLastName) {
    	  lastName = newLastName;
      }
      
      // setter method (course focus)
      public void setCourseFocus(String newCourseFocus) {
    	  courseFocus = newCourseFocus;
      }
      
	public static void main(String[] args) {
		
		// instantiate a new object 
		person person1 = new person();
		person person2 = new person("Matias", "Lawson","Java");
		
		//set the information for person 1
		person1.setFirstName("Stephon");
		person1.setLastName("Lawson");
		person1.setCourseFocus("Java");
		
		
		// get the first name (getter method)
		String firstNamePerson2 = person2.getFirstName();
		System.out.println(firstNamePerson2);
		
		// update the first name and print it 
		person2.setFirstName("Alexander");
		System.out.println(person2.getFirstName());
		
	
	}
	}
