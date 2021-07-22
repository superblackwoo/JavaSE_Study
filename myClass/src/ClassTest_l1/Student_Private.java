package ClassTest_l1;

public class Student_Private {
    private String name;
    private int age;

    //构造方法
    public Student_Private(){
        System.out.println("无参构造方法");
    }
    public void setAge(int a) {
        //初级： age = a;
        //高级：保护
        if (a < 0 || a > 120) {
            System.out.println("Wrong Input!!!!");
        } else age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void study() {
        System.out.println("Studying");
    }

    public void doHomework() {
        System.out.println("Doing homeWork!");
    }

    public void show() {
        System.out.println(getName() + ", " + getAge());
    }
}
