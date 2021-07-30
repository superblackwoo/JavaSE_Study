package num3_Cotch_and_Player;

public class PinPangPlayer extends Player implements speckEnglish{
    public PinPangPlayer(String name, int age) {
        super(name, age);
    }

    public PinPangPlayer() {
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习打乒乓球如何打小日本儿");
    }

    @Override
    public void learningEnglish() {
        System.out.println("乒乓球运动员需要学习英语");
    }
}
