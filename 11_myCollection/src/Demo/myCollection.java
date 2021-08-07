package Demo;

import java.util.ArrayList;
import java.util.Collection;

public class myCollection {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();  //多态初始化
        c.add("hello");
        c.add("world");
        c.add("Java");

        System.out.println(c);;
    }
}
