package num3_Cotch_and_Player;

public class BasketballCoach extends Coach{
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃大鱼大肉喝啤酒");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球运动员");
    }
}
