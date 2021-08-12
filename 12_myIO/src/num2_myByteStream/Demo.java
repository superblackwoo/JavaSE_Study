package num2_myByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("12_myIO\\src\\num2_myByteStream\\yaya.txt",true);

        fos.write(97);
        fos.write(7);

        String s = "\nnmmp";

        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);

        fos.write(bytes);
        fos.write(bytes,2,3);
        fos.close();  //释放资源

        //追加写入
        FileOutputStream fos1 = new FileOutputStream("12_myIO\\src\\num2_myByteStream\\yaya.txt",true);
        for(int i = 0;i<10;i++){
            fos1.write(bytes);
        }

        fos1.close();




        //--------------------------------------------------------------------------------------
        //读取
        FileInputStream fis = new FileInputStream("12_myIO\\src\\num2_myByteStream\\yaya.txt");
    /*
    * fis.read()：读数据
    * by = fis.read()：赋值
    * while：判断
    *
    * */
        int by;
        while((by = fis.read()) != -1){
            System.out.print((char)by);
        }
        fis.close();
    }
}
