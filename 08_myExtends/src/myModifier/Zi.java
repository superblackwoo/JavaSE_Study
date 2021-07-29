package myModifier;

public class Zi extends Fu{
    public static void main(String[] args) {
        Zi a = new Zi();
        a.show2();
        a.show3();
        a.show4();

        //同一个包中的子类，无关类不能访问private
    }
}
