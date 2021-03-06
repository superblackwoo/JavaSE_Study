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


//------------------------------------------------------------
// 案例：集合存储学生类，并遍历
        Student s1 = new Student("555", "a1", "4", "ad234asda");
        Student s2 = new Student("556", "a2", "3", "adas32da");
        Student s3 = new Student("557", "a3", "6", "ada24sda");
        Collection<Student> stu = new ArrayList<Student>();

        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

        System.out.println(stu);
        Iterator<Student> it11 = stu.iterator();
        while (it11.hasNext()) {
            Student temp = it11.next();
            System.out.println(temp.getSid() + temp.getName() + temp.getAge());
        }

    }
}
