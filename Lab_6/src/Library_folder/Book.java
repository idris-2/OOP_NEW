package Library_folder;

public class Book {
    private String title;
    private String publisher;
    private int year;

    public Book(String tit, String pub, int y){     // Constructor
        this.title = tit;
        this.publisher = pub;
        this.year = y;
    }

    public String title(){return title;}
    public String publisher(){return publisher;}
    public int year(){return year;}

    public String toString(){return title + ", " + publisher + ", " + year;}
    /* 
    methods public String title(), 
    public String publisher(), public int year() and public String toString().
*/
}
