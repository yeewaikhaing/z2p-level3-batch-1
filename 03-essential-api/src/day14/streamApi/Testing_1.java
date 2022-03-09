package day14.streamApi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Testing_1 {

	public static void main(String[] args) {
		int[] prices = {1700, 3500,3800, 2200, 5000, 13500, 500, 1500, 100};
		
		IntStream streams = Arrays.stream(prices);
		
		streams.filter(d -> d > 1500)
				.sorted()
				.forEach(p -> System.out.println(p));
	}
}
