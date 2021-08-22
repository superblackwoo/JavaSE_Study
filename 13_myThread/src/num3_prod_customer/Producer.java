package num3_prod_customer;

public class  Producer implements Runnable {
    private Box b;


    public Producer(Box b) {
        this.b = b;
    }

    public void run() {
       for (int i =0;i<500;i++){
           b.put(i);
       }
    }
}
