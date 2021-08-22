package num3_prod_customer;

public class milkBox_Demo {
    public static void main(String[] args) {
        Box b = new Box();

        //创建消费者，生产者对象
        Customer c = new Customer(b);
        Producer p = new Producer(b);

        //创建消费者，生产者线程
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
