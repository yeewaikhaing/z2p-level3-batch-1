package day15.fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class List_Contents {

	public static void main(String[] args) {
		Path path = Path.of(".");
		
		try(Stream<Path> fileList = Files.list(path)){
			fileList.forEach(System.out::println);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------------------------");
		
		try(Stream<Path> fileList = Files.walk(path)){
			
			//System.out.println("**** files and directors ***");
			//fileList.forEach(System.out::println);
			
			System.out.println(" *** only directories ****");
			//fileList.filter(Files::isDirectory).forEach(System.out::println);
			fileList.filter(p -> p.toString().contains(".java")).forEach(System.out::println);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
