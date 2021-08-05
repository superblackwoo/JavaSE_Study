package num6_myInteger;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(5);
        System.out.println(i);

        Integer i1 = Integer.valueOf("90");
        System.out.println(i1);

        //Integer i2 = Integer.valueOf("u");  NumberFormatException


        /* int 和 string 相互转换 */
        // int------>String
        int number = 100;
        //方式1
        String s1 = "" + number; //不专业
        System.out.println(s1);
        //方式2
        String s2 = String.valueOf(number);
        System.out.println(s2);


        //String -----> int
        String s = "100";
        //方式1
        Integer ia = Integer.valueOf(s);
        int x = ia.intValue();
        System.out.println(x);
        //方式2
        int y = Integer.parseInt(s);
        System.out.println(s);
    }


}
