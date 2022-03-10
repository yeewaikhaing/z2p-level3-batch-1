package day15.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Moving_File {

	public static void main(String[] args) throws IOException {
		
		Path source = Path.of("src/myfile.txt");
		Path desst = Path.of("src/day15/fileio/myfile.txt");
		
		Files.move(source, desst, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("move success");
	}
}
