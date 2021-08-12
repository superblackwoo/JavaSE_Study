package num2_myByteStream;

import java.io.*;

/*
* 案例：复制文件
* 源头：12_myIO\src\num2_myByteStream\yaya.txt
* 目的：12_myIO\yaya.txt
* */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("12_myIO\\src\\num2_myByteStream\\yaya.txt");

        FileOutputStream fos = new FileOutputStream("12_myIO\\yaya.txt");

        int by;
        //读一个字节，写一个字节
        while ((by = fis.read())!=-1){
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
