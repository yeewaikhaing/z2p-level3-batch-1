package day16.fileio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class Write_lare_data_with_filechannel {

	public static void main(String[] args) {
		
		try(RandomAccessFile inputFile = new RandomAccessFile("data1.txt","rw")){
			
			FileChannel channel = inputFile.getChannel();
			
			String largeData = "Many data ......";
			
			MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 3);
			// M a n y 
			buffer.put(largeData.getBytes());
			
			//channel.write(buffer);
			System.out.println("success with channel");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
