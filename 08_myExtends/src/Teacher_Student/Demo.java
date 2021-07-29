package Teacher_Student;

public class Demo {
    public static void main(String[] args) {
        Teacher0 t0 = new Teacher0();
        t0.setName("superblack");
        t0.setAge(22);
        t0.teach();

        Student0 s0 = new Student0();
        s0.setName("woo");
        s0.setAge(20);
        s0.study();

        System.out.println("--------------");
        Teacher t1 = new Teacher();
        t1.setName("superblack");
        t1.setAge(22);
        t1.teach();

        Student s1 = new Student();
        s1.setName("woo");
        s1.setAge(20);
        s1.study();
    }
}
