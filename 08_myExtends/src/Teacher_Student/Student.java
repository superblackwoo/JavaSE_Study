package Teacher_Student;

public class Student extends Person {
    public Student(){
    }
    public Student(String name, int age){
        super(name, age);
    }
    public void study() {
        System.out.println("Studying......");
    }
}
