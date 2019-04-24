import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest2 {
	
    private static final String PATH = "./sample/file2.txt";

    public static void main(String[] args) {
        try {
        	//1
            RandomAccessFile raFile=new RandomAccessFile(PATH,"rw");

            //2
            raFile.seek(4);
            raFile.write("Hello".getBytes());
            raFile.close();
            
        } catch(FileNotFoundException e) {
        	e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

