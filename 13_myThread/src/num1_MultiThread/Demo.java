package num1_MultiThread;

public class Demo {
    //1.继承Thread类
    //2.在MyThread类中重写run（）方法
    //3.创建Mythread对象
    //4.启动线程

    public static void main(String[] args) {
        MyThread m1 = new MyThread("ayo");
        MyThread m2 = new MyThread("oho");


        //设置线程名称
        m1.setName("ayooooooooo");
        m1.start();
        m2.start();

//        for(int i=0;i<100;i++){
//            MyThread temp = new MyThread();
//            temp.start();
//        }

        //线程的优先级
        System.out.println("优先级"+m1.getPriority());
        MyThread m3 = new MyThread("emm");
        MyThread m4 = new MyThread("o");

        m3.setPriority(10);
        m4.setPriority(3);

        m3.start();
        m4.start();


        //___________________________________________________________________________________________________________
        /**
         *
         * 第二种线程实现的方法
         *
         * **/

        myRunable mr = new myRunable();
        Thread t1 = new Thread(mr,"ke");
        Thread t2 = new Thread(mr, "mm");
        t1.start();
        t2.start();
    }

}
