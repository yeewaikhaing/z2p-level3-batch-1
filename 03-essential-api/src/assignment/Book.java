package assignment;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class Book {
public int code = 1;
private String title;
private LocalDate publicData;
private String category;
private Author author;
public Book(String title, LocalDate publicData, String category, Author author) {
	super();
	
	
	this.code = code;
	this.title = title;
	this.publicData = publicData;
	this.category = category;
	this.author = author;
	code += 1;
	
}
public static void ShowBook(List<Book> books) {
	System.out.println("No\t"+"Author\t\t\t"+"Titel\t\t\t\t"+"Category\t\t\t"+"Date");
	int i = books.size();
	IntStream.range(0, i)
						.forEach(index ->System.out.println((index + 1) + "\t" + books.get(index).author.getName() + "\t\t" + books.get(index).getTitle() + "\t\t\t" + books.get(index).getCategory() + "\t\t\t" + books.get(index).getPublicData()));
}

public static void ShowBook_By_author_name(Scanner input,List<Book> books,List<Author> author) throws Error{
	while(true) {
		int i = author.size();
		System.out.println("Choice The author Whose You want to see : ");
		IntStream.range(0, i)
						.forEach(index -> System.out.println((index + 1 ) + "->" + author.get(index).getName()));
		String user_input_auth_name = input.nextLine();
		
		List<String> books_2 = books
								.stream()
								.map(e -> e.getAuthor().getName())
								.collect(Collectors.toList());
		
		List<String> author_2 = author
								.stream()
								.map(e -> e.getName())
								.collect(Collectors.toList());
		
		
		if  (author_2.contains(user_input_auth_name) && !books_2.contains(user_input_auth_name)) {
			throw new Error("There is no book data for this author!!!");
		}
		else if (!books_2.contains(user_input_auth_name)) {
			throw new Error("This author does not exist");
		}
		else {
			//Collections.sort(books_2);
			int result = findBookByAuthor(books_2,user_input_auth_name);
			
			//int result = Collections.
			System.out.println(books_2);
			System.out.println(result);
			System.out.println("No\t"+"Author\t\t\t"+"Titel\t\t\t\t"+"Category\t\t\t"+"Date");
			System.out.println(books.get(result).getCode() + "\t" + books_2.get(result) + "\t\t" + books.get(result).getTitle() + "\t\t\t" + books.get(result).getCategory() + "\t\t\t" + books.get(result).getPublicData());
		}
		break;
	}}
private static int findBookByAuthor(List<String> books_2, String user_input_auth_name) {
	int index = 0;
	for(var i = 0; i < books_2.size();i++) {
		if(books_2.get(i).equalsIgnoreCase(user_input_auth_name)) {
			index = i;
			break;
		}
	}
	return index;
}
public static void ShowBook_By_category(Scanner input,List<Book> books,List<String> cate) throws Error{
	while(true) {
		int i = cate.size();
		System.out.println("Choice The Categroy which You want to see : ");
		IntStream.range(0, i)
						.forEach(index -> System.out.println((index + 1 ) + "->" + cate.get(index)));
		String user_input_cate_name = input.nextLine();
		List<String> books_2 = books
								.stream()
								.map(e -> e.getCategory())
								.collect(Collectors.toList());	
		if (cate.contains(user_input_cate_name) && !books_2.contains(user_input_cate_name)) {
			throw new Error("There is no book data for this Category!!!");
		}
		else if(!books_2.contains(user_input_cate_name)) {
			throw new Error("This Category does not exist");
		}
		else {
			int result = Collections.binarySearch(books_2, user_input_cate_name);
			System.out.println("No\t"+"Author\t\t\t"+"Titel\t\t\t\t"+"Category\t\t\t"+"Date");
			System.out.println(books.get(result).getCode() + "\t" + books_2.get(result) + "\t\t" + books.get(result).getTitle() + "\t\t\t" + books.get(result).getCategory() + "\t\t\t" + books.get(result).getPublicData());
		
		}
		break;
		
	}
	
}	
public static void addNewBook(Scanner input,List<Book> books,List<Author> auth,List<String> cate) {
	System.out.println("Title : ");
	String Title = input.nextLine();
	
	
	LocalDate date = LocalDate.now();
	
	System.out.println("Category :");
	String cate_input = input.nextLine();
	
	System.out.println("Author : ");
	String name = input.nextLine();
	List<String> author_2 = auth
			.stream()
			.map(e -> e.getName())
			.collect(Collectors.toList());
	if(!author_2.contains(name)) {
		System.out.println("This is new author.Plaese enter author's city name : ");
		String auth_city = input.nextLine();
		auth.add(new Author(name,auth_city));
	}
	if(!cate.contains(cate_input)) {
		System.out.println("This is new Category!!!");
		Demo.add_new_category(cate_input);
	}
	List<String> author_3 = auth
			.stream()
			.map(e -> e.getName())
			.collect(Collectors.toList());
	int result = Collections.binarySearch(author_3, name);
	books.add(new Book(Title, date, cate_input, auth.get(result)));
	ShowBook(books);
	
	
	
}
	
	


public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public LocalDate getPublicData() {
	return publicData;
}
public void setPublicData(LocalDate publicData) {
	this.publicData = publicData;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}


}
