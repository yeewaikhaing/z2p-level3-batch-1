package day15.fileio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ConstrcutingPath {

	public static void main(String[] args) {
		// < java11
		Path path = Paths.get("E:\\ProgrammingFundamentals\\Files\\readme.txt");
		System.out.println("Path: " + path);
		
		// +java11
		path = Path.of("E:\\ProgrammingFundamentals\\Files\\readme.txt");
		System.out.println("Path: " + path);
		
		path = Path.of("E/ProgrammingFundamentals/Files/readme.txt");
		System.out.println("Path: " + path);
		
		path = Path.of("E","ProgrammingFundaments","Files","readme.txt");
		System.out.println("Path: " + path);
		
		path = Path.of("E","PrograammingFundaments","Files").resolve("readme.txt");
		System.out.println("Path: " + path);
		
		path = Path.of("./src/day15/fileio/ConstructingPath.java");
		System.out.println("Path: " + path);// relative or current path
		System.out.println("Path: " + path.toAbsolutePath());
		
		path = Path.of("src","day15","fileio","ConstructionPath.java");
		System.out.println("Path: " + path);
	}
}
