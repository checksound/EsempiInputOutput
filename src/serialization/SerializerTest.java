package serialization;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/**
 * This is a simple serializable data structure that we use below for testing
 * the methods above
 **/

class DataStructure implements Serializable {
	String message;
	int[] data;
	DataStructure other;

	public String toString() {
		String s = message;
		for (int i = 0; i < data.length; i++)
			s += " " + data[i];
		if (other != null)
			s += "\n\t" + other.toString();
		return s;
	}
}

public class SerializerTest {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Create a simple object graph
		DataStructure ds = new DataStructure();
		ds.message = "hello world";
		ds.data = new int[] { 1, 2, 3, 4 };
		ds.other = new DataStructure();
		ds.other.message = "nested structure";
		ds.other.data = new int[] { 9, 8, 7 };

		// Display the original object graph
		System.out.println("Original data structure: " + ds);

		// Output it to a file
		File f = new File("datastructure.ser");
		System.out.println("Storing to a file...");
		Serializer.store(ds, f);

		// Read it back from the file, and display it again
		ds = (DataStructure) Serializer.load(f);
		System.out.println("Read from the file: " + ds);

		// Create a deep clone and display that. After making the copy
		// modify the original to prove that the clone is "deep".
		DataStructure ds2 = (DataStructure) Serializer.deepclone(ds);
		ds.other.message = null;
		ds.other.data = null; // Change original
		System.out.println("Deep clone: " + ds2);
	}
}