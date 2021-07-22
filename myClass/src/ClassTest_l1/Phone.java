package ClassTest_l1;

public class Phone {
    String brand;
    int price;

    //成员方法 不加static
    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }
}
