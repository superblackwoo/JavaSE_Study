package num1;

public interface Animal {

    //接口的成员变量默认被static final修饰
    public int num = 10;
    public final int num2 = 20;

    //public void a(){ }    接口的成员方法只能是 抽象方法
    public abstract void show();

    //抽象类没得构造函数
}
