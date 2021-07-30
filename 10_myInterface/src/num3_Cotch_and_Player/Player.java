package num3_Cotch_and_Player;

public abstract class Player extends Person{
    public Player(String name, int age) {
        super(name, age);
    }

    public Player() {
    }

    public abstract void study();
}
