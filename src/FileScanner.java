import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileScanner {
	public static void main(String[] args) {

		try (FileInputStream fin = new FileInputStream("src/in.txt");) {

			Scanner files = new Scanner(fin);
			files.useDelimiter(",");
			String foo = files.next();
			int bar = files.nextInt();
			String baz = files.next();

			// System.out.println(foo);
			// System.out.println(bar);
			// System.out.println(baz);

			System.out.printf("%15s | %15d | %15s", foo, bar, baz);
			files.close();

			FileOutputStream fout = new FileOutputStream("src/out.txt", true);
			PrintWriter printOut = new PrintWriter(fout);
			printOut.printf("%15s | %15d | %15s\n", foo, bar, baz);
			printOut.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
