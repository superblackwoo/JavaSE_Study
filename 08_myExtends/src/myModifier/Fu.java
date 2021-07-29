package myModifier;

public class Fu {
    //权限修饰符
    private void show1() {
        System.out.println("private");
    }

    void show2() {
        System.out.println("默认");
    }

    protected void show3() {
        System.out.println("protected");
    }

    public void show4() {
        System.out.println("public");
    }

    public static void main(String[] args) {
        Fu a = new Fu();
        a.show1();
        a.show2();
        a.show3();
        a.show4();
    }
}
