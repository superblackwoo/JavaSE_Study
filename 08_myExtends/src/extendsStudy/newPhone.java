package extendsStudy;
/*
* 新手机
* */
public class newPhone extends Phone{
    @Override
    public void call(String name){
        System.out.println("开启摄像头.....");
        System.out.println("给" + name +"打电话");

        //调用父类的call也行
        super.call(name);
    }
}
