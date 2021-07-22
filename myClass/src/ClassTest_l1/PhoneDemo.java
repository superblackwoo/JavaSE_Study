package ClassTest_l1;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "apple";
        p.price = 6299;
        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.sendMessage();
    }
}
