package num3_Cotch_and_Player;

public class BasketballPlayer extends Player {
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public BasketballPlayer() {
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员喝蛋白粉");
    }

    @Override
    public void study() {
        System.out.println("篮球员动员学习如何灌篮和进入NBA");
    }

}
