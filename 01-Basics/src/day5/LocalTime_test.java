package day5;

import java.time.LocalTime;

public class LocalTime_test {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		LocalTime t1 = LocalTime.of(11, 30,29);
		LocalTime t2 = LocalTime.parse("04:30");
		
		System.out.println("Current: " + now);
		System.out.println("Prev Hour: " + now.minusHours(1));
		System.out.println("Hour: " + now.getHour());
		System.out.println("Min: " + now.getMinute());
	}
}
