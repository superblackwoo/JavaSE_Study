package num4_charStream;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("12_myIO\\test\\osw.txt",true),"GBK");
        osw.write("第一觉得卡拉点击按钮斯大林时代和");
        osw.close();

        InputStreamReader osr = new InputStreamReader(new FileInputStream("12_myIO\\test\\osw.txt"),"GBK");
        int len;
        while((len = osr.read()) != -1){
            System.out.print((char) len);
        }
        osr.close();


        //----------------------------------------------------------------------------
        //复制java文件
        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("12_myIO\\test\\After_Copy.java"));

        InputStreamReader isr1  = new InputStreamReader(new FileInputStream("12_myIO\\test\\Demo1_CopyVideo.java"));

        while((len=isr1.read()) != -1){
            osw1.write(len);
        }

        osw1.close();
        isr1.close();


    }
}
