import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf =new RandomAccessFile("src/RandomAccessFileTest.java", "r");
			System.out.println("文件指针开始位置为："+raf.getFilePointer());
			raf.seek(100l);
			int haveRead=0;
			byte [] bbuf =new byte[1024];
			while((haveRead=raf.read(bbuf))>0){
				System.out.println(new String(bbuf,0,haveRead));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
