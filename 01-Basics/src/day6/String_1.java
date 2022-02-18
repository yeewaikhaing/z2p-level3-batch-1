package day6;

import java.util.Arrays;

public class String_1 {

	public static void main(String[] args) {
		String s1 = "MMIT";
		String s2 = new String(new char[] {'m','m','i','t'});
		String s3 = new String("Java Programming");
		
		System.out.println("s1: " + s1.length());
		System.out.println("s3: " + s3.length());
		
		String lower = s1.toLowerCase();/// immutable
		System.out.println("lower: " + lower);
		System.out.println("Afer lowercase,s1: " + s1);
		
		//substring(start,end) -> start, end-1
		String substr = s3.substring(4,207);//0,3
		System.out.println("substr: " + substr);
		System.out.println("replace: " + s3.replace("Java", "PHP"));
		System.out.println("After replace,s3: " + s3);
		
		System.out.println("Concat: " + s3.concat(" Language!"));
		System.out.println("contains: " + s3.contains("java"));
		System.out.println("starwith: " + s3.startsWith("php"));
		System.out.println("endwith: " + s3.endsWith("ing"));
		
		System.out.println("location of 'a': " + s3.indexOf("a"));
		System.out.println("location of /: " + s3.indexOf("/"));
		System.out.println("location of 'a': " + s3.lastIndexOf("a"));
		
		String[] arry = s3.split(" ");
		System.out.println(Arrays.toString(arry));
		
		char[] s1Arry = s1.toCharArray();
		System.out.println(Arrays.toString(s1Arry));
		
		String str = String.valueOf(s1Arry);
		System.out.println("str: " + str);
		System.out.println("int: " + String.valueOf(1000));
		System.out.println("bool: " + String.valueOf(true));
	}
}
