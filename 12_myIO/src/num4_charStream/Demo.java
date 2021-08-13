package num4_charStream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Demo {
    public static void main(String[] args) {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("12_myIO\\test\\osw.txt"));
    }
}
