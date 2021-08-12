package num2_myByteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("12_myIO\\src\\num2_myByteStream\\yaya.txt");

        fos.write(97);
        fos.write(7);
    }
}
