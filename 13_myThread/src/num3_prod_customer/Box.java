package num3_prod_customer;

/**
 * 奶箱类
 * 可以放奶也可以取   （共享数据域）
 **/
public class Box {
    //定义成员变量表示第几瓶奶
    private int milk_box;
    //定义成员变量表示奶箱是否为空
    private boolean have_milk = false;

    //去牛奶
    public synchronized void get() {         /** 使用了 wait（） 方法就必须是一个支持同步的方法**/
        //如果没有牛奶，等待生产
        if(!have_milk){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("顾客拿走的第" + milk_box + "瓶奶");

        //去完牛奶就修改状态
        this.have_milk = false;
        //唤醒其他线程
        notifyAll();
    }


    //放牛奶
    public synchronized void put(int milk) {
        //如果有牛奶，等待消费
        if(have_milk){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.milk_box = milk;
        System.out.println("送奶员放的的第" + milk_box + "瓶奶");

        //生产完后修改牛奶箱状态
        this.have_milk = true;
        //唤醒其他线程
        notifyAll();
    }
}
