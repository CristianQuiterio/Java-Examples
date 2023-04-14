/*
Cristian Quiterio
A00348313
4/4/22
 */
package coursedemo;

public class CourseDemo {

    public static void main(String[] args) {
        
        Instructor i1 = new Instructor("Mohamed", "Hanadi", "CETAS134");
        
        Instructor i2 = new Instructor(i1);
        i2.set("Bean", "Shay", "CHEM143");
        
        TextBook t1 = new TextBook("Big Java Early Objects", "Horstmann", "Wiley");
        
        TextBook t2 = new TextBook(t1);
        t2.set("Chemistry Fundamentals", "A Person", "Another Publisher");
        
        Course c1 = new Course("Data Structures and Program Design", i1, t1); 
        System.out.println(c1);
        
    }
    
}
