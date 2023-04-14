/*
Cristian Quiterio
A00348313
4/4/22
 */
package coursedemo;

public class Course {
    
    String courseName;
    Instructor instructor;
    TextBook textBook;

    public Course(String courseName, Instructor instructor, TextBook textBook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textBook = textBook;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public TextBook getTextBook() {
        return textBook;
    }
    
    @Override
    public String toString()
    {
      // Create a string representing the object.
        String str = "Course name: " + courseName +
                    "\nInstructor Information:\n" +
                    instructor +
                    "\nTextbook Information:\n" +
                    textBook;
      // Return the string.
        return str;
    }

}
