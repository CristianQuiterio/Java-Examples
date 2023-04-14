/*
Cristian Quiterio
A00348313
4/4/22
 */
package coursedemo;

public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;
    
    public Instructor()
    {
    lastName = "none";
    firstName = "none";
    officeNumber = "none";        
    }
    
    public Instructor(String lname, String fname, String office)
    {
    lastName = lname;
    firstName = fname;
    officeNumber = office;         
    }
    
    public Instructor(Instructor object2)
    {
    lastName = object2.getLastName();
    firstName = object2.getFirstName();
    officeNumber = object2.getOfficeNumber();         
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }    
    
    public void set(String lname, String fname, String office)
    {
    lastName = lname;
    firstName = fname;
    officeNumber = office;        
    }
    
    @Override
    public String toString()
    {
      // Create a string representing the object.
      String str = "Last Name: " + lastName +
                   "\nFirst Name: " + firstName +
                   "\nOffice Number: " + officeNumber;
      // Return the string.
      return str;
    }

}
