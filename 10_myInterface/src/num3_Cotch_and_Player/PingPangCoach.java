package num3_Cotch_and_Player;

public class PingPangCoach extends Coach implements speckEnglish{
    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public PingPangCoach() {
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃餐饮");
    }

    @Override
    public void teach() {
        System.out.println("兵乓球教练教抽球");
    }

    @Override
    public void learningEnglish() {
        System.out.println("乒乓球教练学习英语");
    }
}
