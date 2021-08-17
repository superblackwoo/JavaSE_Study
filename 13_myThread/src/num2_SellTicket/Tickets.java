package num2_SellTicket;

public class Tickets implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                //模拟出票时间
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖出第" + tickets + "张票");
                tickets--;
            }
            else
                break;
        }
    }
}
