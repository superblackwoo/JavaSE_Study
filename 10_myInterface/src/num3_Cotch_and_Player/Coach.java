package num3_Cotch_and_Player;

public abstract class Coach extends Person{
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }

    public abstract void teach();
}
