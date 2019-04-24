import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	
    private static final String PATH = "./sample/file.txt";

    public static void main(String[] args) {
        try {
            //1
            RandomAccessFile raFile = new RandomAccessFile(PATH, "r");

            //2
            raFile.seek(0);
            byte[] bytes = new byte[4];

            //3
            raFile.read(bytes);
            System.out.println(new String(bytes));

            //4
            raFile.seek(10);
            raFile.read(bytes);
            raFile.close();

            System.out.println(new String(bytes));
        } catch(FileNotFoundException e) {
        	e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

