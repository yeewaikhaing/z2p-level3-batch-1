package assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
	
	static String[] cate = {"It","Business","Political","Health"};
	public static List<String> categoryList = new ArrayList<>(Arrays.asList(cate));
	static List<Author> authorList = new ArrayList<Author>();
	static List<Book> booklist = new ArrayList<Book>();
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			authorList.add(new Author("Mg Mg Gyi", "Mandalay"));
			authorList.add(new Author("Hla Thun", "Yangon"));
			authorList.add(new Author("Dr.Saw Maung", "Taung Gyii"));
			authorList.add(new Author("Dj Emo Boy", "Yangon"));
			authorList.add(new Author("Simpl3", "PaGan"));
			
			
			LocalDate date1 = LocalDate.of(1990, 1, 5);
			LocalDate date2 = LocalDate.of(1995, 3, 15);
			LocalDate date3 = LocalDate.of(2015, 9, 23);
			booklist.add(new Book("Python Beginner Guide", date3, categoryList.get(0), authorList.get(1) ));
			booklist.add(new Book("War and Peace", date1, categoryList.get(2), authorList.get(0) ));
			booklist.add(new Book("Fixing Liver", date3, categoryList.get(3), authorList.get(2) ));
			
			Book.ShowBook(booklist);
			Book.ShowBook_By_author_name(sc, booklist, authorList);
			
//			Book.ShowBook_By_category(sc, booklist, categoryList);
			
			Book.addNewBook(sc, booklist, authorList, categoryList);
			
		} catch (Error e) {
			System.err.println("Error Message : " + e.getMessage());
		}
		
		
		
}
public static void add_new_category(String cate) {
		categoryList.add(cate);
	}

}


