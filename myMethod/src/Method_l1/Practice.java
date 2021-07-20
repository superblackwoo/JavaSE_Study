package Method_l1;

import java.sql.SQLOutput;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {23, 4234, 45, 34, 6, 4564, 645, 64, 64, 6};
        readArray(arr);
        System.out.println(Max(arr));
    }

    //数组遍历
    public static void readArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.print("]");
    }

    //数组最大值
    public static int Max(int[] arr){
        int max = arr[0];
        for (int i = 1; i<arr.length;i++){
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
}
