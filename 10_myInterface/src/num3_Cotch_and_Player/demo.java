package num3_Cotch_and_Player;

public class demo {
    public static void main(String[] args) {
        BasketballPlayer yi = new BasketballPlayer("易建联",32);
        yi.eat();
        yi.study();
        System.out.println("------------");

        BasketballCoach a = new BasketballCoach("unkonwn",50);
        a.eat();
        a.teach();
        System.out.println("------------");

        PingPangCoach b = new PingPangCoach();
        b.setName("孔令辉");
        b.setAge(66);
        b.teach();
        b.eat();
        b.learningEnglish();
        System.out.println("------------");

        PinPangPlayer c = new PinPangPlayer("马龙",26);
        c.eat();
        c.study();
        c.learningEnglish();
        System.out.println("------------");
    }
}
