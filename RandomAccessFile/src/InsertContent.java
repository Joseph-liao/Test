import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;


public class InsertContent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file =File.createTempFile("tmp", null);
			FileInputStream fis =new FileInputStream(file);
			FileOutputStream fos=new FileOutputStream(file);
			
			RandomAccessFile raf =new RandomAccessFile("out.txt", "rw");
			raf.seek(2l);
			byte[] bbuf =new byte[64];
			int haveRead=0;
			while((haveRead=raf.read(bbuf))>0){
				fos.write(bbuf,0,haveRead);
			}
			
			raf.seek(2l);
			raf.write("这是我新加的内容".getBytes());
			
			while((haveRead=fis.read(bbuf))>0){
				raf.write(bbuf,0,haveRead);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
