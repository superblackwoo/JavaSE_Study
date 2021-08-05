package num5_maopaopaixu;

public class popSort {
    public static void main(String[] args) {
        int[] a = {99, 98, 24, 25, 89, 3, 6, 35, 9};
        //String s = atoString(a);
        System.out.println("排序前：" + atoString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
        }
        System.out.println("第一次排序后：" + atoString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
        }
        System.out.println("第二次排序后：" + atoString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
        }
        System.out.println("第三次排序后：" + atoString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
        }
        System.out.println("第四次排序后：" + atoString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
        }
        System.out.println("第五次排序后：" + atoString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
        }
        System.out.println("第六次排序后：" + atoString(a));

        int aaa[] = new int[999000];
        double ba =System.currentTimeMillis();
        for(int i = 0; i < aaa.length; i++){
            aaa[i] = (int)(Math.random()*100);
        }
        double ca = System.currentTimeMillis();
        System.out.println((ca-ba));


        double b =System.currentTimeMillis();
        popSort(aaa);
        double c = System.currentTimeMillis();
        System.out.println((c-b));
        System.out.println(atoString(aaa));
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

    public static int[] popSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int x = 0; x < i; x++) {
                if(a[x]>a[x+1]){
                    int temp = a[x+1];
                    a[x+1] = a[x];
                    a[x] = temp;
                }
            }
            //System.out.println("第"+(i+1)+"轮排序后："+ atoString(a));
        }
        return a;
    }

}
