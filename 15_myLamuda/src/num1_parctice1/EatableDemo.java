package num1_parctice1;

import org.w3c.dom.events.EventTarget;

public class EatableDemo {
    public static void main(String[] args) {
        //在主方法中调用useeatable方法
        Eatable e = new EatableLum();
        useEatable(e);

        //匿名内部类
        useEatable(new Eatable(){
            @Override
            public void eat() {
                System.out.println("恰饭");
            }
        });

        //Lamuda表达式
        useEatable(()->{
            System.out.println("恰饭");
        });
    }

    public static void useEatable(Eatable e){
        e.eat();
    }
}
