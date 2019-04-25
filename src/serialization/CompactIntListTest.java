package serialization;

import java.io.File;

public class CompactIntListTest {

	/** A main() method to prove that it works */
	public static void main(String[] args) throws Exception {
		CompactIntList list = new CompactIntList();
		for (int i = 0; i < 100; i++)
			list.add((int) (Math.random() * 40000));
		CompactIntList copy = (CompactIntList) Serializer.deepclone(list);
		if (list.equals(copy))
			System.out.println("equal copies");
		Serializer.store(list, new File("compactintlist.ser"));
	}
}
