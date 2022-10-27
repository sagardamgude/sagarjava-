import java.io.File;

public class fileget {
	public static void main(String[] args) {
		File file=new File("sagar.txt");
		String[] s=file.list();
		System.out.println("my name is SAGAR");
		for (String string : s) {
			System.out.println(string);
		}
		System.out.println("Permission check:");
		File[] f =file.listFiles();
		for (File file2 : f) {
			
			System.out.println("File Name : "+file2.getName());
			System.out.println("Writable : "+file2.canWrite());
			System.out.println("Readable : "+file2.canRead());
			System.out.println("Executable : "+file2.canExecute()+"\n");
		}
	}

}



