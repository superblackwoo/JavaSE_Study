package z01_Polymorphism;

public class Duotai {
    public static void main(String[] args) {
        Animal ani = new Cat();
        ani.setName("加菲");
        ani.setAge(5);
        System.out.println(ani.getName()+ ","+ani.getAge());
        ani.eat();

        ani = new Cat("cattt",8);
        System.out.println(ani.getName()+ ","+ani.getAge());
        ani.eat();

        ani = new Dog("柴犬",9);
        System.out.println(ani.getName()+ ","+ani.getAge());
        ani.eat();


        //ani.play();    无法调用
        Dog dd = (Dog)ani;
        dd.play();
    }

}
