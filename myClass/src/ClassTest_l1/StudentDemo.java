package ClassTest_l1;

public class StudentDemo {
    public static void main(String[] args) {
        Student sa = new Student();
        sa.name = "张三";
        sa.age = 10;

        sa.study();
        sa.doHomework();

        Student sb = new Student();
        sb.name = "麻子";
        sb.age = 30;
        sb.study();
        sb.doHomework();
        System.out.println("sb.name: " + sb.name);
        System.out.println("sb.age: " + sb.age);


        //多个对象指向相同
        Student sa2 = sb;
        sa2.name = "师爷";
        sa2.age = 40;
        sa2.study();
        sa2.doHomework();
        System.out.println("sa2.name: " + sa2.name);
        System.out.println("sa2.age: " + sa2.age);
        System.out.println("sb.name: " + sb.name);
        System.out.println("sb.age: " + sb.age);


        //private关键字的使用
        Student_Private sp = new Student_Private();
        System.out.println("sp.getName(): " + sp.getName());
        System.out.println("sp.age" + "报错： 'age' has private access in 'ClassTest_l1.Student_Private'");
        System.out.println("sp.getAge(): " + sp.getAge());

        //sp.name = "anser j";
        sp.setName("anser j");
        sp.setAge(70);
        System.out.println("sp.getName(): " + sp.getName());
        System.out.println("sp.getAge(): " + sp.getAge());

        sp.show();



        //标准类测试
        Student_Standerd sst = new Student_Standerd();
        sst.setName("unknown");
        sst.setAge(5);
        Student_Standerd sst1 = new Student_Standerd("superblackwoo",23);
        sst.show();
        sst1.show();
    }
}
