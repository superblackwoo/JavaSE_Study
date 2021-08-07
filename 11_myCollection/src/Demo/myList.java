package Demo;

import java.util.*;

public class myList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("Java");
        System.out.println(list);  //有序

        list.add("hello");  //可重复

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }


//------------------------------------------------------------
        list.add(1, "ayo");  //在指定位置插入元素
        System.out.println(list);
        System.out.println("------");

        System.out.println(list.remove(0));  //删除指定位置元素并返回
        System.out.println(list);
        System.out.println("------");

        list.set(1, "aha");  //修改指定位置元素
        System.out.println(list);
        System.out.println("------");

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);  //返回指定位置元素
            System.out.println(temp);
        }


//------------------------------------------------------------
        //List存储学生
        Student s1 = new Student("555", "a1", "4", "ad234asda");
        Student s2 = new Student("556", "a2", "3", "adas32da");
        Student s3 = new Student("557", "a3", "6", "ada24sda");

        List<Student> stlist = new ArrayList<Student>();

        //添加学生
        stlist.add(s1);
        stlist.add(s2);
        stlist.add(s3);

        //Iterator遍历
        Iterator<Student> iterator = stlist.iterator();
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            System.out.println(temp.getSid() + temp.getName() + temp.getAge());
        }
        System.out.println("------");

        //for循环遍历
        for (int i = 0; i < stlist.size(); i++) {
            Student temp = stlist.get(i);  //返回指定位置元素
            System.out.println(temp.getSid() + temp.getName() + temp.getAge());
        }


//------------------------------------------------------------
        //ListIterator迭代器
        List<String> list2 = new ArrayList<String>();
        list2.add("hello");
        list2.add("world");
        list2.add("Java");

        ListIterator<String> stringListIterator = list2.listIterator();
        while (stringListIterator.hasNext()) {
            String s = stringListIterator.next();
            //if(s == "hello"){
            if (s.equals("hello")) {
                //list2.add(1,"yoxi");  //ConcurrentModificationException 并发修改异常
                stringListIterator.add("yoxi");
            }
            System.out.println(s);
        }
        System.out.println(list2);
        System.out.println("-----------");


//------------------------------------------------------------
        //第三种遍历方式：增强for（最方便的遍历方式）
        List<Student> aaa = new ArrayList<Student>();
        aaa.add(s1);
        aaa.add(s2);
        aaa.add(s3);

        for (Student s : aaa) {
            System.out.println("增强for：");
            System.out.println(s.getSid() + s.getName() + s.getAge());
        }


//------------------------------------------------------------
        //两个子类
        System.out.println("List 的两个子类");
        //ArrayList
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("Java");

        //三种遍历
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("-----------");

        for (int i = 0; i<array.size();i++){
            String temp = array.get(i);
            System.out.println(temp);
        }
        System.out.println("-----------");

        ListIterator<String> stringListIterator2 = array.listIterator();
        while (stringListIterator2.hasNext()){
            String temp = stringListIterator2.next();
            System.out.println(temp);
        }
        System.out.println("-----------");


        //LinkedList
        LinkedList<String> linklist = new LinkedList<String>();
        linklist.add("hello");
        linklist.add("world");
        linklist.add("Java");

        //三种遍历
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("-----------");


        for (int i = 0; i<linklist.size();i++){
            String temp = linklist.get(i);
            System.out.println(temp);
        }
        System.out.println("-----------");

        ListIterator<String> stringListIterator1 = linklist.listIterator();
        while(stringListIterator1.hasNext()){
            String temp = stringListIterator1.next();
            System.out.println(temp);
        }
        System.out.println("-----------");
    }
}
