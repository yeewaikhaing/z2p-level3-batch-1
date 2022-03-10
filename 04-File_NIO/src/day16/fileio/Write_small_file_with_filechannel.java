package day16.fileio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Write_small_file_with_filechannel {

	public static void main(String[] args) {
		String data = """
				FileChannel can be faster than
				Standard IO if you are dealing with large file.
				""";
	
		try(RandomAccessFile inpuFile = new RandomAccessFile("data.txt", "rw")){
			
			// create file channel
			FileChannel channel = inpuFile.getChannel();
			// create buffer
			byte[] byteData = data.getBytes();
			ByteBuffer buffer = ByteBuffer.allocate(byteData.length);
			// write from java to buffer
			buffer.put(byteData);
			// flip
			buffer.flip();
			// write data from buffer to dest file with filechannel
			channel.write(buffer);
			System.out.println("success");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
