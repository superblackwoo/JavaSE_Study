package Method_l1;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        //while(true) isEvenNumber();
        getMax();
        Scanner sc = new Scanner(System.in);

        //带参数的方法的调用：
        /*System.out.println("input number a:");
        int a = sc.nextInt();
        System.out.println("input number b:");
        int b = sc.nextInt();
        getMax_with_Para(a, b);
        getMax_with_Para(50, 100);
*/
        //带返回值的方法的调用：
        int result = getMax_2(89, 60);
        System.out.println(result);
        System.out.println(getMax_2(34, 55));

        //方法重载
        int test1 = sumwoo(90, 80);
        int test2 = sumwoo(90, 90, 78);
        double test3 = sumwoo(78.9, 76.9077);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }


    //不含参数的方法：
    public static void isEvenNumber() {
        System.out.println("Input the Number Please:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(true + "\n");
        } else {
            System.out.println(false + "\n");
        }
    }

    public static void getMax() {
        int a = 9;
        int b = 7;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }


    //带参数的方法：
    public static void getMax_with_Para(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    //带返回值的方法：
    public static int getMax_2(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //方法重载
    //与返回值无关
    public static int sumwoo(int a, int b) {
        return a + b;
    }

    public static double sumwoo(double a, double b) {
        return a + b;
    }

    public static int sumwoo(int a, int b, int c) {
        return a + b + c;
    }
}
