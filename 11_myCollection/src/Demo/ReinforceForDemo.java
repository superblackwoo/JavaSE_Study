package Demo;
/*
 *    增强for循环
 *    内部就是一个Iterator迭代器
 * */


import java.util.ArrayList;
import java.util.List;

public class ReinforceForDemo {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 42, 5};
        for (int s : arr) {
            System.out.println(s);
        }
        System.out.println("-----");


        String[] strArr = {"hello", "world", "Java"};
        for(String s:strArr){
            System.out.println(s);
        }
        System.out.println("------");


        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("Java");
        for (String s : list){
            System.out.println(s);
        }


        //增强for循环的实现原理：Iterator迭代器
        for (String s : list){
            if(s.equals("hello")){
                list.add("lala");   //会抛出并发修改异常
            }
        }

    }
}
