package num3_prod_customer;

public class Customer implements Runnable {
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        //顾客一直循环去牛奶
        while (true) {
            b.get();
        }
    }
}
