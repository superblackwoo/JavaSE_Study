package num2_SellTicket;

public class Tickets_syn implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //模拟出票时间
            synchronized (obj) { //一个对象对应一把锁
                if (tickets > 0) {
                    try {
                        Thread.currentThread().sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖出第" + tickets + "张票");
                    tickets--;
                }
                else{
                    break;
                }
            }
        }
    }
}