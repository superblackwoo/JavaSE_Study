package StringBuilder;

import java.util.Scanner;

public class Stringbuilder_Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //.append() 返回对象本身
        StringBuilder sb2 = sb.append("hello");

        System.out.println("sb: " + sb);
        System.out.println("sb2: " +sb2);
        System.out.println(sb==sb2);


        sb.append("world");
        sb.append("java");
        sb.append("100");
        System.out.println("sb: "+sb);

        //链式编程
        sb.append("ayo").append("super").append("black").append("woo");
        System.out.println("sb: " + sb);

        //.reverse() 反转字符串
        sb.reverse();
        System.out.println("sb: " + sb);

        /*字符串拼接 升级版*/
        int[] a = {1,2,3};
        String deoo = linkStr(a);
        System.out.println(deoo);

        myReverseIn();
    }

    public static String linkStr(int[] a){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i =0;i<a.length;i++){
            if(i==a.length - 1){
                sb.append(a[i]);
            }
            else {
                sb.append(a[i] + ", ");
            }
        }
        sb.append("]");
        String ending = sb.toString();
    return ending;
    }

    public static void myReverseIn(){
        System.out.println("请输入一个字符串： ");
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        System.out.println(myReverse1(ss));
        System.out.println(myReverse2(ss));
    }

    public static String myReverse1 (String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        return s;
    }

    public static String myReverse2 (String s){
        return new StringBuilder(s).reverse().toString();
    }
}
