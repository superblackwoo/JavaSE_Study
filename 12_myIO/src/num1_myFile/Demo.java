package num1_myFile;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("12_myIO\\test");
        File f2 = new File(f1, "java.txt");
        System.out.println(f1.mkdir());
        System.out.println(f2.createNewFile());

        //
    }
}
