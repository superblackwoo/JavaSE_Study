package ClassTest_l1;

public class Student_Standerd {
    private String name;
    private int age;

    public Student_Standerd() {
    }

    public Student_Standerd(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + ", " + age);
    }
}
