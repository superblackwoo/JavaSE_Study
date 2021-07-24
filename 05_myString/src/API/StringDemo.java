package API;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1: " + s1);

        char[] ch = {'a', 'b', 'c'};
        String s2 = new String(ch);
        System.out.println("s2: " + s2);

        byte[] by = {97, 98, 99};
        String s3 = new String(by);
        System.out.println("s3: " + s3);

        String s4 = "aba aba aba";
        System.out.println("s4: " + s4);


        String username = "superblackwoo";
        String paswd = "ayo";
        //userLogIn(username, paswd);
        //sortString();
        //countChara();

        /*格式化输出数组*/
        int[] test = {1, 2, 3, 5, 6};
        String s = atoString(test);
        System.out.println(s);

        /*反转字符串*/
        String ss = reverseStr();
        System.out.println(ss);
    }


    //用户登录
    public static void userLogIn(String username, String paswd) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String input_usr = sc.nextLine();
            System.out.println("请输入密码：");
            String input_psw = sc.nextLine();
            if (input_usr.equals(username) && input_psw.equals(paswd)) {
                System.out.println("登陆成功！");
                break;
            } else {
                if (i != 2) {
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会");
                } else {
                    System.out.println("账户被锁定请与管理员联系");
                }
            }
        }
    }

    //遍历字符串
    public static void sortString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String target = sc.nextLine();
        for (int i = 0; i < target.length(); i++) {
            System.out.println(target.charAt(i));
        }
    }

    //字符计数
    public static void countChara() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String target = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= '0' && ch < '9') {
                numCount++;
            }
        }
        System.out.println("大写字母：" + bigCount + "个");
        System.out.println("小写字母：" + smallCount + "个");
        System.out.println("数字：" + numCount + "个");
    }

    //格式化输出整数数组
    public static String atoString(int[] arr) {
        String s = "";
        s += "[";
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }


    //字符串反转
    public static String reverseStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String target = sc.nextLine();
        String out = "";
        for (int i = target.length() - 1; i >= 0; i--) {
            out += target.charAt(i);
            //System.out.println(target.charAt(i));
        }
        return out;
    }
}
