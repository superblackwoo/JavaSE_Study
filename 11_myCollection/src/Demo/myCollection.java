package Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class myCollection {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();  //多态初始化
        c.add("hello");
        c.add("world");
        c.add("Java");

        System.out.println(c);


        //常用方法
        System.out.println(c.add("yoyo"));
        System.out.println(c);
        System.out.println("------");

        //删除集合中的指定元素
        c.remove("hello");
        System.out.println(c.remove("yo"));
        System.out.println(c);
        System.out.println("------");


        //判断集合中是否含有指定元素
        System.out.println(c);
        System.out.println(c.contains("Java"));
        System.out.println("------");

        //判断集合是否为空
        System.out.println(c.isEmpty());
        System.out.println(c);
        System.out.println("------");

        //集合长度
        System.out.println(c.size());
        System.out.println("------");
        //清空元素
        c.clear();
        System.out.println(c);


//------------------------------------------------------------
        c.add("hello");
        c.add("world");
        c.add("Java");


        //iterator 迭代器

        Iterator<String> it = c.iterator();

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        // System.out.println(it.next()); //NoSuchElementException


        //hasNext(): 判断是否还有下一个元素
        Collection<String> c1 = new ArrayList<String>();
        c1.add("hello");
        c1.add("world");
        c1.add("Java");
        System.out.println(c1);
        Iterator<String> it1 = c1.iterator();
        System.out.println(it1.hasNext());
        while (it1.hasNext()) {
            String s = it1.next();
            System.out.println(s);
        }
    }
}
