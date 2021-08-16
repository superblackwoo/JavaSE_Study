package num5_案例;

import javax.lang.model.element.Name;
import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 集合到文件（排序版本）
 **/

public class Demo {
    public static void main(String[] args) throws IOException {
        //创建TreeSet集合
        //并建好排序规则
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num1 = o2.getSum() - o1.getSum();
                int num2 = num1 == 0 ? o2.getChinese() - o1.getChinese() : num1;
                int num3 = num2 == 0 ? o2.getMath() - o1.getMath() : num2;
                int num4 = num3 == 0 ? o2.getEnglish() - o1.getEnglish() : num3;
                return num4;
            }
        });

        //键盘录入学生信息

        for (int i = 0; i < 4; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生姓名");
            String name = sc.nextLine();
            System.out.println("请输入学生语文成绩");
            int Chinese = sc.nextInt();
            System.out.println("请输入学生数学成绩");
            int Math = sc.nextInt();
            System.out.println("请输入学生英语成绩");
            int English = sc.nextInt();

            Student stu = new Student();
            stu.setChinese(Chinese);
            stu.setEnglish(English);
            stu.setName(name);
            stu.setMath(Math);

            ts.add(stu);
        }

        //创建字符流对象
        BufferedWriter br = new BufferedWriter(new FileWriter("12_myIO\\src\\num5_案例\\成绩.txt"));

        for(Student temp:ts){
            StringBuilder sb = new StringBuilder();
            sb.append(temp.getName()).append(",").append(temp.getChinese()).append(",").append(temp.getMath())
            .append(",").append(temp.getEnglish()).append(",").append(temp.getSum());
            br.write(sb.toString());
            br.newLine();
        }

        br.close();
    }
}
