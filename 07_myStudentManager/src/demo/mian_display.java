package demo;

import java.util.Scanner;

public class mian_display {
    public static void main(String[] args) {
        while (true) {
            System.out.println("----------学生管理系统----------");
            System.out.println("1 添加学生信息");
            System.out.println("2 查看学生信息");
            System.out.println("3 删除学生信息");
            System.out.println("4 修改学生信息");
            System.out.println("5 退出");
            System.out.println("请输入你的选择: ");

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            switch (s) {
                case "1":
                    System.out.println("添加学生信息");
                    break;
                case "2":
                    System.out.println("查看学生信息");
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
}
