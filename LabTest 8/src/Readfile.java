import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
public class Readfile {
	public static void main(String[] args) throws IOException {
		File f= new File("sagar.txt");
		try {
			RandomAccessFile rFile=new RandomAccessFile(f,"r");
			rFile.seek(f.length()-10);
			
			for (int i = 0; i < 10; i++) {
				System.out.print((char)rFile.read());
			}
			rFile.close();
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		}

}
