package day5;

import java.time.LocalDate;

public class LocalDate_test {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalDate date1 = LocalDate.of(2016, 10, 31);
		LocalDate date2 = LocalDate.parse("2016-10-31");
		
		System.out.println("Current: " + date);
		LocalDate yesterday = date.minusDays(1);
		System.out.println("Yesterday: " + yesterday);
		System.out.println("Tomorow: " + date.plusDays(1));
		
		System.out.println("Year: " + date.getYear());
		System.out.println("Month: " + date.getMonthValue());
		System.out.println("Day of week: " + date.getDayOfWeek());
		System.out.println("Day of month: " + date.getDayOfMonth());
		
		System.out.println("Leap year(2022): " + date.isLeapYear());
		System.out.println("Leap year(2016): " + date1.isLeapYear());
		System.out.println(date1.equals(date2));
		System.out.println("2022 is after 2016: " + date.isAfter(date1));
		System.out.println("2022 is before 2016: " + date.isBefore(date1));
		
		
	}
}
