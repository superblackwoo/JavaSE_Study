package Teacher_Student;

public class Teacher0 {
    private String name;
    private int age;

    public Teacher0(String name, int age) {
        this.name = name;
        this.age = age;
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

    public Teacher0() {
    }

    public void teach() {
        System.out.println("teaching......");
    }
}
