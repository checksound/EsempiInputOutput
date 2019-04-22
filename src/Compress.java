
// This example is from _Java Examples in a Nutshell_. (http://www.oreilly.com)
// Copyright (c) 1997 by David Flanagan
// This example is provided WITHOUT ANY WARRANTY either expressed or implied.
// You may study, use, modify, and distribute it for non-commercial purposes.
// For any commercial use, see http://www.davidflanagan.com/javaexamples

import java.io.*;
import java.util.zip.*;

/**
 * This class defines two static methods for gzipping files and zipping
 * directories. It also defines a demonstration program as a nested class.
 **/
public class Compress {
	/** Gzip the contents of the from file and save in the to file. */
	public static void gzipFile(String from, String to) throws IOException {
		// Create stream to read from the from file
		FileInputStream in = new FileInputStream(from);
		// Create stream to compress data and write it to the to file.
		GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(to));
		// Copy bytes from one stream to the other
		byte[] buffer = new byte[4096];
		int bytes_read;
		while ((bytes_read = in.read(buffer)) != -1)
			out.write(buffer, 0, bytes_read);
		// And close the streams
		in.close();
		out.close();
	}

	/** Zip the contents of the directory, and save it in the zipfile */
	public static void zipDirectory(String dir, String zipfile) throws IOException, IllegalArgumentException {
		// Check that the directory is a directory, and get its contents
		File d = new File(dir);
		if (!d.isDirectory())
			throw new IllegalArgumentException("Compress: not a directory:  " + dir);
		String[] entries = d.list();
		byte[] buffer = new byte[4096]; // Create a buffer for copying
		int bytes_read;

		// Create a stream to compress data and write it to the zipfile
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipfile));

		// Loop through all entries in the directory
		for (int i = 0; i < entries.length; i++) {
			File f = new File(d, entries[i]);
			if (f.isDirectory())
				continue; // Don't zip sub-directories
			FileInputStream in = new FileInputStream(f); // Stream to read file
			ZipEntry entry = new ZipEntry(f.getPath()); // Make a ZipEntry
			out.putNextEntry(entry); // Store entry in zipfile
			while ((bytes_read = in.read(buffer)) != -1) // Copy bytes to zipfile
				out.write(buffer, 0, bytes_read);
			in.close(); // Close input stream
		}
		// When we're done with the whole loop, close the output stream
		out.close();
	}
}
