package num5_案例;

import java.io.*;

/**
 * 复制多级文件夹
 **/
public class CopyDir {
    public static void main(String[] args) throws IOException {
        //1.创建文件源对象，目标文件对象
        File srcFile = new File("12_myIO\\test");
        File obFilr = new File("12_myIO\\src\\num5_案例");
        //String srcFileName = srcFile.getName();

        //2.写方法实现复制文件和复制文件夹
        //3.遍历文件源的文件数组
        readAllFile(srcFile, obFilr);
    }

    public static void copyFile(File srcFile, File obFile) throws IOException {
        BufferedInputStream isr = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(obFile));

        byte[] bts = new byte[1024];
        int len;
        while ((len = isr.read(bts)) != -1) {
            bos.write(bts);
        }
        isr.close();
        bos.close();
    }


    public static void copyDir(File srcFile, File obFile) {
        String srcFileName = srcFile.getName();
        File newF = new File(obFile, srcFileName);
        newF.mkdir();
    }

    public static void readAllFile(File srcFile, File obFile) throws IOException {
        //先创建本身
        obFile = new File(obFile,srcFile.getName());
        obFile.mkdir();
        File[] fs = srcFile.listFiles();
        for (File file : fs) {
            if (file.isDirectory()) {
                //File newone = new File(file.getPath());
                copyDir(file, obFile);
                File newobfile = new File(obFile, file.getName());
                readAllFile(file, newobfile);
            } else {
                File obFilename = new File(obFile,file.getName());
                copyFile(file, obFilename);
            }
        }
    }
}
