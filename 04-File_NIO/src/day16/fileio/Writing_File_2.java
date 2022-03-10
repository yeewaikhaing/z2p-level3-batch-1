package day16.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Writing_File_2 {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("student.txt");
		
		String data = """
					Name: Aung Aung
					Address: Yangon
					Age: 26
				""";
	
		Files.writeString(path, data);
		System.out.println("write success");
	}
}
