/*
Cristian Quiterio
A00348313
4/4/22
 */
package coursedemo;

public class TextBook {
    
    private String title;
    private String author;
    private String publisher;
    
    public TextBook()
    {
    title = "none";
    author = "none";
    publisher = "none";        
    }
    
    public TextBook(String textTitle, String auth, String pub)
    {
    title = textTitle;
    author = auth;
    publisher = pub;         
    }
    
    public TextBook(TextBook object2)
    {
    title = object2.getTitle();
    author = object2.getAuthor();
    publisher = object2.getPublisher();         
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }    
    
    public void set(String textTitle, String auth, String pub)
    {
        title = textTitle;
        author = auth;
        publisher = pub;         
    }
    
    @Override
    public String toString()
   {
      // Create a string representing the object.
      String str = "Title: " + title +
                   "\nAuthor: " + author +
                   "\nPublisher: " + publisher;
      // Return the string.
      return str;
   }

}
