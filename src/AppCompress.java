import java.io.File;
import java.io.IOException;

public class AppCompress {
	/**
	 * Compress a specified file or directory. If no destination name is specified,
	 * append .gz to a file name or .zip to a directory name
	 **/
	public static void main(String args[]) throws IOException {
		if ((args.length != 1) && (args.length != 2)) { // check arguments
			System.err.println("Usage: java AppCompress <from> [<to>]");
			System.exit(0);
		}
		String from = args[0], to;
		File f = new File(from);
		boolean directory = f.isDirectory(); // Is it a file or directory?
		if (args.length == 2)
			to = args[1];
		else { // If destination not specified
			if (directory)
				to = from + ".zip"; // use a .zip suffix
			else
				to = from + ".gz"; // or a .gz suffix
		}

		if ((new File(to)).exists()) { // Make sure not to overwrite anything
			System.err.println("Compress: won't overwrite existing file: " + to);
			System.exit(0);
		}

		// Finally, call one of the methods defined above to do the work.
		if (directory)
			Compress.zipDirectory(from, to);
		else
			Compress.gzipFile(from, to);
	}
}