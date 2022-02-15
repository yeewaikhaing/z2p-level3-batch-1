package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CustomDateFormat {

	public static void main(String[] args) {
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh-mm-ss a");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' h:m:ss");
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Default Date: " + date);
		System.out.println("Format: " + date.format(f1));
		
		System.out.println("Default time: " + time);
		System.out.println("Format: " + time.format(f2));
		
		System.out.println("Default datetime: " + dateTime);
		System.out.println("Format: " + dateTime.format(f3));
	}
}
