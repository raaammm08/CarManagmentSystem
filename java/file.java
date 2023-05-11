import java.util.Scanner;
import java.util.ArrayList;

public class file {

public static void main (String[] args){
        Scanner SC = new Scanner(System.in);
        Book a = new Book();

        a.setTitle("Stranger");

        Book b = new Book();
        b.setTitle("SQL");

        Book c = new Book();

        c.setTitle("HTML");

        ArrayList<Book> file = new ArrayList<Book>();
        file.add(a);
        file.add(b);
        file.add(c);
        System.out.println("Display all books");
        for(Book x:file)
                System.out.println(x);
        SC.close();
}
}
class Book {

String Title;


public Book()
{
        Title="";
}

public Book(String bookTitle)
{
        Title=bookTitle;
}

public void setTitle(String bookTitle)
{
        Title=bookTitle;
}

public String toString(){
        return "Book Name "+Title;
}
}
