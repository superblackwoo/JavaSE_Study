package Method_l1;
import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        //while(true) isEvenNumber();
        getMax();
    }

    public static void isEvenNumber(){
        System.out.println("Input the Number Please:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println(true + "\n");
        }
        else{
            System.out.println(false + "\n");
        }
    }

    public static void getMax() {
        int a = 9;
        int b = 7;
        if(a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }

    //带参数的方法：
    public static void getMax_with_Para(int a, int b){

    }
}
