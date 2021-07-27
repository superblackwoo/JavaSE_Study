package test;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> myAL = new ArrayList<>();
        System.out.println("ArrayList: " + myAL);

        myAL.add("ayo");
        myAL.add("check");
        myAL.add("now");
        System.out.println("ArrayList: " + myAL);
        //指定位置添加元素
        myAL.add(1,"superblack");
        System.out.println("ArrayList: " + myAL);
    }
}
