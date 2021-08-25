package num2_parctice2;

public class FlyDemo {
    public static void main(String[] args) {
        //匿名内部类
        goFly(new Flyable(){
            @Override
            public void fly(String s) {
                System.out.println("飞飞机");
            }
        });

        System.out.println("---------------------------");
        //Lamuda
        goFly((String s)->{
            System.out.println(s);
            System.out.println("飞高");
        });


        //省略式书写
        goFly(s-> System.out.println(s));
        System.out.println("---------------------------");

        /**方法引用符**/

        goFly(System.out::println);
        System.out.println("---------------------------");
    }

    public static void goFly(Flyable f){
        f.fly("大晴天");
    }
}
