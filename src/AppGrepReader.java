import java.io.FileReader;

/**
 * This class demonstrates the use of the GrepReader class. It prints the lines
 * of a file that contain a specified substring.
 **/
public class AppGrepReader {
	public static void main(String args[]) {
		try {
			if (args.length != 2)
				throw new IllegalArgumentException("Wrong number of arguments");
			GrepReader in = new GrepReader(new FileReader(args[1]), args[0]);
			String line;
			while ((line = in.readLine()) != null)
				System.out.println(line);
			in.close();
		} catch (Exception e) {
			System.err.println(e);
			System.out.println("Usage: java AppGrepReader <pattern> <file>");
		}
	}
}