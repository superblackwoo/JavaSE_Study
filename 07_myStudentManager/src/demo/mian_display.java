package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class mian_display {
    public static void main(String[] args) {
        ArrayList<Student> StudentAL = new ArrayList<>();
        while (true) {
            System.out.println("----------学生管理系统----------");
            System.out.println("1 添加学生信息");
            System.out.println("2 查看所有学生信息");
            System.out.println("3 删除学生信息");
            System.out.println("4 修改学生信息");
            System.out.println("5 退出");
            System.out.println("请输入你的选择: ");

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            switch (s) {
                case "1":
                    //System.out.println("添加学生信息");
                    addStudent(StudentAL);
                    break;
                case "2":
                    System.out.println("查看学生信息");
                    findAllStudent(StudentAL);
                    break;
                case "3":
                    System.out.println("删除学生信息");
                    break;
                case "4":
                    System.out.println("修改学生信息");
                    break;
                case "5":
                    //break;
                    System.exit(0);//JVM退出
                default:
                    throw new IllegalStateException("Unexpected value: " + s);
            }
        }
    }

    public static void addStudent(ArrayList<Student> StudentAL) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号: ");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名: ");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄: ");
        String age = sc.nextLine();
        System.out.println("请输入学生住址: ");
        String address = sc.nextLine();

        //Student st = new Student(sid, name, age, address);
        Student st = new Student();
        st.setSid(sid);
        st.setName(name);
        st.setAge(age);
        st.setAddress(address);

        StudentAL.add(st);
        System.out.println("录入信息成功！");
    }

    public static void findAllStudent(ArrayList<Student> StudentAL) {
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
        for (int i = 0; i < StudentAL.size(); i++) {
            Student temp = StudentAL.get(i);
            System.out.println(temp.getSid() + "\t\t" + temp.getName() + "\t\t" + temp.getAge() + "\t\t" + temp.getAddress());
        }
    }
}
