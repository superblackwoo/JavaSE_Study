package num4_InnerClass;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOprator j = new JumppingOprator();

        Jumpping jj = new Cat();
        j.method(jj);


        Jumpping jj1 = new Dog();
        j.method(jj1);
        //每次都要搞个类 太麻烦了
        //使用匿名内部类

        System.out.println("----------");
        j.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("匿名内部类");
            }
        });

        long start = System.currentTimeMillis();
        for(int i =0;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end - start)+"毫秒");
    }
}
