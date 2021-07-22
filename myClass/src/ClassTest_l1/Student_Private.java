package ClassTest_l1;

public class Student_Private {
    String name;
    private int age;

    public void setAge(int a){
        //初级： age = a;
        //高级：保护
        if(a<0 || a>120){
            System.out.println("Wrong Input!!!!");
        }
        else age = a;
    }

    public int getAge(){
        return age;
    }

    public void study(){
        System.out.println("Studying");
    }

    public void doHomework(){
        System.out.println("Doing homeWork!");
    }
}
