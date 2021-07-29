package myimport;

import Teacher_Student.Person;
import Teacher_Student.Student;

public class demo {
    public static void main(String[] args) {
        //未导包之前  import
        Teacher_Student.Student s = new Teacher_Student.Student();
        //导包之后   import
        Person p = new Person("asd", 78);
        Student s1 = new Student("auofg", 89);
    }
}
