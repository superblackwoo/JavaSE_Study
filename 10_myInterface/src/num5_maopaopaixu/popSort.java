package num5_maopaopaixu;

public class popSort {
    public static void main(String[] args) {
        int [] a = {24,25,89,3,6,35,9};
        //String s = atoString(a);
        System.out.println("排序前：" + atoString(a));
    }

    //格式化输出整数数组
    public static String atoString(int[] arr) {
        String s = "";
        s += "[";
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}
