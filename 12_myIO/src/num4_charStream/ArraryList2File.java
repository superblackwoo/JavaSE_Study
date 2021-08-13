package num4_charStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ArraryList2File {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arraryList = new ArrayList<String>();

        arraryList.add("java");
        arraryList.add("EE");
        arraryList.add("hello");

        BufferedWriter bw= new BufferedWriter(new FileWriter("12_myIO\\test\\array.txt"));

        for(String s : arraryList){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
