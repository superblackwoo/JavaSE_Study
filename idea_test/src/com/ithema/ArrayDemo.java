package com.ithema;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[3] = 6;
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }


        int[] arr1 = new int[3];
        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        int[] arr2 = arr1;
        arr2[1] = 500;
        arr2[2] = 600;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        System.out.println("arr1:");
        System.out.println(arr1);
        System.out.println("arr1[]:");
        System.out.println(arr1[0]);

        System.out.println("arr2:");
        System.out.println(arr2);
        System.out.println("arr2[0]:");
        System.out.println(arr2[0]);

        // 静态初始化
        System.out.println("静态初始化");
        int[] arr4 = {1, 2, 3, 45, 345, 234, 234, 345, 24, 488, 683, 49};
        System.out.println(arr4);
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);

        int max = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            System.out.println(arr4[i]);
            if (max > arr4[i]) {
                max = arr4[i];
            }
        }
        System.out.println("arr4[max] = " + max);
    }
}
