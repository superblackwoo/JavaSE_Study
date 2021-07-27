package test;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> myAL = new ArrayList<>();
        System.out.println("ArrayList: " + myAL);

        myAL.add("ayo");
        myAL.add("check");
        myAL.add("now");
        myAL.add("hai");
        myAL.add("lalala");
        System.out.println("ArrayList: " + myAL);
        //指定位置添加元素
        myAL.add(1,"superblack");
        System.out.println("ArrayList: " + myAL);
        System.out.println("ppppppppppppppppppppppppppppppppppp");

        //删除指定位置元素，返回true/false
        System.out.println(myAL.remove("ayo"));
        System.out.println("ArrayList: " + myAL);
        System.out.println("-----------------------------");
        //删除指定位置元素，返回删除元素
        System.out.println(myAL.remove(1));
        System.out.println("ArrayList: " + myAL);
        System.out.println("-----------------------------");
        //修改指定位置的元素,返回被修改元素
        System.out.println(myAL.set(1,"haha"));
        System.out.println("ArrayList: " + myAL);
        System.out.println("-----------------------------");
        //返回指定索引位置元素
        System.out.println(myAL.get(0));
        System.out.println("ArrayList: " + myAL);

        bianlijihe(myAL);

        /*遍历学生类*/
        ArrayList<Student_Standerd> AL2 = new ArrayList<>();
        Student_Standerd st1 = new Student_Standerd("black", 22);
        Student_Standerd st2 = new Student_Standerd("jhoen", 20);
        Student_Standerd st3 = new Student_Standerd("alin", 21);
        AL2.add(st1);
        AL2.add(st2);
        AL2.add(st3);
        System.out.println(AL2);
        Student_Standerd temp = new Student_Standerd();
        for(int i =0;i<AL2.size();i++){
            temp = AL2.get(i);
            System.out.println("姓名：" + temp.getName() + "， 年龄：" +temp.getAge());
        }
    }


    //遍历集合
    public static void bianlijihe(ArrayList<String> aa){
        String temp = new String();
        for(int i =0;i<aa.size();i++){
            temp = aa.get(i);
            System.out.println(temp);
        }
    }
}
