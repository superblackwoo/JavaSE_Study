package z01_Polymorphism;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }
}
