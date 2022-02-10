package day4;

import java.util.Arrays;

public class Array_3 {

	public static void main(String[] args) {
		int[][] marks = {
				{65,73,86,84,59},
				{71,80,90,69,95},
				{75,75,99,96,99}
		};
		
		//display
		for(var r = 0; r < 3;r++) {
			for(var c = 0; c < 5;c++)
				System.out.print(marks[r][c] + "\t");
			System.out.println();
		}
		System.out.println("*** with foreach ***");
		for(int[]row : marks)//rows
		{
			for(int col : row)
				System.out.print(col + "\t");
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(marks));
	}
}
