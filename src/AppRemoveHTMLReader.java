import java.io.BufferedReader;
import java.io.FileReader;

/** This class defines a main() method to test the RemoveHTMLReader */
public class AppRemoveHTMLReader {
	/** The test program: read a text file, strip HTML, print to console */
	public static void main(String[] args) {
		try {
			if (args.length != 1)
				throw new IllegalArgumentException("Wrong number of arguments");
			// Create a stream to read from the file and strip tags from it
			BufferedReader in = new BufferedReader(new RemoveHTMLReader(new FileReader(args[0])));
			// Read line by line, printing lines to the console
			String line;
			while ((line = in.readLine()) != null)
				System.out.println(line);
			in.close(); // Close the stream.
		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Usage: java AppRemoveHTMLReader <filename>");
		}
	}
}