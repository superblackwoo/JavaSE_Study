package Teacher_Student;

public class Student0 {
    private String name;
    private int age;

    public Student0(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student0() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void study(){
        System.out.println("Studying......");
    }
}
