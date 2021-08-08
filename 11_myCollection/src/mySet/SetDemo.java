package mySet;

import Demo.Student;

import java.util.HashSet;
import java.util.Set;

/*
 *
 *   HashSet:对访问顺序没有任何保证
 * */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("Java");

        set.add("hello"); //不包含重复元素

        //Set没有带索引不能用for， 只可增强for循环
        for (String s : set) {
            System.out.println(s);
        }

        //---------------------------------------------------------------------------------------------------------
        //hashCode()   哈希值
        System.out.println("-----------------------------");
        System.out.println("hashCode 测试：");
        Student s = new Student("adas", "asd", "dd", "asdsa");

        //同一个对象的hashCode是一样的
        System.out.println("s:" + s.hashCode());
        System.out.println("s:" + s.hashCode());

        //默认情况不同对象的hashCode是一样的
        //重写hashCode方法可以使其一样
        Student s1 = new Student("adas", "asd", "dd", "asdsa");
        System.out.println("s1:" + s1.hashCode());


        System.out.println("哎呀：" + "哎呀".hashCode());
        System.out.println("哦豁：" + "哦豁".hashCode());
        System.out.println("-----------------------------");


        //---------------------------------------------------------------------------------------------------------
        //hashSet存储学生，
        //在学生类中重写equs（）和 hashCode（）方法，才能保证hashSet的元素唯一性

        HashSet<Student> stuHashSet = new HashSet<Student>();

        Student ss1 = new Student("555", "a1", "4", "ad234asda");
        Student ss2 = new Student("556", "a2", "3", "adas32da");
        Student ss3 = new Student("557", "a3", "6", "ada24sda");
        Student ss4 = new Student("557", "a3", "6", "ada24sda");

        stuHashSet.add(ss1);
        stuHashSet.add(ss2);
        stuHashSet.add(ss3);
        stuHashSet.add(ss4);

        for (Student temp : stuHashSet) {
            System.out.println(temp.getSid() + temp.getName() + temp.getAge());
        }
        System.out.println("很明显上面有重复的");
        System.out.println("---------------------------");

        HashSet<Student_Overwreite_eq_hash> stuHashSet1 = new HashSet<Student_Overwreite_eq_hash>();


        Student_Overwreite_eq_hash sss1 = new Student_Overwreite_eq_hash("555", "a1", "4", "ad234asda");
        Student_Overwreite_eq_hash sss2 = new Student_Overwreite_eq_hash("556", "a2", "3", "adas32da");
        Student_Overwreite_eq_hash sss3 = new Student_Overwreite_eq_hash("557", "a3", "6", "ada24sda");
        Student_Overwreite_eq_hash sss4 = new Student_Overwreite_eq_hash("557", "a3", "6", "ada24sda");

        stuHashSet1.add(sss1);
        stuHashSet1.add(sss2);
        stuHashSet1.add(sss3);
        stuHashSet1.add(sss4);

        for (Student_Overwreite_eq_hash temp : stuHashSet1) {
            System.out.println(temp.getSid() + temp.getName() + temp.getAge());
        }

        System.out.println("重复的没得了");
    }
}