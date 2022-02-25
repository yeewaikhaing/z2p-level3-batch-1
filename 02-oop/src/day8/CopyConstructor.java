package day8;

import java.time.LocalDate;

public class CopyConstructor {

	public static void main(String[] args) {
		LocalDate pubDate = LocalDate.of(1961, 10, 16);
		
		Book book1 = new Book("Detective U San Shar", pubDate, 6000);
		
		System.out.println(book1.toString());
		
		Book book2 = new Book(book1);
		
		System.out.println(book2);
		
		book2.price = 7000;
		
		System.out.println("book1's price:  " + book1.price);
		System.out.println("book2's price: " + book2.price);
		
		System.out.println("+++++++");
		Book book3 = book1;//
		System.out.println("book3: " + book3);
		book3.price = 8000;
		System.out.println("book1's price: " + book1.price);
		System.out.println("book3's price: " + book3.price);
		
		
	}
	
	
}
class Book{
	String title;
	LocalDate publishDate;
	int price;
	public Book(String title, LocalDate publishDate, int price) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.price = price;
	}
	
	public Book(Book other) {
		this.title = other.title;
		this.price = other.price;
		this.publishDate = other.publishDate;
	}
	
	@Override
	public String toString() {
		String str = "[" + title + ", " + price + ", " + publishDate + "]";
		return str;
	}
}
