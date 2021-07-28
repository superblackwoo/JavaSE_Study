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
    }
}
