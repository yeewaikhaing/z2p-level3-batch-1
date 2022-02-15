package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PreDefinedFormat {

	public static void main(String[] args) {
		
		DateTimeFormatter f1 = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter f2 = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter f3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Default: " + date);
		System.out.println("LOCAL_DATE: " + date.format(f1));
		
		System.out.println("Time: " + time);
		System.out.println("LOCAL_TIME" + f2.format(time));
		
		System.out.println("datetime: " + dateTime);
		System.out.println("LOCAL_DATE_TIME: " + dateTime.format(f3));
		
		
	}
}
