package a01;

public abstract class Animal {

    //抽象类可以有成员变量
    private int age = 20;
    private final String city = "beijing";

    //抽象类可以有构造方法
    public Animal(int age) {
        this.age = age;
    }

    public Animal() {
    }


    //抽象类可以有非抽象成员函数
    public void show() {
        System.out.println(age);
        System.out.println(city);
    }

    public abstract void eat();
}
