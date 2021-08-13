package num4_charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class dianming {
    public static void main(String[] args) throws IOException {
        //创建缓冲字符流
        BufferedReader br = new BufferedReader(new FileReader("12_myIO\\test\\name.txt"));
        //创建集合
        ArrayList<String> al = new ArrayList<String>();

        String line;
        while ((line = br.readLine()) != null) {
            al.add(line);
        }
        br.close();

        Random r = new Random();
        line = al.get(r.nextInt(al.size()));
        System.out.println("幸运儿：" + line);
    }
}
