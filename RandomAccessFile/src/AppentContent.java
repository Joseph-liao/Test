import java.io.IOException;
import java.io.RandomAccessFile;


public class AppentContent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf =new RandomAccessFile("out.txt", "rw");
			raf.seek(raf.length());
			raf.write("×·¼ÓÄÚÈÝ".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
