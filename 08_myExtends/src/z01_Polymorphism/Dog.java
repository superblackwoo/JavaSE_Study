package z01_Polymorphism;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void play(){
        System.out.println("狗玩耍");
    }
}
