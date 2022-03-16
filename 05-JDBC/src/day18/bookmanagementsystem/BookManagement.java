package day18.bookmanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

	public static void main(String[] args) {
		
		String input = """
				1. View Authors
				2. View Books
				3. View Categories
				4. Add Book
				Choose 1,2,3 or 4 :""";
		System.out.print(input);
		Scanner sc = new Scanner(System.in);
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {// view Authors
			viewAuthors();
		}
		else if(menu == 2) {// view books
			viewBooks();
		}
		else if(menu == 3) {// view categories
			viewCategories();
		}
		else if(menu == 4) {// add book
			addNewBook();
		}
		else
			System.err.println("Invalid number");
		sc.close();
	}

	private static void addNewBook() {
		
		Book book = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book information");
		
		System.out.print("Code: ");
		book.setCode(Integer.parseInt(sc.nextLine()));
		System.out.print("Title: ");
		book.setTitle(sc.nextLine());
		System.out.print("Publish Date(yyyy-MM-dd): ");
		book.setPublish_date(LocalDate.parse(sc.nextLine()));
		
		System.out.print("Author Name: ");
		
		System.out.print("Category Name: ");
		
		
		sc.close();
		
		
		
		sc.next();
		
	}

	private static void viewBooks() {
		
		Scanner sc = new Scanner(System.in);
		String input = """
				1. View All
				2. View By Category
				3. View by Author
				Choose 1, 2 or 3: """;
		System.out.print(input);
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			//view all
			viewAllBooks();
		}
		else if(menu == 2) {
			// view by category
			viewByCategory();
		}
		else if(menu == 3) {
			//view by author
			viewByAuthor();
		}
		else
			System.err.println("Invalid number");
		sc.close();
		
	}

	private static void viewByAuthor() {
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter author name: ");
		name = sc.nextLine();
		
		Author author = DatabaseHandler.findAuthorByName(name);
		
		if(author == null) {
			System.err.println("There is no this author name - " + name);
		}
		else {// author exist
			
			List<Book> list = DatabaseHandler.findBookByAuthor(author.getId());
			// has author but no book 
			if(list.size() == 0) {
				System.out.println("This author has no book");
			}
			else {// has author and his book
				System.out.println("Code\t Book Title \t Publish \t Category");
				System.out.println("--------------------------");
				list.forEach(book->{
					System.out.print(book.getCode() + "\t");
					System.out.print(book.getTitle() + "\t");
					System.out.print(book.getPublish_date() + "\t");
					System.out.print(book.getCategory().getName() + "\n");
				});
			}
			
		}
		
		sc.close();
		
	}

	private static void viewByCategory() {
		
		
	}

	private static void viewAllBooks() {
		
		List<Book> list = DatabaseHandler.findAllBooks();
		System.out.println("Code \t Title \t Publish Date \t Category \t Author");
		
		list.forEach(book->{
			System.out.print(book.getCode() + " \t ");
			System.out.print(book.getTitle() + " \t ");
			System.out.print(book.getPublish_date() + " \t ");
			System.out.print(book.getCategory().getName() + " \t ");
			System.out.print(book.getAuthor().getName() + "\n");
		});
		
	}

	private static void viewCategories() {
		
		List<Category> list = DatabaseHandler.retrieveCategories();
		System.out.println("Id\t Description");
		System.out.println("------------------");
		
		list.forEach(cat -> System.out.println(cat.getId() + "\t" + cat.getName()));
		
	}

	private static void viewAuthors() {
		List<Author> list = DatabaseHandler.retrieveAuthors();
		System.out.println("Id\tAuthor Name\t Country");
		System.out.println("----------------");
		list.stream().forEach(obj->{
			System.out.println(obj.getId() + "\t" + obj.getName() + "\t" + obj.getCountry());
		});
		
		}
		
}

