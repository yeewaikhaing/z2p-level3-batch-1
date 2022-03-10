package day16.fileio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Read_large_file_with_filechannel {

	public static void main(String[] args) {
		
		Path path = Path.of("src/day16/fileio/employee.txt");
		try(FileChannel channel = FileChannel.open(path, StandardOpenOption.READ)){
			
			int bufferSize = 50;
			if(bufferSize > channel.size())
				bufferSize = (int)channel.size();
			
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
			
			while(channel.read(buffer) > 1) {
				buffer.flip();
				String data = new String(buffer.array(),0,buffer.limit());
				System.out.println("content: " + data);
				buffer.clear();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
