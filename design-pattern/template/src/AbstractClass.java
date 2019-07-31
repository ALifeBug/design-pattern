/**
 * Created by sccy on 2019/7/30/0030.
 */
public abstract class AbstractClass {
    public void TemplateMethod(){
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    public void SpecificMethod(){
        System.out.println("抽象类中的具体方法被调用");
    }
    public abstract void abstractMethod1();//抽象方法1
    public abstract void abstractMethod2();//抽象方法2
}
