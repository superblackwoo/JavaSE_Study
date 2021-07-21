package Method_l1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {23, 4234, 45, 34, 6, 4564, 645, 64, 64, 6};
        readArray(arr);
        System.out.println(Max(arr));
        //lossFat();
        sevenPass();
        rabbit();
        chicken();
        chicken1();
        arrSum();

        ////判断两个数组是否完全相同
        int[] a1 = {11, 22, 33, 44, 55};
        int[] a2 = {11, 22, 33, 44, 55};
        int[] a3 = {11, 22, 3, 44, 55};
        boolean isSame = checkArr(a1, a2);
        System.out.println("a1 a2 is " + isSame);
        isSame = checkArr(a2, a3);
        System.out.println("a2 a3 is " + isSame);


        //查找
        //findKey();
        int index = findKey(a1, 33);
        System.out.println("index: " + index);
        intervise(a1);
        givePoint();
    }

    //数组遍历
    public static void readArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.print("]");
    }

    //数组最大值
    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    //数组最小值
    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    public static void lossFat() {
        System.out.println("输入星期几：");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        while (day < 1 || day > 7) {
            System.out.println("Wrong input! ");
            day = sc.nextInt();
        }
        switch (day) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("恰饭");
                break;
            default:
                System.out.println("输入乱整");

        }
    }

    public static void sevenPass() {
        for (int i = 1; i < 101; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) System.out.println(i);
            /*int ge = i % 10;
            int shi = i / 10;
            if (ge == 7) {
                System.out.println(i);
                continue;
            } else if (i % 7 == 0) {
                System.out.println(i);
                continue;
            } else if (shi == 7) {
                System.out.println(i);
                continue;
            }*/
        }
    }


    public static void rabbit() {
        //生兔子问题
        int[] rabbits = new int[20];
        rabbits[0] = 1;
        rabbits[1] = 1;
        System.out.print("[1, 1, ");
        for (int i = 2; i < 20; i++) {
            rabbits[i] = rabbits[i - 1] + rabbits[i - 2];
            System.out.print(rabbits[i] + ", ");
        }
        System.out.println("]");
    }


    //百钱百鸡问题
    public static void chicken() {
        for (int fa = 0; fa <= 20; fa++) {
            for (int ma = 0; ma <= 33; ma++) {
                for (int son = 0; son <= 300; son++) {
                    if (fa + ma + son == 100 && fa * 5 + ma * 3 + son / 3 == 100
                            && son % 3 == 0) {
                        System.out.println("鸡翁：" + fa + "鸡母" + ma + "鸡仔" + son);
                    }
                }
            }
        }
    }

    public static void chicken1() {
        System.out.println();
        for (int fa = 0; fa <= 20; fa++) {
            for (int ma = 0; ma <= 33; ma++) {
                int son = 100 - fa - ma;
                if (fa + ma + son == 100 && fa * 5 + ma * 3 + son / 3 == 100
                        && son % 3 == 0) {
                    System.out.println("鸡翁：" + fa + "鸡母" + ma + "鸡仔" + son);
                }
            }
        }
    }

    //数组指定元素求和
    public static void arrSum() {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7)
                sum += arr[i];
        }
        System.out.println("arrSum = " + sum);
    }

    public static int arrSum(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
                sum += arr[i];
        }
        System.out.println("arrSum = " + sum);
        return sum;
    }



    //判断两个数组是否完全相同
    public static boolean checkArr(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }


    //查找
    public static void findKey() {
        int[] a = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Input the Key: ");
        int key = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("The Key is " + i + " in Arrary");
                flag = 1;
                break;
            }
        }
        if (flag == 0) System.out.println("Not find!");
    }


    public static int findKey(int[] a, int key) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("The Key is " + i + " in Arrary");
                index = i;
                break;
            }
        }
        return index;
    }

    //反转
    public static void intervise(int[] a) {
        int start = 0;
        int end = a.length - 1;
        int temp = 0;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start += 1;
            end -= 1;
        }
        readArray(a);
    }


    //评委打分
    public static void givePoint() {
        int[] points = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<points.length;i++){
            System.out.print("\n评委" + (i+1) +"打分：");
            points[i] = sc.nextInt();
        }
        int max = Max(points);
        int min = Min(points);
        double point_avr = (double)(arrSum(points) - max - min) / 4;
        System.out.println("Final point: " + point_avr);
    }
}
