package num3_myBufferStream;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

/**
 * 复制视频：四种方法比较时间
 * 1.基本字节流按字节读写
 * 2.基本字节流按字节数组读写
 * 3.字节缓冲流按字节读写
 * 4.字节缓冲流按字节数组读写
 **/
public class Demo1_CopyVideo {
    public static void main(String[] args) throws IOException {
        //方法一：
        long start_time = System.currentTimeMillis();
        method1();
        long end_time = System.currentTimeMillis();
        System.out.println("1.基本字节流按字节读写, 用时：" + (end_time - start_time) + "毫秒");

        //方法二：
        start_time = System.currentTimeMillis();
        method2();
        end_time = System.currentTimeMillis();
        System.out.println("2.基本字节流按字节数组读写, 用时：" + (end_time - start_time) + "毫秒");

        //方法三：
        start_time = System.currentTimeMillis();
        method3();
        end_time = System.currentTimeMillis();
        System.out.println("3.字节缓冲流按字节读写, 用时：" + (end_time - start_time) + "毫秒");

        //方法四：
        start_time = System.currentTimeMillis();
        method4();
        end_time = System.currentTimeMillis();
        System.out.println("4.字节缓冲流按字节数组读写, 用时：" + (end_time - start_time) + "毫秒");
    }

    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("12_myIO\\test\\1515.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\WorkStation\\1515.mp4");

        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        fis.close();
        fos.close();
    }

    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("12_myIO\\test\\1515.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\WorkStation\\1516.mp4");

        //一次读一个字节数组
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("12_myIO\\test\\1515.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\WorkStation\\1517.mp4"));

        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        bis.close();
        bos.close();
    }

    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("12_myIO\\test\\1515.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\WorkStation\\1518.mp4"));

        byte[] bytes = new byte[2048];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
