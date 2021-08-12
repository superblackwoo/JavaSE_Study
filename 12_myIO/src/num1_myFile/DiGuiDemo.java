package num1_myFile;

import java.io.File;

public class DiGuiDemo {
    public static void main(String[] args) {
        int[] rubbits = new int[20];
        rubbits[0] = 1;
        rubbits[1] = 1;

        for (int i = 2; i < rubbits.length; i++) {
            rubbits[i] = rubbits[i - 1] + rubbits[i - 2];
        }

        System.out.println(rubbits[19]);
        System.out.println(digui(20));
        System.out.println(jiecheng(50));

        //------------------------------------------------------------------------------------------------------
        File ob = new File("./");
        seeAllRoot(ob);
    }

    public static int digui(int n) {
        return (n == 1 || n == 2) ? 1 : digui(n - 1) + digui(n - 2);
    }

    public static long jiecheng(int n) {
        return n == 1 ? 1 : n * jiecheng(n - 1);
    }

    public static void seeAllRoot(File srcFile) {
        //该路径下的所有文件（包括目录）
        File[] listFiles = srcFile.listFiles();
        if (listFiles != null) {
            for (File f : listFiles) {
                //如果是目录则递归
                if (f.isDirectory()) {
                    seeAllRoot(f);
                } else {
                    //否则就是文件输出其绝对路径
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
