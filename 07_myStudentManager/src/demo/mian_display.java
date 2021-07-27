package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class mian_display {
    public static void main(String[] args) {
        ArrayList<Student> StudentAL = new ArrayList<>();
        Student st = new Student();
        st.setSid("181919");
        st.setName("ayo");
        st.setAge("18");
        st.setAddress("重庆");
        Student st1 = new Student();
        st1.setSid("195623");
        st1.setName("nam");
        st1.setAge("18");
        st1.setAddress("綦江");
        StudentAL.add(st);
        StudentAL.add(st1);

        while (true) {
            System.out.println("----------学生管理系统----------");
            System.out.println("1 添加学生信息");
            System.out.println("2 删除学生信息");
            System.out.println("3 修改学生信息");
            System.out.println("4 查看所有学生信息");
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
//                    System.out.println("删除学生信息");
                    deleteStudent(StudentAL);
                    break;
                case "3":
//                    System.out.println("修改学生信息");
                    remixStudent1(StudentAL);
                    break;
                case "4":
                    findAllStudent(StudentAL);
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
        if(haveExist(StudentAL, sid))
            return;
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
        if (StudentAL.size() == 0) {
            System.out.println("无信息，请输入信息后再查询！");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t\t居住地");
        for (int i = 0; i < StudentAL.size(); i++) {
            Student temp = StudentAL.get(i);
            System.out.println(temp.getSid() + "\t\t" + temp.getName() + "\t\t\t" + temp.getAge() + "岁\t\t" + temp.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> StudentAL) {
        System.out.println("请输入你要删除的学生的学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        for (int i = 0; i < StudentAL.size(); i++) {
            Student temp = StudentAL.get(i);
            if (temp.getSid().equals(sid)) {
                StudentAL.remove(i);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("查无此人，请重新输入！");
    }

    //两种修改实现
    public static void remixStudent(ArrayList<Student> StudentAL) {
        System.out.println("请输入要修改的学生的学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        for (int i = 0; i < StudentAL.size(); i++) {
            Student temp = StudentAL.get(i);
            if (temp.getSid().equals(sid)) {
                System.out.println("请输入学生学号: ");
                String sid1 = sc.nextLine();
                temp.setSid(sid1);
                System.out.println("请输入学生姓名: ");
                String name = sc.nextLine();
                temp.setName(name);
                System.out.println("请输入学生年龄: ");
                String age = sc.nextLine();
                temp.setAge(age);
                System.out.println("请输入学生住址: ");
                String address = sc.nextLine();
                temp.setAddress(address);
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("查无此人，请重新输入！");
    }

    public static void remixStudent1(ArrayList<Student> StudentAL) {

        //输入学号
        System.out.println("请输入要修改的学生的学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();


        //输入修改学生的信息
        System.out.println("请输入学生学号: ");
        String sid1 = sc.nextLine();
        System.out.println("请输入学生姓名: ");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄: ");
        String age = sc.nextLine();
        System.out.println("请输入学生住址: ");
        String address = sc.nextLine();

        //创建新的学生对象
        Student s = new Student();
        s.setSid(sid1);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //ArrayList.set(i,s)
        for (int i = 0; i < StudentAL.size(); i++) {
            Student temp = StudentAL.get(i);
            if (temp.getSid().equals(sid)) {
                StudentAL.set(i, s);
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("查无此人，请重新输入！");
    }

    public static boolean haveExist(ArrayList<Student> StudentAL, String sid){
        for (int i = 0; i < StudentAL.size(); i++) {
            Student temp = StudentAL.get(i);
            if(temp.getSid().equals(sid)){
                System.out.println("该生已存在，请重新输入！");
                return true;
            }
        }
        return false;
    }
}
