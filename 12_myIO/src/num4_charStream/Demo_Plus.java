package num4_charStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 把对象的信息写入文件
 * <p>
 * 把文件里的信息读为对象的参数
 **/
public class Demo_Plus {
    public static void main(String[] args) throws IOException {
        //创建学生对象
        ArrayList<Student_Overwreite_eq_hash> al = new ArrayList<Student_Overwreite_eq_hash>();
        Student_Overwreite_eq_hash ssss1 = new Student_Overwreite_eq_hash("555", "a1", 4, "ad234asda");
        Student_Overwreite_eq_hash ssss2 = new Student_Overwreite_eq_hash("556", "a2", 3, "adas32da");
        Student_Overwreite_eq_hash ssss3 = new Student_Overwreite_eq_hash("557", "a3", 6, "ada24sda");
        Student_Overwreite_eq_hash ssss4 = new Student_Overwreite_eq_hash("558", "a4", 7, "ada2rt4sda");
        Student_Overwreite_eq_hash ssss5 = new Student_Overwreite_eq_hash("559", "a5", 7, "ada2rt4sda");

        //存入集合
        al.add(ssss1);
        al.add(ssss2);
        al.add(ssss3);
        al.add(ssss4);
        al.add(ssss5);

        //创建字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("12_myIO\\src\\num4_charStream\\Student.txt"));

        for (Student_Overwreite_eq_hash stu : al) {
//            String sid = stu.getSid();
//            String name = stu.getName();
//            int age = stu.getAge();
//            String address = stu.getAddress();
            StringBuilder sb = new StringBuilder();
            sb.append(stu.getSid());
            sb.append(", ");
            sb.append(stu.getName());
            sb.append(", ");
            sb.append(stu.getAge());
            sb.append(", ");
            sb.append(stu.getAddress());

            //往文件里写
            bw.write(String.valueOf(sb));
            bw.newLine();
        }

        bw.close();

        //----------------------------------------------------------------------------------------------------------
        //从文件往对象写

        //创建字符读取类
        BufferedReader br = new BufferedReader(new FileReader("12_myIO\\src\\num4_charStream\\Student.txt"));

//        ArrayList<String> al1 = new ArrayList<String>();
        ArrayList<Student_Overwreite_eq_hash> stus = new ArrayList<Student_Overwreite_eq_hash>();
        //把每一行数据读到集合中
        String len;
        while ((len = br.readLine()) != null) {
            String[] temp = len.split(", ");
            Student_Overwreite_eq_hash st = new Student_Overwreite_eq_hash();
            st.setSid(temp[0]);
            st.setName(temp[1]);
            int age = Integer.parseInt(temp[2]);
            st.setAge(age);
            st.setAddress(temp[3]);
            stus.add(st);
        }

        System.out.println(stus.toString());
//        for(String s:al1){
//            String[] temp = s.split(", ");
//            System.out.println(Arrays.toString(temp));
//        }

    }
}
