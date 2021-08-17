package num2_SellTicket;

public class SellDemo {
    public static void main(String[] args) throws InterruptedException {
        Tickets t = new Tickets();
        Tickets_syn tt = new Tickets_syn();

        Thread t1 = new Thread(t,"窗口1");
        Thread t2 = new Thread(t,"窗口2");
        Thread t3 = new Thread(t,"窗口3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        Thread tt1 = new Thread(tt,"t窗口1");
        Thread tt2 = new Thread(tt,"t窗口2");
        Thread tt3 = new Thread(tt,"t窗口3");

        tt1.start();
        tt2.start();
        tt3.start();
    }
}
