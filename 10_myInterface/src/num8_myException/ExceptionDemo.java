package num8_myException;

import num6_simpleDateFormat.SimpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) throws ScoreException {
        System.out.println("开始");
        //method();
        method2();
        method3();

        //throws抛出异常的处理方法：
        try {
            method4();
        }catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }

        System.out.println("结束");


        //测试自己的异常类
        Teacher t = new Teacher();
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        try {
            t.checScore(score);
        }catch (ScoreException s){
            s.printStackTrace();
        }
        System.out.println("结束");
    }

    public static void method() {
        int[] a = {1, 2, 3};
        System.out.println(a[3]);
    }


    //运行时异常
    public static void method2() {
        //try  catch  虽然有异常但是仍然可以继续执行
        int[] a = {1, 2, 3};
        try {
            System.out.println(a[3]);  // new ArrayIndexOutOfBoundsException()
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("访问数组超界");
            System.out.println("------");


            //ThroTable中的三个成员方法
            e.printStackTrace();
            System.out.println(e.getMessage()); //返回异常出现的原因
            System.out.println(e.toString());
        }
    }

    //编译时异常： 运行时有可能出现，也有可能不出现
    public static void method3() {
        try {
            String s = "2020-08-06";
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-月打dd");
            Date d = new Date();
            d = sdf.parse(s);
            System.out.println(d);
        } catch (ParseException pp) {
            pp.printStackTrace();
        }
    }


    //抛出异常，不对进行处理 ， 在调用时处理
    public static void method4() throws ArrayIndexOutOfBoundsException {
        int[] a = {1, 2, 3};
        System.out.println(a[3]);
    }
}
