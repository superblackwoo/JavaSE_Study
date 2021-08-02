package num4_InnerClass;
/*
*  匿名内部类
* */
public class Outer {
    public void method(){
        new Inner(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };


        new Inner(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        Inner i = new Inner() {
            @Override
            public void show() {
                System.out.println("匿名内部类的多态");
            }
        };

        i.show();
        i.show();

    }
}
