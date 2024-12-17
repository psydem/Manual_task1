package poly;

public class Book {
String titleString;
String authorString;
double price;
public Book(String title, String author, double price)
{
	this.titleString=title;
	this.authorString=author;
	this.price=price;
}
public void displayBook() {
	System.out.println("Title: "+titleString);
	System.out.println("Author: "+authorString);
	System.out.println("Price: "+price);
}
public static void main(String[] args) {
	Book aBook=new Book("It End with Us", "Coover", 1500);
	aBook.displayBook();
}
}
