package num2_SellTicket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets_Lock implements Runnable{
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    public void run(){
        while(true){
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.currentThread().sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖出第" + tickets + "张票");
                    tickets--;
                }
            }
            finally{
                lock.unlock();
            }

        }
    }
}
