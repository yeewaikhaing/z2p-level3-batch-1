package day16.fileio;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Writing_BufferWriter {

	public static void main(String[] args) {
		Path path = Path.of("test/tester.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(path)){
			writer.write("Bufferwriter is the simplest way of writing text data into file.");
			writer.write("It buffers characters to imporve performance.");
			writer.newLine();
			writer.write("As it buffers before writing");
			
			writer.flush(); // write buffer to file and don't close connection
			writer.write("\nSo it results in less IO operation");
			System.out.println("Write successs");
			//writer.close(); // write buffer to file and close connection
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
