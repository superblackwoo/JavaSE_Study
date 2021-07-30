package num2;

public class demo {
    public static void main(String[] args) {
        Animal a = new Cat("加菲",5);
        a.eat();

        Animal b = new Dog("狗狗",9);
        b.eat();

        Cat c = new Cat("英短",9);
        c.eat();
        c.jump();

        Dog d = new Dog("狗沟",8);
        d.eat();
        d.jump();
    }
}
